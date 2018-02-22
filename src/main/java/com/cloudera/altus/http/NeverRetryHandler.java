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

package com.cloudera.altus.http;

import static com.cloudera.altus.ValidationUtils.checkArgumentAndThrow;
import static com.cloudera.altus.ValidationUtils.checkNotNullAndThrow;

import com.cloudera.altus.AltusClientException;

import java.time.Duration;

/**
 * A retry handler that will never retry.
 */
public class NeverRetryHandler implements RetryHandler {

  @Override
  public Duration shouldRetry(int attempts, AltusClientException exception) {
    checkNotNullAndThrow(exception);
    checkArgumentAndThrow(attempts >= 1);
    return DO_NOT_RETRY;
  }
}
