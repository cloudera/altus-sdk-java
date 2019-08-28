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

import com.cloudera.altus.AltusClientException;
import com.cloudera.altus.util.AltusSDKTestUtils;
import com.google.common.collect.Maps;

import java.nio.file.Path;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class AltusProfileCredentialsProviderTest {

  private String originalUserHome = null;

  @BeforeEach
  public void setEnvVariables(@TempDir Path folder) {
    originalUserHome = System.getProperty("user.home");
    System.setProperty("user.home",
        folder.toAbsolutePath().toString());
    Map<String, String> newEnvironment = Maps.newHashMap();
    AltusSDKTestUtils.setEnv(newEnvironment);
  }

  @AfterEach
  public void resetEnvVariables() {
    System.setProperty("user.home", originalUserHome);
  }

  @Test
  public void readFromDefaultLocationDefaultProfileName(@TempDir Path folder) {
    AltusSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    AltusProfileCredentialsProvider credentialsProvider =
        new AltusProfileCredentialsProvider();
    AltusCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(AltusSDKTestUtils.DEFAULT_CREDENTIALS_KEY_ID,
        credentials.getAccessKeyId());
  }

  @Test
  public void readFromDefaultLocationSpecifiedProfileName(@TempDir Path folder) {
    AltusSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    AltusProfileCredentialsProvider credentialsProvider =
        new AltusProfileCredentialsProvider("altus_test");
    AltusCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(AltusSDKTestUtils.TEST_CREDENTIALS_KEY_ID,
        credentials.getAccessKeyId());
  }

  @Test
  public void invalidProfile(@TempDir Path folder) {
    AltusSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    AltusProfileCredentialsProvider credentialsProvider =
        new AltusProfileCredentialsProvider("nonExistingName");
    Throwable e = assertThrows(AltusClientException.class, () -> {
      credentialsProvider.getCredentials();
    });
    assertEquals("Unable to find profile named nonExistingName",
                 e.getMessage());
  }

  @Test
  public void invalidEnvVarProfile(@TempDir Path folder) {
    AltusSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    Map<String, String> newEnvironment = Maps.newHashMap();
    newEnvironment.put(AltusProfileCredentialsProvider.ALTUS_DEFAULT_PROFILE,
        "newEnvironmentprofile");
    AltusSDKTestUtils.setEnv(newEnvironment);
    AltusProfileCredentialsProvider credentialsProvider =
        new AltusProfileCredentialsProvider();
    Throwable e = assertThrows(AltusClientException.class, () -> {
      credentialsProvider.getCredentials();
    });
    assertEquals("Unable to find profile named newEnvironmentprofile",
                 e.getMessage());
  }

  @Test
  public void readFromEnvVar(@TempDir Path folder) {
    Map<String, String> newEnvironment = Maps.newHashMap();
    newEnvironment.put(AltusProfileCredentialsProvider.ALTUS_DEFAULT_PROFILE,
        "altus_test");
    AltusSDKTestUtils.setEnv(newEnvironment);
    AltusSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    AltusProfileCredentialsProvider credentialsProvider =
        new AltusProfileCredentialsProvider();
    AltusCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(AltusSDKTestUtils.TEST_CREDENTIALS_KEY_ID,
        credentials.getAccessKeyId());
  }

  @Test
  public void readFromSpecifiedPath(@TempDir Path folder) {
    Path credentialsPath = AltusSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    AltusProfileCredentialsProvider credentialsProvider =
        new AltusProfileCredentialsProvider(credentialsPath.toString(), "default");
    AltusCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(AltusSDKTestUtils.DEFAULT_CREDENTIALS_PRIVATE_KEY);
    assertEquals(AltusSDKTestUtils.DEFAULT_CREDENTIALS_KEY_ID,
        credentials.getAccessKeyId());
  }

}
