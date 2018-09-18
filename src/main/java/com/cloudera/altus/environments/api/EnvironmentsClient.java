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

package com.cloudera.altus.environments.api;

import javax.ws.rs.core.GenericType;
import com.cloudera.altus.AltusClientException;
import com.cloudera.altus.authentication.credentials.AltusCredentials;
import com.cloudera.altus.client.AltusClient;
import com.cloudera.altus.client.AltusClientConfiguration;
import com.cloudera.altus.environments.model.CreateAWSEnvironmentRequest;
import com.cloudera.altus.environments.model.CreateAWSEnvironmentResponse;
import com.cloudera.altus.environments.model.CreateAzureEnvironmentRequest;
import com.cloudera.altus.environments.model.CreateAzureEnvironmentResponse;
import com.cloudera.altus.environments.model.DeleteEnvironmentRequest;
import com.cloudera.altus.environments.model.DeleteEnvironmentResponse;
import com.cloudera.altus.environments.model.Error;
import com.cloudera.altus.environments.model.GetClientAccountSetupCloudFormationTemplateRequest;
import com.cloudera.altus.environments.model.GetClientAccountSetupCloudFormationTemplateResponse;
import com.cloudera.altus.environments.model.GetInfoForAWSCrossAccountAccessRequest;
import com.cloudera.altus.environments.model.GetInfoForAWSCrossAccountAccessResponse;
import com.cloudera.altus.environments.model.GetInfoForAzureCrossAccountAccessRequest;
import com.cloudera.altus.environments.model.GetInfoForAzureCrossAccountAccessResponse;
import com.cloudera.altus.environments.model.ListEnvironmentsRequest;
import com.cloudera.altus.environments.model.ListEnvironmentsResponse;

@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-09-18T10:40:17.349-07:00")
public class EnvironmentsClient extends AltusClient {

  public static final String SERVICE_NAME = "environments";

  public EnvironmentsClient(
      AltusCredentials credentials,
      String endPoint,
      AltusClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  /**
   * Creates a new AWS environment.
   * @param input
   * @return CreateAWSEnvironmentResponse
   */
  public CreateAWSEnvironmentResponse createAWSEnvironment(CreateAWSEnvironmentRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling createAWSEnvironment");
     }
    return this.invokeAPI("/environments/createAWSEnvironment", input, new GenericType<CreateAWSEnvironmentResponse>(){});
  }

  /**
   * Creates a new Azure environment.
   * @param input
   * @return CreateAzureEnvironmentResponse
   */
  public CreateAzureEnvironmentResponse createAzureEnvironment(CreateAzureEnvironmentRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling createAzureEnvironment");
     }
    return this.invokeAPI("/environments/createAzureEnvironment", input, new GenericType<CreateAzureEnvironmentResponse>(){});
  }

  /**
   * Deletes an environment.
   * @param input
   * @return DeleteEnvironmentResponse
   */
  public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling deleteEnvironment");
     }
    return this.invokeAPI("/environments/deleteEnvironment", input, new GenericType<DeleteEnvironmentResponse>(){});
  }

  /**
   * Retrieves the CloudFormation template that creates all necessary resources in client&#39;s account.
   * @param input
   * @return GetClientAccountSetupCloudFormationTemplateResponse
   */
  public GetClientAccountSetupCloudFormationTemplateResponse getClientAccountSetupCloudFormationTemplate(GetClientAccountSetupCloudFormationTemplateRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling getClientAccountSetupCloudFormationTemplate");
     }
    return this.invokeAPI("/environments/getClientAccountSetupCloudFormationTemplate", input, new GenericType<GetClientAccountSetupCloudFormationTemplateResponse>(){});
  }

  /**
   * Retrieves the information required to set up an AWS cross-account access role.
   * @param input
   * @return GetInfoForAWSCrossAccountAccessResponse
   */
  public GetInfoForAWSCrossAccountAccessResponse getInfoForAWSCrossAccountAccess(GetInfoForAWSCrossAccountAccessRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling getInfoForAWSCrossAccountAccess");
     }
    return this.invokeAPI("/environments/getInfoForAWSCrossAccountAccess", input, new GenericType<GetInfoForAWSCrossAccountAccessResponse>(){});
  }

  /**
   * Retrieves the information required to perform the Azure consent workflow.
   * @param input
   * @return GetInfoForAzureCrossAccountAccessResponse
   */
  public GetInfoForAzureCrossAccountAccessResponse getInfoForAzureCrossAccountAccess(GetInfoForAzureCrossAccountAccessRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling getInfoForAzureCrossAccountAccess");
     }
    return this.invokeAPI("/environments/getInfoForAzureCrossAccountAccess", input, new GenericType<GetInfoForAzureCrossAccountAccessResponse>(){});
  }

  /**
   * Lists environments.
   * @param input
   * @return ListEnvironmentsResponse
   */
  public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listEnvironments");
     }
    return this.invokeAPI("/environments/listEnvironments", input, new GenericType<ListEnvironmentsResponse>(){});
  }
}
