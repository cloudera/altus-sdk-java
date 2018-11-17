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

package com.cloudera.altus.authentication.credentials.profile.path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cloudera.altus.AltusClientException;
import com.cloudera.altus.authentication.credentials.AltusCredentials;
import com.cloudera.altus.authentication.credentials.AltusProfileCredentialsProvider;
import com.cloudera.altus.authentication.credentials.profile.AltusProfileConfigFile;
import com.cloudera.altus.util.AltusSDKTestUtils;

import java.io.File;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junitpioneer.jupiter.TempDirectory;
import org.junitpioneer.jupiter.TempDirectory.TempDir;

public class AltusProfileConfigFileTest {

  @Test
  public void testNullConfigFileName() {
    Throwable e = assertThrows(AltusClientException.class, () -> {
      new AltusProfileConfigFile((String)null);
    });
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testNullConfigFileHandle() {
    Throwable e = assertThrows(AltusClientException.class, () -> {
      new AltusProfileConfigFile((File)null);
    });
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  @ExtendWith(TempDirectory.class)
  public void testNonExistantFileName(@TempDir Path folder) {
    Throwable e = assertThrows(AltusClientException.class, () -> {
      new AltusProfileConfigFile(folder.toAbsolutePath() + "/junk.txt");
    });
    assertTrue(e.getMessage().startsWith("Error loading Altus profile. Altus " +
                                         "profile file not found at:"));
  }

  @Test
  @ExtendWith(TempDirectory.class)
  public void testNonExistantFileHandle(@TempDir Path folder) {
    Throwable e = assertThrows(AltusClientException.class, () -> {
      new AltusProfileConfigFile(
          new File(folder.toAbsolutePath().toString(), "junk.txt"));
    });
    assertTrue(e.getMessage().startsWith("Error loading Altus profile. Altus " +
                                         "profile file not found at:"));
  }

  @Test
  @ExtendWith(TempDirectory.class)
  public void testNonExistantProfileName(@TempDir Path folder) {
    Path credentialsPath = AltusSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    AltusProfileConfigFile config =
        new AltusProfileConfigFile(credentialsPath.toString());
    Throwable e = assertThrows(AltusClientException.class, () -> {
      config.getCredentials("foobar");
    });
    assertEquals("Unable to find profile named foobar", e.getMessage());
  }

  @Test
  @ExtendWith(TempDirectory.class)
  public void testValidProfile(@TempDir Path folder) {
    Path credentialsPath = AltusSDKTestUtils.copyTestCredentialsFileToFolder(folder);
    AltusProfileCredentialsProvider credentialsProvider =
        new AltusProfileCredentialsProvider(credentialsPath.toString(), "default");
    AltusCredentials credentials = credentialsProvider.getCredentials();
    assertNotNull(credentials.getPrivateKey());
    assertEquals(AltusSDKTestUtils.DEFAULT_CREDENTIALS_KEY_ID,
        credentials.getAccessKeyId());
  }
}
