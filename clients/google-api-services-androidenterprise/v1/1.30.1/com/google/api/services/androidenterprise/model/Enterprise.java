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

package com.google.api.services.androidenterprise.model;

/**
 * An Enterprises resource represents the binding between an EMM and a specific organization. That
 * binding can be instantiated in one of two different ways using this API as follows: For Google
 * managed domain customers, the process involves using Enterprises.enroll and
 * Enterprises.setAccount (in conjunction with artifacts obtained from the Admin console and the
 * Google API Console) and submitted to the EMM through a more-or-less manual process. For managed
 * Google Play Accounts customers, the process involves using Enterprises.generateSignupUrl and
 * Enterprises.completeSignup in conjunction with the managed Google Play sign-up UI (Google-
 * provided mechanism) to create the binding without manual steps. As an EMM, you can support either
 * or both approaches in your EMM console. See Create an Enterprise for details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Enterprise extends com.google.api.client.json.GenericJson {

  /**
   * Admins of the enterprise. This is only supported for enterprises created via the EMM-initiated
   * flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Administrator> administrator;

  static {
    // hack to force ProGuard to consider Administrator used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Administrator.class);
  }

  /**
   * The unique ID for the enterprise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The name of the enterprise, for example, "Example, Inc".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The enterprise's primary domain, such as "example.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryDomain;

  /**
   * Admins of the enterprise. This is only supported for enterprises created via the EMM-initiated
   * flow.
   * @return value or {@code null} for none
   */
  public java.util.List<Administrator> getAdministrator() {
    return administrator;
  }

  /**
   * Admins of the enterprise. This is only supported for enterprises created via the EMM-initiated
   * flow.
   * @param administrator administrator or {@code null} for none
   */
  public Enterprise setAdministrator(java.util.List<Administrator> administrator) {
    this.administrator = administrator;
    return this;
  }

  /**
   * The unique ID for the enterprise.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique ID for the enterprise.
   * @param id id or {@code null} for none
   */
  public Enterprise setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The name of the enterprise, for example, "Example, Inc".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the enterprise, for example, "Example, Inc".
   * @param name name or {@code null} for none
   */
  public Enterprise setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The enterprise's primary domain, such as "example.com".
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryDomain() {
    return primaryDomain;
  }

  /**
   * The enterprise's primary domain, such as "example.com".
   * @param primaryDomain primaryDomain or {@code null} for none
   */
  public Enterprise setPrimaryDomain(java.lang.String primaryDomain) {
    this.primaryDomain = primaryDomain;
    return this;
  }

  @Override
  public Enterprise set(String fieldName, Object value) {
    return (Enterprise) super.set(fieldName, value);
  }

  @Override
  public Enterprise clone() {
    return (Enterprise) super.clone();
  }

}
