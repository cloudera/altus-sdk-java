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

package com.cloudera.altus.dataware.api;

import com.cloudera.altus.client.AltusClientBuilder;

/**
* This class can be used to build a DatawareClient object.
**/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-09-05T21:19:10.984-07:00")
public class DatawareClientBuilder extends AltusClientBuilder<DatawareClientBuilder> {

  private DatawareClientBuilder() {
   super(DatawareClient.SERVICE_NAME);
  }

  /**
   * Return the client with all the default configuration settings.
   * @return DatawareClient
   */
  public static DatawareClient defaultClient() {
    return defaultBuilder().build();
  }

  /**
   * Return a builder with all the default configuration settings. The settings can then be
   * customized as needed.
   * @return DatawareClientBuilder
   */
  public static DatawareClientBuilder defaultBuilder() {
    return new DatawareClientBuilder();
  }

  /**
   * Return the client object with all the configurations provided.
   * @return DatawareClient
   */
  public DatawareClient build() {
    return new DatawareClient(
        getAltusCredentials().getCredentials(),
        getAltusEndPoint(),
        getAltusClientConfiguration());
  }

  @Override
  public DatawareClientBuilder self() {
    return this;
  }
}