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

/**
 * Object used to describe Disk storage configuration request. Any disks configured here are added in addition to the root volume.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-09-18T14:55:51.348-07:00")
public class DiskConfigurationRequest  {

  /**
   * Size of each data disk in GB.
   **/
  private Integer sizeGB = null;

  /**
   * The storage account type.
   **/
  private String storageAccountType = null;

  /**
   * Number of data disks per instance. The default and minimum number is 1. The maximum number is 15.
   **/
  private Integer dataDisksPerInstance = null;

  /**
   * Getter for sizeGB.
   * Size of each data disk in GB.
   **/
  @JsonProperty("sizeGB")
  public Integer getSizeGB() {
    return sizeGB;
  }

  /**
   * Setter for sizeGB.
   * Size of each data disk in GB.
   **/
  public void setSizeGB(Integer sizeGB) {
    this.sizeGB = sizeGB;
  }

  /**
   * Getter for storageAccountType.
   * The storage account type.
   **/
  @JsonProperty("storageAccountType")
  public String getStorageAccountType() {
    return storageAccountType;
  }

  /**
   * Setter for storageAccountType.
   * The storage account type.
   **/
  public void setStorageAccountType(String storageAccountType) {
    this.storageAccountType = storageAccountType;
  }

  /**
   * Getter for dataDisksPerInstance.
   * Number of data disks per instance. The default and minimum number is 1. The maximum number is 15.
   **/
  @JsonProperty("dataDisksPerInstance")
  public Integer getDataDisksPerInstance() {
    return dataDisksPerInstance;
  }

  /**
   * Setter for dataDisksPerInstance.
   * Number of data disks per instance. The default and minimum number is 1. The maximum number is 15.
   **/
  public void setDataDisksPerInstance(Integer dataDisksPerInstance) {
    this.dataDisksPerInstance = dataDisksPerInstance;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskConfigurationRequest diskConfigurationRequest = (DiskConfigurationRequest) o;
    if (!Objects.equals(this.sizeGB, diskConfigurationRequest.sizeGB)) {
      return false;
    }
    if (!Objects.equals(this.storageAccountType, diskConfigurationRequest.storageAccountType)) {
      return false;
    }
    if (!Objects.equals(this.dataDisksPerInstance, diskConfigurationRequest.dataDisksPerInstance)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeGB, storageAccountType, dataDisksPerInstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskConfigurationRequest {\n");
    sb.append("    sizeGB: ").append(toIndentedString(sizeGB)).append("\n");
    sb.append("    storageAccountType: ").append(toIndentedString(storageAccountType)).append("\n");
    sb.append("    dataDisksPerInstance: ").append(toIndentedString(dataDisksPerInstance)).append("\n");
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

