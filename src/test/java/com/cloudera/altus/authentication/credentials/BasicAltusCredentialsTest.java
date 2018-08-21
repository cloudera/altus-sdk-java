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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.altus.AltusClientException;
import com.cloudera.altus.util.AltusSDKTestUtils;

import java.security.PrivateKey;

import org.junit.jupiter.api.Test;

public class BasicAltusCredentialsTest {

  @Test
  public void testNullKeyId() {
    Throwable e = assertThrows(AltusClientException.class, () -> {
      new BasicAltusCredentials(null, AltusSDKTestUtils.getPrivateKey());
    });
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testNullPrivateKey() {
    Throwable e = assertThrows(AltusClientException.class, () -> {
      new BasicAltusCredentials("foo", (PrivateKey) null);
    });
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testNullPrivateKeyString() {
    Throwable e = assertThrows(AltusClientException.class, () -> {
      new BasicAltusCredentials("foo", (String) null);
    });
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testExpectedValues() {
    PrivateKey privateKey = AltusSDKTestUtils.getPrivateKey();
    BasicAltusCredentials credentials =
        new BasicAltusCredentials("foo", privateKey);
    assertEquals("foo", credentials.getAccessKeyId());
    assertEquals(privateKey, credentials.getPrivateKey());
  }
}
