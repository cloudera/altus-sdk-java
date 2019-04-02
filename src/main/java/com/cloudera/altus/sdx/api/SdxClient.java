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

import javax.ws.rs.core.GenericType;
import com.cloudera.altus.AltusClientException;
import com.cloudera.altus.authentication.credentials.AltusCredentials;
import com.cloudera.altus.client.AltusClient;
import com.cloudera.altus.client.AltusClientConfiguration;
import com.cloudera.altus.sdx.model.CreateConfiguredNamespaceRequest;
import com.cloudera.altus.sdx.model.CreateConfiguredNamespaceResponse;
import com.cloudera.altus.sdx.model.DeleteNamespaceRequest;
import com.cloudera.altus.sdx.model.DeleteNamespaceResponse;
import com.cloudera.altus.sdx.model.Error;
import com.cloudera.altus.sdx.model.ListNamespacesRequest;
import com.cloudera.altus.sdx.model.ListNamespacesResponse;

@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-04-02T14:15:32.273-07:00")
public class SdxClient extends AltusClient {

  public static final String SERVICE_NAME = "sdx";

  public SdxClient(
      AltusCredentials credentials,
      String endPoint,
      AltusClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  /**
   * Creates a new configured namespace.
   * @param input
   * @return CreateConfiguredNamespaceResponse
   */
  public CreateConfiguredNamespaceResponse createConfiguredNamespace(CreateConfiguredNamespaceRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling createConfiguredNamespace");
     }
    return this.invokeAPI("/sdx/createConfiguredNamespace", input, new GenericType<CreateConfiguredNamespaceResponse>(){});
  }

  /**
   * Deletes an existing namespace.
   * @param input
   * @return DeleteNamespaceResponse
   */
  public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling deleteNamespace");
     }
    return this.invokeAPI("/sdx/deleteNamespace", input, new GenericType<DeleteNamespaceResponse>(){});
  }

  /**
   * Lists namespaces.
   * @param input
   * @return ListNamespacesResponse
   */
  public ListNamespacesResponse listNamespaces(ListNamespacesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listNamespaces");
     }
    return this.invokeAPI("/sdx/listNamespaces", input, new GenericType<ListNamespacesResponse>(){});
  }
}
