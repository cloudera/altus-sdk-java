/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.altus.client;

import static com.cloudera.altus.ValidationUtils.checkNotNullAndThrow;
import static net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable.ED_25519;

import com.cloudera.altus.AltusClientException;

import java.io.IOException;
import java.io.StringReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSASecurityProvider;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;

/**
 * Utility methods for interacting with Altus credentials.
 */
public class CredentialUtilities {

  /** The Ed25519 key is 44 bytes long (32 bytes encoded in base 64). */
  private static final int ED25519_KEY_LENGTH = 44;
  private static final EdDSANamedCurveSpec ED25519 =
      EdDSANamedCurveTable.getByName(ED_25519);

  private CredentialUtilities() {}

  /**
   * Decodes a private key from the string format used in Altus profiles.
   * @param privateKey the private key as a single line string
   * @return the private key
   */
  public static PrivateKey decodePrivateKey(String privateKey) {
    checkNotNullAndThrow(privateKey);
    if (privateKey.length() == ED25519_KEY_LENGTH) {
      return decodeEd25519PrivateKey(privateKey);
    } else {
      return decodeRSAPrivateKey(privateKey);
    }
  }

  private static PrivateKey decodeRSAPrivateKey(String privateKey) {
    privateKey = privateKey.replace("\\n", "\n");
    try (PemReader pemReader = new PemReader(new StringReader(privateKey))) {
      PemObject pemObject = pemReader.readPemObject();
      if (pemObject == null) {
        throw new AltusClientException("Invalid private key ");
      }
      PKCS8EncodedKeySpec privateKeySpec =
              new PKCS8EncodedKeySpec(pemObject.getContent());
      KeyFactory factory = KeyFactory.getInstance("RSA");
      return factory.generatePrivate(privateKeySpec);
    } catch (IOException |
            NoSuchAlgorithmException |
            InvalidKeySpecException e) {
      throw new AltusClientException(
          "Unable to generate private key " + e.getMessage(), e);
    }
  }

  private static PrivateKey decodeEd25519PrivateKey(String privateKey) {
    /*
     * Security providers are funny beasts. Java does careful checking to
     * ensure you don't add a provider twice, but it does so by name only.
     * So if you have a weird situation where you're doing class reloading,
     * you might find yourself getting errors where the provider says a
     * key class is unrecognised, even though it's clearly the right type.
     * In such a situation, you need to remove the provider as part of the
     * class reloading exercise.
     */
    Security.addProvider(new EdDSASecurityProvider());

    byte[] seed = Base64.getDecoder().decode(privateKey);
    try {
      EdDSAPrivateKeySpec privateKeySpec = new EdDSAPrivateKeySpec(seed, ED25519);
      KeyFactory factory = KeyFactory.getInstance(EdDSAPrivateKey.KEY_ALGORITHM);
      return factory.generatePrivate(privateKeySpec);
    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
      throw new AltusClientException(
          "Unable to generate private key " + e.getMessage(), e);
    }
  }
}
