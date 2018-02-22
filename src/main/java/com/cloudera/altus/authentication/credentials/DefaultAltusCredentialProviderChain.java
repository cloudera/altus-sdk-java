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

/**
 * Altus credential provider chain that looks for credentials in the following
 * order: environment variables, system properties then credential profiles
 * file. See the individual credential provider classes for more detail.
 */
public class DefaultAltusCredentialProviderChain
  extends AltusCredentialsProviderChain {

  private static final DefaultAltusCredentialProviderChain INSTANCE =
      new DefaultAltusCredentialProviderChain();

  /**
   * Constructor.
   */
  public DefaultAltusCredentialProviderChain() {
    super(new AltusEnvironmentVariableCredentialsProvider(),
          new AltusSystemPropertiesCredentialsProvider(),
          new AltusProfileCredentialsProvider());
  }

  /**
   * Gets the default credential provider chain.
   * @return the default credential provider chain
   */
  public static AltusCredentialsProviderChain getInstance() {
    return INSTANCE;
  }
}
