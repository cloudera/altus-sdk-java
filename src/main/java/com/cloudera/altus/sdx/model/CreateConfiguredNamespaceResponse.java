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

/**
 * Response object for a create configured namespace request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-08-28T09:14:05.375-07:00")
public class CreateConfiguredNamespaceResponse extends AltusResponse {

  /**
   * The configured namespace that was created.
   **/
  private Namespace namespace = null;

  /**
   * Getter for namespace.
   * The configured namespace that was created.
   **/
  @JsonProperty("namespace")
  public Namespace getNamespace() {
    return namespace;
  }

  /**
   * Setter for namespace.
   * The configured namespace that was created.
   **/
  public void setNamespace(Namespace namespace) {
    this.namespace = namespace;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConfiguredNamespaceResponse createConfiguredNamespaceResponse = (CreateConfiguredNamespaceResponse) o;
    if (!Objects.equals(this.namespace, createConfiguredNamespaceResponse.namespace)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConfiguredNamespaceResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

