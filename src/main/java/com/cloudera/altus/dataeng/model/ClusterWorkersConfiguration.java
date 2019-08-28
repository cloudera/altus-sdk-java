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

package com.cloudera.altus.dataeng.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import com.cloudera.altus.dataeng.model.AWSInstanceConfiguration;
import com.cloudera.altus.dataeng.model.AzureInstanceConfiguration;

/**
 * Workers group configuration.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-08-28T09:14:05.003-07:00")
public class ClusterWorkersConfiguration  {

  /**
   * AWS-specific instance configuration.
   **/
  private AWSInstanceConfiguration awsDetails = null;

  /**
   * Azure-specific instance configuration.
   **/
  private AzureInstanceConfiguration azureDetails = null;

  /**
   * Getter for awsDetails.
   * AWS-specific instance configuration.
   **/
  @JsonProperty("awsDetails")
  public AWSInstanceConfiguration getAwsDetails() {
    return awsDetails;
  }

  /**
   * Setter for awsDetails.
   * AWS-specific instance configuration.
   **/
  public void setAwsDetails(AWSInstanceConfiguration awsDetails) {
    this.awsDetails = awsDetails;
  }

  /**
   * Getter for azureDetails.
   * Azure-specific instance configuration.
   **/
  @JsonProperty("azureDetails")
  public AzureInstanceConfiguration getAzureDetails() {
    return azureDetails;
  }

  /**
   * Setter for azureDetails.
   * Azure-specific instance configuration.
   **/
  public void setAzureDetails(AzureInstanceConfiguration azureDetails) {
    this.azureDetails = azureDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterWorkersConfiguration clusterWorkersConfiguration = (ClusterWorkersConfiguration) o;
    if (!Objects.equals(this.awsDetails, clusterWorkersConfiguration.awsDetails)) {
      return false;
    }
    if (!Objects.equals(this.azureDetails, clusterWorkersConfiguration.azureDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsDetails, azureDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterWorkersConfiguration {\n");
    sb.append("    awsDetails: ").append(toIndentedString(awsDetails)).append("\n");
    sb.append("    azureDetails: ").append(toIndentedString(azureDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

