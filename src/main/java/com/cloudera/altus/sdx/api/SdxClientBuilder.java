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

package com.cloudera.altus.sdx.api;

import com.cloudera.altus.client.AltusClientBuilder;

/**
* This class can be used to build a SdxClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-01-29T13:30:13.430-08:00")
public class SdxClientBuilder extends AltusClientBuilder<SdxClientBuilder> {

  private SdxClientBuilder() {
   super(SdxClient.SERVICE_NAME);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return SdxClient
   */
  public static SdxClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return SdxClientBuilder
   */
  public static SdxClientBuilder defaultBuilder() {
    return new SdxClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return SdxClient
   */
  public SdxClient build() {
    return new SdxClient(
        getAltusCredentials().getCredentials(),
        getAltusEndPoint(),
        getAltusClientConfiguration());
  }

  @Override
  public SdxClientBuilder self() {
    return this;
  }
}