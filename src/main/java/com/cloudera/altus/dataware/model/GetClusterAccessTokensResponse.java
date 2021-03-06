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

package com.cloudera.altus.dataware.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import com.cloudera.altus.dataware.model.LdapTokenDetails;

/**
 * Response object for a get cluster access tokens request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-09-05T21:19:10.984-07:00")
public class GetClusterAccessTokensResponse extends AltusResponse {

  /**
   * The LDAP token details
   **/
  private LdapTokenDetails ldapTokenDetails = null;

  /**
   * Getter for ldapTokenDetails.
   * The LDAP token details
   **/
  @JsonProperty("ldapTokenDetails")
  public LdapTokenDetails getLdapTokenDetails() {
    return ldapTokenDetails;
  }

  /**
   * Setter for ldapTokenDetails.
   * The LDAP token details
   **/
  public void setLdapTokenDetails(LdapTokenDetails ldapTokenDetails) {
    this.ldapTokenDetails = ldapTokenDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClusterAccessTokensResponse getClusterAccessTokensResponse = (GetClusterAccessTokensResponse) o;
    if (!Objects.equals(this.ldapTokenDetails, getClusterAccessTokensResponse.ldapTokenDetails)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldapTokenDetails, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClusterAccessTokensResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ldapTokenDetails: ").append(toIndentedString(ldapTokenDetails)).append("\n");
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

