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

package com.cloudera.altus.authentication.credentials;

import static com.cloudera.altus.authentication.credentials.AltusSystemPropertiesCredentialsProvider.ALTUS_ACCESS_KEY_ID;
import static com.cloudera.altus.authentication.credentials.AltusSystemPropertiesCredentialsProvider.ALTUS_PRIVATE_KEY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.altus.AltusClientException;
import com.cloudera.altus.util.AltusSDKTestUtils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AltusSystemPropertiesCredentialsProviderTest {

  private String originalAccessKeyId = null;
  private String originalPrivateKey = null;

  @BeforeEach
  public void setEnvVariables() {
    originalAccessKeyId = System.getProperty(ALTUS_ACCESS_KEY_ID);
    originalPrivateKey = System.getProperty(ALTUS_PRIVATE_KEY);
    System.clearProperty(ALTUS_PRIVATE_KEY);
    System.clearProperty(ALTUS_ACCESS_KEY_ID);
  }

  @AfterEach
  public void resetEnvVariables() {
    if (originalAccessKeyId != null) {
      System.setProperty(ALTUS_ACCESS_KEY_ID, originalAccessKeyId);
    }
    if (originalPrivateKey != null) {
      System.setProperty(ALTUS_PRIVATE_KEY, originalPrivateKey);
    }
  }

  @Test
  public void testGetCredentialsWithNullIdAndPrivateKeys() {
    AltusSystemPropertiesCredentialsProvider aspcp =
        new AltusSystemPropertiesCredentialsProvider();
    Throwable e = assertThrows(AltusClientException.class, () -> {
      aspcp.getCredentials();
    });
    assertEquals("Unable to load Altus credentials from Java system " +
                 "properties " + ALTUS_ACCESS_KEY_ID + " and " + ALTUS_PRIVATE_KEY,
                 e.getMessage());
  }

  @Test
  public void testGetCredentialsForAltusKeyIdMissing() {
    System.setProperty(ALTUS_PRIVATE_KEY, "");
    AltusSystemPropertiesCredentialsProvider aspcp =
        new AltusSystemPropertiesCredentialsProvider();
    Throwable e = assertThrows(AltusClientException.class, () -> {
      aspcp.getCredentials();
    });
    assertEquals("Unable to load Altus credentials from Java system " +
                 "properties " + ALTUS_ACCESS_KEY_ID + " and " + ALTUS_PRIVATE_KEY,
                 e.getMessage());
  }

  @Test
  public void testGetCredentialsForAltusPrivateKeyMissing() {
    System.setProperty(ALTUS_ACCESS_KEY_ID,
        "c2cf4ffb-9f0a-42bf-938b-f50085e63883");
    AltusSystemPropertiesCredentialsProvider aspcp =
        new AltusSystemPropertiesCredentialsProvider();
    Throwable e = assertThrows(AltusClientException.class, () -> {
      aspcp.getCredentials();
    });
    assertEquals("Unable to load Altus credentials from Java system " +
                 "properties " + ALTUS_ACCESS_KEY_ID + " and " + ALTUS_PRIVATE_KEY,
                 e.getMessage());
  }

  @Test
  public void testValidCredentials() {
    System.setProperty(ALTUS_ACCESS_KEY_ID, "somekey");
    System.setProperty(ALTUS_PRIVATE_KEY,
        AltusSDKTestUtils.getEncodedRSAPrivateKey());
    AltusSystemPropertiesCredentialsProvider aspcp =
        new AltusSystemPropertiesCredentialsProvider();
    AltusCredentials credentials = aspcp.getCredentials();
    assertNotNull(credentials);
  }
}
