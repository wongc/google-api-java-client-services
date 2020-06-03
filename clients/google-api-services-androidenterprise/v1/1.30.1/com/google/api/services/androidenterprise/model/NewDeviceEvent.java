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
 * An event generated when a new device is ready to be managed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NewDeviceEvent extends com.google.api.client.json.GenericJson {

  /**
   * The Android ID of the device. This field will always be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceId;

  /**
   * Policy app on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dpcPackageName;

  /**
   * Identifies the extent to which the device is controlled by an Android EMM in various deployment
   * configurations.  Possible values include: "managedDevice", a device where the DPC is set as
   * device owner, "managedProfile", a device where the DPC is set as profile owner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managementType;

  /**
   * The ID of the user. This field will always be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * The Android ID of the device. This field will always be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceId() {
    return deviceId;
  }

  /**
   * The Android ID of the device. This field will always be present.
   * @param deviceId deviceId or {@code null} for none
   */
  public NewDeviceEvent setDeviceId(java.lang.String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Policy app on the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getDpcPackageName() {
    return dpcPackageName;
  }

  /**
   * Policy app on the device.
   * @param dpcPackageName dpcPackageName or {@code null} for none
   */
  public NewDeviceEvent setDpcPackageName(java.lang.String dpcPackageName) {
    this.dpcPackageName = dpcPackageName;
    return this;
  }

  /**
   * Identifies the extent to which the device is controlled by an Android EMM in various deployment
   * configurations.  Possible values include: "managedDevice", a device where the DPC is set as
   * device owner, "managedProfile", a device where the DPC is set as profile owner.
   * @return value or {@code null} for none
   */
  public java.lang.String getManagementType() {
    return managementType;
  }

  /**
   * Identifies the extent to which the device is controlled by an Android EMM in various deployment
   * configurations.  Possible values include: "managedDevice", a device where the DPC is set as
   * device owner, "managedProfile", a device where the DPC is set as profile owner.
   * @param managementType managementType or {@code null} for none
   */
  public NewDeviceEvent setManagementType(java.lang.String managementType) {
    this.managementType = managementType;
    return this;
  }

  /**
   * The ID of the user. This field will always be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * The ID of the user. This field will always be present.
   * @param userId userId or {@code null} for none
   */
  public NewDeviceEvent setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public NewDeviceEvent set(String fieldName, Object value) {
    return (NewDeviceEvent) super.set(fieldName, value);
  }

  @Override
  public NewDeviceEvent clone() {
    return (NewDeviceEvent) super.clone();
  }

}
