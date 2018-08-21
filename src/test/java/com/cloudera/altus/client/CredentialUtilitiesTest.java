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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cloudera.altus.AltusClientException;
import com.cloudera.altus.util.AltusSDKTestUtils;

import org.junit.jupiter.api.Test;

public class CredentialUtilitiesTest {

  @Test
  public void testWithNullKey() {
    Throwable e = assertThrows(AltusClientException.class, () -> {
      CredentialUtilities.decodePrivateKey(null);
    });
    assertEquals("Argument is null", e.getMessage());
  }

  @Test
  public void testWithInvalidKey() {
    assertThrows(AltusClientException.class, () -> {
      CredentialUtilities.decodePrivateKey("blah blah blah");
    });
  }

  @Test
  public void testWithValidKey() {
    AltusSDKTestUtils.getPrivateKey();
  }
}
