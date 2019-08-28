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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.altus.util.AltusSDKTestUtils;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class AltusEnvironmentVariableCredentialsProviderTest {

  @AfterEach
  public void resetEnvVariables() {
    AltusSDKTestUtils.setEnv(new HashMap<>());
  }

  @Test
  public void testGetCredentialsWithNullIdAndPrivateKeys() {
    Map<String, String> newenv = new HashMap<>();
    AltusSDKTestUtils.setEnv(newenv);
    AltusEnvironmentVariableCredentialsProvider aenvcp =
        new AltusEnvironmentVariableCredentialsProvider();
    Throwable e = assertThrows(IllegalArgumentException.class,
                               aenvcp::getCredentials);
    assertEquals("Invalid values for Altus credentials environment " +
                 "variables ALTUS_ACCESS_KEY_ID and ALTUS_PRIVATE_KEY",
                 e.getMessage());
  }

  @Test
  public void testGetCredentialsForAltusKeyIdMissing() {
    Map<String, String> newenv = new HashMap<>();
    newenv.put(AltusEnvironmentVariableCredentialsProvider.ALTUS_PRIVATE_KEY,
        "");
    AltusSDKTestUtils.setEnv(newenv);
    AltusEnvironmentVariableCredentialsProvider aenvcp =
        new AltusEnvironmentVariableCredentialsProvider();
    Throwable e = assertThrows(IllegalArgumentException.class,
                               aenvcp::getCredentials);
    assertEquals("Invalid values for Altus credentials environment " +
                 "variables ALTUS_ACCESS_KEY_ID and ALTUS_PRIVATE_KEY",
                 e.getMessage());
  }

  @Test
  public void testGetCredentialsForAltusPrivateKeyMissing() {
    Map<String, String> newenv = new HashMap<>();
    newenv.put(AltusEnvironmentVariableCredentialsProvider.ALTUS_ACCESS_KEY_ID,
        "c2cf4ffb-9f0a-42bf-938b-f50085e63883");
    AltusSDKTestUtils.setEnv(newenv);
    AltusEnvironmentVariableCredentialsProvider aenvcp =
        new AltusEnvironmentVariableCredentialsProvider();
    Throwable e = assertThrows(IllegalArgumentException.class,
                               aenvcp::getCredentials);
    assertEquals("Invalid values for Altus credentials environment " +
                 "variables ALTUS_ACCESS_KEY_ID and ALTUS_PRIVATE_KEY",
                 e.getMessage());
  }

  @Test
  public void testValidCredentials() {
    Map<String, String> newenv = new HashMap<>();
    newenv.put(AltusEnvironmentVariableCredentialsProvider.ALTUS_ACCESS_KEY_ID,
        "somekey");
    newenv.put(AltusEnvironmentVariableCredentialsProvider.ALTUS_PRIVATE_KEY,
        AltusSDKTestUtils.getEncodedRSAPrivateKey());
    AltusSDKTestUtils.setEnv(newenv);
    AltusEnvironmentVariableCredentialsProvider aenvcp =
        new AltusEnvironmentVariableCredentialsProvider();
    AltusCredentials credentials = aenvcp.getCredentials();
    assertNotNull(credentials);
  }
}
