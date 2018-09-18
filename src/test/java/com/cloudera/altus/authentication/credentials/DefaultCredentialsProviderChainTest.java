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
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junitpioneer.jupiter.TempDirectory;
import org.junitpioneer.jupiter.TempDirectory.TempDir;

public class DefaultCredentialsProviderChainTest {

  private String originalUserHome = null;

  @BeforeEach
  @ExtendWith(TempDirectory.class)
  public void setEnvVariables(@TempDir Path folder) {
    //override user home in case server has existing altus credentials file
    originalUserHome = System.getProperty("user.home");
    System.setProperty("user.home", folder.toAbsolutePath().toString());
  }

  @AfterEach
  public void resetEnvVariables() {
    System.setProperty("user.home",originalUserHome);
  }

  @Test
  @ExtendWith(TempDirectory.class)
  public void testNoCredentials() {
    DefaultAltusCredentialProviderChain cp = new DefaultAltusCredentialProviderChain();

    Throwable e = assertThrows(AltusClientException.class, () -> {
      cp.getCredentials();
    });
    assertEquals("Unable to load credentials from provider files", e.getMessage());
  }

  @Test
  @ExtendWith(TempDirectory.class)
  public void testValidEnvironmentVariableCredentials() {
    Map<String, String> newEnvironment = Maps.newHashMap();
    String accessKeyId = UUID.randomUUID().toString();
    newEnvironment.put(
        AltusEnvironmentVariableCredentialsProvider.ALTUS_ACCESS_KEY_ID,
        accessKeyId);
    newEnvironment.put(
        AltusEnvironmentVariableCredentialsProvider.ALTUS_PRIVATE_KEY,
        AltusSDKTestUtils.getEncodedRSAPrivateKey());
    AltusSDKTestUtils.setEnv(newEnvironment);

    DefaultAltusCredentialProviderChain cp = new DefaultAltusCredentialProviderChain();
    AltusCredentials credentials = cp.getCredentials();

    assertEquals(accessKeyId, credentials.getAccessKeyId());
    assertEquals(AltusSDKTestUtils.getRSAPrivateKey(), credentials.getPrivateKey());

    newEnvironment = Maps.newHashMap();
    AltusSDKTestUtils.setEnv(newEnvironment);
  }

  @Test
  @ExtendWith(TempDirectory.class)
  public void testValidSystemPropertiesCredentials() {
    String accessKeyId = UUID.randomUUID().toString();
    System.setProperty(
        AltusSystemPropertiesCredentialsProvider.ALTUS_ACCESS_KEY_ID,
        accessKeyId);
    System.setProperty(
        AltusSystemPropertiesCredentialsProvider.ALTUS_PRIVATE_KEY,
        AltusSDKTestUtils.getEncodedRSAPrivateKey());

    DefaultAltusCredentialProviderChain cp = new DefaultAltusCredentialProviderChain();
    AltusCredentials credentials = cp.getCredentials();

    assertEquals(accessKeyId, credentials.getAccessKeyId());
    assertEquals(AltusSDKTestUtils.getRSAPrivateKey(), credentials.getPrivateKey());

    System.clearProperty(
        AltusSystemPropertiesCredentialsProvider.ALTUS_PRIVATE_KEY);
    System.clearProperty(
        AltusSystemPropertiesCredentialsProvider.ALTUS_ACCESS_KEY_ID);
  }

  @Test
  @ExtendWith(TempDirectory.class)
  public void testValidProfileCredentials(@TempDir Path folder) {
    AltusSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    DefaultAltusCredentialProviderChain cp = new DefaultAltusCredentialProviderChain();
    AltusCredentials credentials = cp.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(AltusSDKTestUtils.DEFAULT_CREDENTIALS_KEY_ID,
        credentials.getAccessKeyId());
  }

}
