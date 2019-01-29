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

import javax.ws.rs.core.GenericType;
import com.cloudera.altus.AltusClientException;
import com.cloudera.altus.authentication.credentials.AltusCredentials;
import com.cloudera.altus.client.AltusClient;
import com.cloudera.altus.client.AltusClientConfiguration;
import com.cloudera.altus.dataware.model.CreateAWSClusterRequest;
import com.cloudera.altus.dataware.model.CreateAWSClusterResponse;
import com.cloudera.altus.dataware.model.CreateAzureClusterRequest;
import com.cloudera.altus.dataware.model.CreateAzureClusterResponse;
import com.cloudera.altus.dataware.model.DeleteClusterRequest;
import com.cloudera.altus.dataware.model.DeleteClusterResponse;
import com.cloudera.altus.dataware.model.DescribeClusterRequest;
import com.cloudera.altus.dataware.model.DescribeClusterResponse;
import com.cloudera.altus.dataware.model.Error;
import com.cloudera.altus.dataware.model.GetClusterAccessTokensRequest;
import com.cloudera.altus.dataware.model.GetClusterAccessTokensResponse;
import com.cloudera.altus.dataware.model.ListClustersRequest;
import com.cloudera.altus.dataware.model.ListClustersResponse;

@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-01-29T13:30:12.733-08:00")
public class DatawareClient extends AltusClient {

  public static final String SERVICE_NAME = "dataware";

  public DatawareClient(
      AltusCredentials credentials,
      String endPoint,
      AltusClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  /**
   * Creates a new AWS cluster.
   * @param input
   * @return CreateAWSClusterResponse
   */
  public CreateAWSClusterResponse createAWSCluster(CreateAWSClusterRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling createAWSCluster");
     }
    return this.invokeAPI("/dataware/createAWSCluster", input, new GenericType<CreateAWSClusterResponse>(){});
  }

  /**
   * Creates a new Azure cluster.
   * @param input
   * @return CreateAzureClusterResponse
   */
  public CreateAzureClusterResponse createAzureCluster(CreateAzureClusterRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling createAzureCluster");
     }
    return this.invokeAPI("/dataware/createAzureCluster", input, new GenericType<CreateAzureClusterResponse>(){});
  }

  /**
   * Deletes a cluster.
   * @param input
   * @return DeleteClusterResponse
   */
  public DeleteClusterResponse deleteCluster(DeleteClusterRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling deleteCluster");
     }
    return this.invokeAPI("/dataware/deleteCluster", input, new GenericType<DeleteClusterResponse>(){});
  }

  /**
   * Describe a cluster.
   * @param input
   * @return DescribeClusterResponse
   */
  public DescribeClusterResponse describeCluster(DescribeClusterRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling describeCluster");
     }
    return this.invokeAPI("/dataware/describeCluster", input, new GenericType<DescribeClusterResponse>(){});
  }

  /**
   * Retrieves the access tokens to the specified cluster.
   * @param input
   * @return GetClusterAccessTokensResponse
   */
  public GetClusterAccessTokensResponse getClusterAccessTokens(GetClusterAccessTokensRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling getClusterAccessTokens");
     }
    return this.invokeAPI("/dataware/getClusterAccessTokens", input, new GenericType<GetClusterAccessTokensResponse>(){});
  }

  /**
   * Lists clusters.
   * @param input
   * @return ListClustersResponse
   */
  public ListClustersResponse listClusters(ListClustersRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listClusters");
     }
    return this.invokeAPI("/dataware/listClusters", input, new GenericType<ListClustersResponse>(){});
  }
}
