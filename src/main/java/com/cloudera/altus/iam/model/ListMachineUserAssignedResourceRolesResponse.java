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

package com.cloudera.altus.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import com.cloudera.altus.iam.model.ResourceAssignment;
import java.util.*;

/**
 * Response object for a list machine user assigned roles request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-09-05T21:19:11.877-07:00")
public class ListMachineUserAssignedResourceRolesResponse extends AltusResponse {

  /**
   * The user's resource assignments.
   **/
  private List<ResourceAssignment> resourceAssignments = new ArrayList<ResourceAssignment>();

  /**
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  private String nextToken = null;

  /**
   * Getter for resourceAssignments.
   * The user&#39;s resource assignments.
   **/
  @JsonProperty("resourceAssignments")
  public List<ResourceAssignment> getResourceAssignments() {
    return resourceAssignments;
  }

  /**
   * Setter for resourceAssignments.
   * The user&#39;s resource assignments.
   **/
  public void setResourceAssignments(List<ResourceAssignment> resourceAssignments) {
    this.resourceAssignments = resourceAssignments;
  }

  /**
   * Getter for nextToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The token to use when requesting the next set of results. If not present, there are no additional results.
   **/
  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMachineUserAssignedResourceRolesResponse listMachineUserAssignedResourceRolesResponse = (ListMachineUserAssignedResourceRolesResponse) o;
    if (!Objects.equals(this.resourceAssignments, listMachineUserAssignedResourceRolesResponse.resourceAssignments)) {
      return false;
    }
    if (!Objects.equals(this.nextToken, listMachineUserAssignedResourceRolesResponse.nextToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceAssignments, nextToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMachineUserAssignedResourceRolesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resourceAssignments: ").append(toIndentedString(resourceAssignments)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

