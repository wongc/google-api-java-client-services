/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * Metadata describing an Operation
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * API version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * Specifies if cancellation was requested for the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cancelRequested;

  /**
   * The time the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The time the operation finished running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Human-readable status of the operation, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusDetail;

  /**
   * Target of the operation - for example
   * projects/project-1/locations/global/connectivityTests/test-1
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * Name of the verb executed by the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verb;

  /**
   * API version.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * API version.
   * @param apiVersion apiVersion or {@code null} for none
   */
  public OperationMetadata setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Specifies if cancellation was requested for the operation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCancelRequested() {
    return cancelRequested;
  }

  /**
   * Specifies if cancellation was requested for the operation.
   * @param cancelRequested cancelRequested or {@code null} for none
   */
  public OperationMetadata setCancelRequested(java.lang.Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
    return this;
  }

  /**
   * The time the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public OperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time the operation finished running.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time the operation finished running.
   * @param endTime endTime or {@code null} for none
   */
  public OperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Human-readable status of the operation, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusDetail() {
    return statusDetail;
  }

  /**
   * Human-readable status of the operation, if any.
   * @param statusDetail statusDetail or {@code null} for none
   */
  public OperationMetadata setStatusDetail(java.lang.String statusDetail) {
    this.statusDetail = statusDetail;
    return this;
  }

  /**
   * Target of the operation - for example
   * projects/project-1/locations/global/connectivityTests/test-1
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Target of the operation - for example
   * projects/project-1/locations/global/connectivityTests/test-1
   * @param target target or {@code null} for none
   */
  public OperationMetadata setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * Name of the verb executed by the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerb() {
    return verb;
  }

  /**
   * Name of the verb executed by the operation.
   * @param verb verb or {@code null} for none
   */
  public OperationMetadata setVerb(java.lang.String verb) {
    this.verb = verb;
    return this;
  }

  @Override
  public OperationMetadata set(String fieldName, Object value) {
    return (OperationMetadata) super.set(fieldName, value);
  }

  @Override
  public OperationMetadata clone() {
    return (OperationMetadata) super.clone();
  }

}
