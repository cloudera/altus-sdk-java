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

package com.cloudera.altus.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import com.cloudera.altus.environments.model.InfoForAWSCrossAccountAccess;

/**
 * Response object for a GetInfoForAWSCrossAccountAccess request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-04-02T14:15:32.131-07:00")
public class GetInfoForAWSCrossAccountAccessResponse extends AltusResponse {

  /**
   * The information required for setting up an AWS cross-account access.
   **/
  private InfoForAWSCrossAccountAccess infoForAWSCrossAccountAccess = null;

  /**
   * Getter for infoForAWSCrossAccountAccess.
   * The information required for setting up an AWS cross-account access.
   **/
  @JsonProperty("infoForAWSCrossAccountAccess")
  public InfoForAWSCrossAccountAccess getInfoForAWSCrossAccountAccess() {
    return infoForAWSCrossAccountAccess;
  }

  /**
   * Setter for infoForAWSCrossAccountAccess.
   * The information required for setting up an AWS cross-account access.
   **/
  public void setInfoForAWSCrossAccountAccess(InfoForAWSCrossAccountAccess infoForAWSCrossAccountAccess) {
    this.infoForAWSCrossAccountAccess = infoForAWSCrossAccountAccess;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInfoForAWSCrossAccountAccessResponse getInfoForAWSCrossAccountAccessResponse = (GetInfoForAWSCrossAccountAccessResponse) o;
    if (!Objects.equals(this.infoForAWSCrossAccountAccess, getInfoForAWSCrossAccountAccessResponse.infoForAWSCrossAccountAccess)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(infoForAWSCrossAccountAccess, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInfoForAWSCrossAccountAccessResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    infoForAWSCrossAccountAccess: ").append(toIndentedString(infoForAWSCrossAccountAccess)).append("\n");
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

