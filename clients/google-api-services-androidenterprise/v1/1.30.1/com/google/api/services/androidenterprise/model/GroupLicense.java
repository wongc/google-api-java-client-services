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
 * Group license objects allow you to keep track of licenses (called entitlements) for both free and
 * paid apps. For a free app, a group license is created when an enterprise admin first approves the
 * product in Google Play or when the first entitlement for the product is created for a user via
 * the API. For a paid app, a group license object is only created when an enterprise admin
 * purchases the product in Google Play for the first time.
 *
 * Use the API to query group licenses. A Grouplicenses resource includes the total number of
 * licenses purchased (paid apps only) and the total number of licenses currently in use. In other
 * words, the total number of Entitlements that exist for the product.
 *
 * Only one group license object is created per product and group license objects are never deleted.
 * If a product is unapproved, its group license remains. This allows enterprise admins to keep
 * track of any remaining entitlements for the product.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GroupLicense extends com.google.api.client.json.GenericJson {

  /**
   * How this group license was acquired. bulkPurchase means that this Grouplicenses resource was
   * created because the enterprise purchased licenses for this product; otherwise, the value is
   * free (for free products).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acquisitionKind;

  /**
   * Whether the product to which this group license relates is currently approved by the
   * enterprise. Products are approved when a group license is first created, but this approval may
   * be revoked by an enterprise admin via Google Play. Unapproved products will not be visible to
   * end users in collections, and new entitlements to them should not normally be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String approval;

  /**
   * The total number of provisioned licenses for this product. Returned by read operations, but
   * ignored in write operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numProvisioned;

  /**
   * The number of purchased licenses (possibly in multiple purchases). If this field is omitted,
   * then there is no limit on the number of licenses that can be provisioned (for example, if the
   * acquisition kind is free).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numPurchased;

  /**
   * The permission approval status of the product. This field is only set if the product is
   * approved. Possible states are: "currentApproved", the current set of permissions is approved,
   * but additional permissions will require the administrator to reapprove the product (If the
   * product was approved without specifying the approved permissions setting, then this is the
   * default behavior.), "needsReapproval", the product has unapproved permissions. No additional
   * product licenses can be assigned until the product is reapproved,
   * "allCurrentAndFutureApproved", the current permissions are approved and any future permission
   * updates will be automatically approved without administrator review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permissions;

  /**
   * The ID of the product that the license is for. For example, app:com.google.android.gm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * How this group license was acquired. bulkPurchase means that this Grouplicenses resource was
   * created because the enterprise purchased licenses for this product; otherwise, the value is
   * free (for free products).
   * @return value or {@code null} for none
   */
  public java.lang.String getAcquisitionKind() {
    return acquisitionKind;
  }

  /**
   * How this group license was acquired. bulkPurchase means that this Grouplicenses resource was
   * created because the enterprise purchased licenses for this product; otherwise, the value is
   * free (for free products).
   * @param acquisitionKind acquisitionKind or {@code null} for none
   */
  public GroupLicense setAcquisitionKind(java.lang.String acquisitionKind) {
    this.acquisitionKind = acquisitionKind;
    return this;
  }

  /**
   * Whether the product to which this group license relates is currently approved by the
   * enterprise. Products are approved when a group license is first created, but this approval may
   * be revoked by an enterprise admin via Google Play. Unapproved products will not be visible to
   * end users in collections, and new entitlements to them should not normally be created.
   * @return value or {@code null} for none
   */
  public java.lang.String getApproval() {
    return approval;
  }

  /**
   * Whether the product to which this group license relates is currently approved by the
   * enterprise. Products are approved when a group license is first created, but this approval may
   * be revoked by an enterprise admin via Google Play. Unapproved products will not be visible to
   * end users in collections, and new entitlements to them should not normally be created.
   * @param approval approval or {@code null} for none
   */
  public GroupLicense setApproval(java.lang.String approval) {
    this.approval = approval;
    return this;
  }

  /**
   * The total number of provisioned licenses for this product. Returned by read operations, but
   * ignored in write operations.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumProvisioned() {
    return numProvisioned;
  }

  /**
   * The total number of provisioned licenses for this product. Returned by read operations, but
   * ignored in write operations.
   * @param numProvisioned numProvisioned or {@code null} for none
   */
  public GroupLicense setNumProvisioned(java.lang.Integer numProvisioned) {
    this.numProvisioned = numProvisioned;
    return this;
  }

  /**
   * The number of purchased licenses (possibly in multiple purchases). If this field is omitted,
   * then there is no limit on the number of licenses that can be provisioned (for example, if the
   * acquisition kind is free).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumPurchased() {
    return numPurchased;
  }

  /**
   * The number of purchased licenses (possibly in multiple purchases). If this field is omitted,
   * then there is no limit on the number of licenses that can be provisioned (for example, if the
   * acquisition kind is free).
   * @param numPurchased numPurchased or {@code null} for none
   */
  public GroupLicense setNumPurchased(java.lang.Integer numPurchased) {
    this.numPurchased = numPurchased;
    return this;
  }

  /**
   * The permission approval status of the product. This field is only set if the product is
   * approved. Possible states are: "currentApproved", the current set of permissions is approved,
   * but additional permissions will require the administrator to reapprove the product (If the
   * product was approved without specifying the approved permissions setting, then this is the
   * default behavior.), "needsReapproval", the product has unapproved permissions. No additional
   * product licenses can be assigned until the product is reapproved,
   * "allCurrentAndFutureApproved", the current permissions are approved and any future permission
   * updates will be automatically approved without administrator review.
   * @return value or {@code null} for none
   */
  public java.lang.String getPermissions() {
    return permissions;
  }

  /**
   * The permission approval status of the product. This field is only set if the product is
   * approved. Possible states are: "currentApproved", the current set of permissions is approved,
   * but additional permissions will require the administrator to reapprove the product (If the
   * product was approved without specifying the approved permissions setting, then this is the
   * default behavior.), "needsReapproval", the product has unapproved permissions. No additional
   * product licenses can be assigned until the product is reapproved,
   * "allCurrentAndFutureApproved", the current permissions are approved and any future permission
   * updates will be automatically approved without administrator review.
   * @param permissions permissions or {@code null} for none
   */
  public GroupLicense setPermissions(java.lang.String permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * The ID of the product that the license is for. For example, app:com.google.android.gm.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product that the license is for. For example, app:com.google.android.gm.
   * @param productId productId or {@code null} for none
   */
  public GroupLicense setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  @Override
  public GroupLicense set(String fieldName, Object value) {
    return (GroupLicense) super.set(fieldName, value);
  }

  @Override
  public GroupLicense clone() {
    return (GroupLicense) super.clone();
  }

}
