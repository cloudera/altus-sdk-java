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

package com.cloudera.altus.sdx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import com.cloudera.altus.sdx.model.Namespace;
import java.util.*;

/**
 * Response object for a list namespaces request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-01-29T13:30:13.430-08:00")
public class ListNamespacesResponse extends AltusResponse {

  /**
   * The namespaces.
   **/
  private List<Namespace> namespaces = new ArrayList<Namespace>();

  /**
   * The token to use when requesting the next set of results. If there are no additional results, the string is empty.
   **/
  private String nextToken = null;

  /**
   * Getter for namespaces.
   * The namespaces.
   **/
  @JsonProperty("namespaces")
  public List<Namespace> getNamespaces() {
    return namespaces;
  }

  /**
   * Setter for namespaces.
   * The namespaces.
   **/
  public void setNamespaces(List<Namespace> namespaces) {
    this.namespaces = namespaces;
  }

  /**
   * Getter for nextToken.
   * The token to use when requesting the next set of results. If there are no additional results, the string is empty.
   **/
  @JsonProperty("nextToken")
  public String getNextToken() {
    return nextToken;
  }

  /**
   * Setter for nextToken.
   * The token to use when requesting the next set of results. If there are no additional results, the string is empty.
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
    ListNamespacesResponse listNamespacesResponse = (ListNamespacesResponse) o;
    if (!Objects.equals(this.namespaces, listNamespacesResponse.namespaces)) {
      return false;
    }
    if (!Objects.equals(this.nextToken, listNamespacesResponse.nextToken)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaces, nextToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNamespacesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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

