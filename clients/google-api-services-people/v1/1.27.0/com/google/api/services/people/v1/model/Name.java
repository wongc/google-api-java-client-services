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

package com.google.api.services.people.v1.model;

/**
 * A person's name. If the name is a mononym, the family name is empty.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Name extends com.google.api.client.json.GenericJson {

  /**
   * The read-only display name formatted according to the locale specified by the viewer's account
   * or the `Accept-Language` HTTP header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The read-only display name with the last name first formatted according to the locale specified
   * by the viewer's account or the `Accept-Language` HTTP header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayNameLastFirst;

  /**
   * The family name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String familyName;

  /**
   * The given name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String givenName;

  /**
   * The honorific prefixes, such as `Mrs.` or `Dr.`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String honorificPrefix;

  /**
   * The honorific suffixes, such as `Jr.`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String honorificSuffix;

  /**
   * Metadata about the name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The middle name(s).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String middleName;

  /**
   * The family name spelled as it sounds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneticFamilyName;

  /**
   * The full name spelled as it sounds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneticFullName;

  /**
   * The given name spelled as it sounds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneticGivenName;

  /**
   * The honorific prefixes spelled as they sound.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneticHonorificPrefix;

  /**
   * The honorific suffixes spelled as they sound.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneticHonorificSuffix;

  /**
   * The middle name(s) spelled as they sound.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneticMiddleName;

  /**
   * The read-only display name formatted according to the locale specified by the viewer's account
   * or the `Accept-Language` HTTP header.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The read-only display name formatted according to the locale specified by the viewer's account
   * or the `Accept-Language` HTTP header.
   * @param displayName displayName or {@code null} for none
   */
  public Name setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The read-only display name with the last name first formatted according to the locale specified
   * by the viewer's account or the `Accept-Language` HTTP header.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayNameLastFirst() {
    return displayNameLastFirst;
  }

  /**
   * The read-only display name with the last name first formatted according to the locale specified
   * by the viewer's account or the `Accept-Language` HTTP header.
   * @param displayNameLastFirst displayNameLastFirst or {@code null} for none
   */
  public Name setDisplayNameLastFirst(java.lang.String displayNameLastFirst) {
    this.displayNameLastFirst = displayNameLastFirst;
    return this;
  }

  /**
   * The family name.
   * @return value or {@code null} for none
   */
  public java.lang.String getFamilyName() {
    return familyName;
  }

  /**
   * The family name.
   * @param familyName familyName or {@code null} for none
   */
  public Name setFamilyName(java.lang.String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * The given name.
   * @return value or {@code null} for none
   */
  public java.lang.String getGivenName() {
    return givenName;
  }

  /**
   * The given name.
   * @param givenName givenName or {@code null} for none
   */
  public Name setGivenName(java.lang.String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * The honorific prefixes, such as `Mrs.` or `Dr.`
   * @return value or {@code null} for none
   */
  public java.lang.String getHonorificPrefix() {
    return honorificPrefix;
  }

  /**
   * The honorific prefixes, such as `Mrs.` or `Dr.`
   * @param honorificPrefix honorificPrefix or {@code null} for none
   */
  public Name setHonorificPrefix(java.lang.String honorificPrefix) {
    this.honorificPrefix = honorificPrefix;
    return this;
  }

  /**
   * The honorific suffixes, such as `Jr.`
   * @return value or {@code null} for none
   */
  public java.lang.String getHonorificSuffix() {
    return honorificSuffix;
  }

  /**
   * The honorific suffixes, such as `Jr.`
   * @param honorificSuffix honorificSuffix or {@code null} for none
   */
  public Name setHonorificSuffix(java.lang.String honorificSuffix) {
    this.honorificSuffix = honorificSuffix;
    return this;
  }

  /**
   * Metadata about the name.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the name.
   * @param metadata metadata or {@code null} for none
   */
  public Name setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The middle name(s).
   * @return value or {@code null} for none
   */
  public java.lang.String getMiddleName() {
    return middleName;
  }

  /**
   * The middle name(s).
   * @param middleName middleName or {@code null} for none
   */
  public Name setMiddleName(java.lang.String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * The family name spelled as it sounds.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneticFamilyName() {
    return phoneticFamilyName;
  }

  /**
   * The family name spelled as it sounds.
   * @param phoneticFamilyName phoneticFamilyName or {@code null} for none
   */
  public Name setPhoneticFamilyName(java.lang.String phoneticFamilyName) {
    this.phoneticFamilyName = phoneticFamilyName;
    return this;
  }

  /**
   * The full name spelled as it sounds.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneticFullName() {
    return phoneticFullName;
  }

  /**
   * The full name spelled as it sounds.
   * @param phoneticFullName phoneticFullName or {@code null} for none
   */
  public Name setPhoneticFullName(java.lang.String phoneticFullName) {
    this.phoneticFullName = phoneticFullName;
    return this;
  }

  /**
   * The given name spelled as it sounds.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneticGivenName() {
    return phoneticGivenName;
  }

  /**
   * The given name spelled as it sounds.
   * @param phoneticGivenName phoneticGivenName or {@code null} for none
   */
  public Name setPhoneticGivenName(java.lang.String phoneticGivenName) {
    this.phoneticGivenName = phoneticGivenName;
    return this;
  }

  /**
   * The honorific prefixes spelled as they sound.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneticHonorificPrefix() {
    return phoneticHonorificPrefix;
  }

  /**
   * The honorific prefixes spelled as they sound.
   * @param phoneticHonorificPrefix phoneticHonorificPrefix or {@code null} for none
   */
  public Name setPhoneticHonorificPrefix(java.lang.String phoneticHonorificPrefix) {
    this.phoneticHonorificPrefix = phoneticHonorificPrefix;
    return this;
  }

  /**
   * The honorific suffixes spelled as they sound.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneticHonorificSuffix() {
    return phoneticHonorificSuffix;
  }

  /**
   * The honorific suffixes spelled as they sound.
   * @param phoneticHonorificSuffix phoneticHonorificSuffix or {@code null} for none
   */
  public Name setPhoneticHonorificSuffix(java.lang.String phoneticHonorificSuffix) {
    this.phoneticHonorificSuffix = phoneticHonorificSuffix;
    return this;
  }

  /**
   * The middle name(s) spelled as they sound.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneticMiddleName() {
    return phoneticMiddleName;
  }

  /**
   * The middle name(s) spelled as they sound.
   * @param phoneticMiddleName phoneticMiddleName or {@code null} for none
   */
  public Name setPhoneticMiddleName(java.lang.String phoneticMiddleName) {
    this.phoneticMiddleName = phoneticMiddleName;
    return this;
  }

  @Override
  public Name set(String fieldName, Object value) {
    return (Name) super.set(fieldName, value);
  }

  @Override
  public Name clone() {
    return (Name) super.clone();
  }

}
