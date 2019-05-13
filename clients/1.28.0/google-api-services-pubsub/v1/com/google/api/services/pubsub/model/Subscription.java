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

package com.google.api.services.pubsub.model;

/**
 * A subscription resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subscription extends com.google.api.client.json.GenericJson {

  /**
   * The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to
   * acknowledge receipt before resending the message. In the interval after the message is
   * delivered and before it is acknowledged, it is considered to be outstanding. During that time
   * period, the message will not be redelivered (on a best-effort basis).
   *
   * For pull subscriptions, this value is used as the initial value for the ack deadline. To
   * override this value for a given message, call `ModifyAckDeadline` with the corresponding
   * `ack_id` if using non-streaming pull or send the `ack_id` in a
   * `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you
   * can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10
   * minutes). If this parameter is 0, a default value of 10 seconds is used.
   *
   * For push delivery, this value is also used to set the request timeout for the call to the push
   * endpoint.
   *
   * If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver
   * the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ackDeadlineSeconds;

  /**
   * A policy that specifies the conditions for this subscription's expiration. A subscription is
   * considered active as long as any connected subscriber is successfully consuming messages from
   * the subscription or is issuing operations on the subscription. If `expiration_policy` is not
   * set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for
   * `expiration_policy.ttl` is 1 day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExpirationPolicy expirationPolicy;

  /**
   * See  Creating and managing labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * How long to retain unacknowledged messages in the subscription's backlog, from the moment a
   * message is published. If `retain_acked_messages` is true, then this also configures the
   * retention of acknowledged messages, and thus configures how far back in time a `Seek` can be
   * done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String messageRetentionDuration;

  /**
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`),
   * periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255
   * characters in length, and it must not start with `"goog"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If push delivery is used with this subscription, this field is used to configure it. An empty
   * `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PushConfig pushConfig;

  /**
   * Indicates whether to retain acknowledged messages. If true, then messages are not expunged from
   * the subscription's backlog, even if they are acknowledged, until they fall out of the
   * `message_retention_duration` window. This must be true if you would like to
   *
   * Seek to a timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean retainAckedMessages;

  /**
   * The name of the topic from which this subscription is receiving messages. Format is
   * `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the
   * topic has been deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topic;

  /**
   * The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to
   * acknowledge receipt before resending the message. In the interval after the message is
   * delivered and before it is acknowledged, it is considered to be outstanding. During that time
   * period, the message will not be redelivered (on a best-effort basis).
   *
   * For pull subscriptions, this value is used as the initial value for the ack deadline. To
   * override this value for a given message, call `ModifyAckDeadline` with the corresponding
   * `ack_id` if using non-streaming pull or send the `ack_id` in a
   * `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you
   * can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10
   * minutes). If this parameter is 0, a default value of 10 seconds is used.
   *
   * For push delivery, this value is also used to set the request timeout for the call to the push
   * endpoint.
   *
   * If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver
   * the message.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAckDeadlineSeconds() {
    return ackDeadlineSeconds;
  }

  /**
   * The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to
   * acknowledge receipt before resending the message. In the interval after the message is
   * delivered and before it is acknowledged, it is considered to be outstanding. During that time
   * period, the message will not be redelivered (on a best-effort basis).
   *
   * For pull subscriptions, this value is used as the initial value for the ack deadline. To
   * override this value for a given message, call `ModifyAckDeadline` with the corresponding
   * `ack_id` if using non-streaming pull or send the `ack_id` in a
   * `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you
   * can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10
   * minutes). If this parameter is 0, a default value of 10 seconds is used.
   *
   * For push delivery, this value is also used to set the request timeout for the call to the push
   * endpoint.
   *
   * If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver
   * the message.
   * @param ackDeadlineSeconds ackDeadlineSeconds or {@code null} for none
   */
  public Subscription setAckDeadlineSeconds(java.lang.Integer ackDeadlineSeconds) {
    this.ackDeadlineSeconds = ackDeadlineSeconds;
    return this;
  }

  /**
   * A policy that specifies the conditions for this subscription's expiration. A subscription is
   * considered active as long as any connected subscriber is successfully consuming messages from
   * the subscription or is issuing operations on the subscription. If `expiration_policy` is not
   * set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for
   * `expiration_policy.ttl` is 1 day.
   * @return value or {@code null} for none
   */
  public ExpirationPolicy getExpirationPolicy() {
    return expirationPolicy;
  }

  /**
   * A policy that specifies the conditions for this subscription's expiration. A subscription is
   * considered active as long as any connected subscriber is successfully consuming messages from
   * the subscription or is issuing operations on the subscription. If `expiration_policy` is not
   * set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for
   * `expiration_policy.ttl` is 1 day.
   * @param expirationPolicy expirationPolicy or {@code null} for none
   */
  public Subscription setExpirationPolicy(ExpirationPolicy expirationPolicy) {
    this.expirationPolicy = expirationPolicy;
    return this;
  }

  /**
   * See  Creating and managing labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * See  Creating and managing labels.
   * @param labels labels or {@code null} for none
   */
  public Subscription setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * How long to retain unacknowledged messages in the subscription's backlog, from the moment a
   * message is published. If `retain_acked_messages` is true, then this also configures the
   * retention of acknowledged messages, and thus configures how far back in time a `Seek` can be
   * done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
   * @return value or {@code null} for none
   */
  public String getMessageRetentionDuration() {
    return messageRetentionDuration;
  }

  /**
   * How long to retain unacknowledged messages in the subscription's backlog, from the moment a
   * message is published. If `retain_acked_messages` is true, then this also configures the
   * retention of acknowledged messages, and thus configures how far back in time a `Seek` can be
   * done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
   * @param messageRetentionDuration messageRetentionDuration or {@code null} for none
   */
  public Subscription setMessageRetentionDuration(String messageRetentionDuration) {
    this.messageRetentionDuration = messageRetentionDuration;
    return this;
  }

  /**
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`),
   * periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255
   * characters in length, and it must not start with `"goog"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`),
   * periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255
   * characters in length, and it must not start with `"goog"`.
   * @param name name or {@code null} for none
   */
  public Subscription setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * If push delivery is used with this subscription, this field is used to configure it. An empty
   * `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
   * @return value or {@code null} for none
   */
  public PushConfig getPushConfig() {
    return pushConfig;
  }

  /**
   * If push delivery is used with this subscription, this field is used to configure it. An empty
   * `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
   * @param pushConfig pushConfig or {@code null} for none
   */
  public Subscription setPushConfig(PushConfig pushConfig) {
    this.pushConfig = pushConfig;
    return this;
  }

  /**
   * Indicates whether to retain acknowledged messages. If true, then messages are not expunged from
   * the subscription's backlog, even if they are acknowledged, until they fall out of the
   * `message_retention_duration` window. This must be true if you would like to
   *
   * Seek to a timestamp.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRetainAckedMessages() {
    return retainAckedMessages;
  }

  /**
   * Indicates whether to retain acknowledged messages. If true, then messages are not expunged from
   * the subscription's backlog, even if they are acknowledged, until they fall out of the
   * `message_retention_duration` window. This must be true if you would like to
   *
   * Seek to a timestamp.
   * @param retainAckedMessages retainAckedMessages or {@code null} for none
   */
  public Subscription setRetainAckedMessages(java.lang.Boolean retainAckedMessages) {
    this.retainAckedMessages = retainAckedMessages;
    return this;
  }

  /**
   * The name of the topic from which this subscription is receiving messages. Format is
   * `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the
   * topic has been deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * The name of the topic from which this subscription is receiving messages. Format is
   * `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the
   * topic has been deleted.
   * @param topic topic or {@code null} for none
   */
  public Subscription setTopic(java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  @Override
  public Subscription set(String fieldName, Object value) {
    return (Subscription) super.set(fieldName, value);
  }

  @Override
  public Subscription clone() {
    return (Subscription) super.clone();
  }

}
