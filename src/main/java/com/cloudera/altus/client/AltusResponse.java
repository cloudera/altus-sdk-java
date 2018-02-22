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

package com.cloudera.altus.client;

import static com.cloudera.altus.ValidationUtils.checkNotNullAndThrow;
import static com.cloudera.altus.ValidationUtils.checkStateAndThrow;

import com.cloudera.altus.annotation.SdkInternalApi;
import com.google.common.collect.Iterables;

import java.util.List;
import java.util.Map;

/**
 * Class used to encapsulate information returned from all Altus service
 * responses. This class should not be used directly outside of core SDK code.
 */
@SdkInternalApi
public abstract class AltusResponse {

  /**
   * The name of the response header containing the Altus request ID.
   */
  public static final String ALTUS_HEADER_REQUESTID = "x-altus-request-id";

  private Integer httpCode = null;
  private Map<String, List<String>> responseHeaders = null;

  /**
   * Gets the http code that was returned by the Altus server.
   * @return the http code
   */
  public int getHttpCode() {
    checkNotNullAndThrow(httpCode);
    return httpCode;
  }

  /**
   * Sets the http code that was returned by the Altus server. This
   * should be called only once and never outside the SDK internals.
   * @param httpCode the status code
   */
  void setHttpCode(int httpCode) {
    checkStateAndThrow(this.httpCode == null);
    this.httpCode = httpCode;
  }

  /**
   * Gets the http response headers that were returned by the Altus server.
   * @return the response headers
   */
  public Map<String, List<String>> getResponseHeaaders() {
    checkNotNullAndThrow(responseHeaders);
    return responseHeaders;
  }

  /**
   * Sets the http response headers that were returned by the Altus server.
   * This should be called only once and never outside the SDK internals.
   * @param responseHeaders the response headers
   */
  void setResponseHeaders(Map<String, List<String>> responseHeaders) {
    checkStateAndThrow(this.responseHeaders == null);
    this.responseHeaders = responseHeaders;
  }

  /**
   * Returns the Altus request ID. Altus request IDs can be used in the event a
   * service call isn't working as expected and you need to work with Altus
   * support to debug an issue.
   * @return The Altus request ID
   */
  public String getRequestId() {
    checkNotNullAndThrow(responseHeaders);
    List<String> values = responseHeaders.get(ALTUS_HEADER_REQUESTID);
    if (values == null) {
      return "unknown";
    }
    return Iterables.getOnlyElement(values);
  }
}
