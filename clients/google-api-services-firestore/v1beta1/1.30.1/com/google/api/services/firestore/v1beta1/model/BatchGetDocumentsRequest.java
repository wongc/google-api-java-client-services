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

package com.google.api.services.firestore.v1beta1.model;

/**
 * The request for Firestore.BatchGetDocuments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchGetDocumentsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will
   * fail if any of the document is not a child resource of the given `database`. Duplicate names
   * will be elided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> documents;

  /**
   * The fields to return. If not set, returns all fields.
   *
   * If a document has a field that is not present in this mask, that field will not be returned in
   * the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DocumentMask mask;

  /**
   * Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new
   * transaction ID will be returned as the first response in the stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransactionOptions newTransaction;

  /**
   * Reads documents as they were at the given time. This may not be older than 270 seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * Reads documents in a transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transaction;

  /**
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will
   * fail if any of the document is not a child resource of the given `database`. Duplicate names
   * will be elided.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDocuments() {
    return documents;
  }

  /**
   * The names of the documents to retrieve. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will
   * fail if any of the document is not a child resource of the given `database`. Duplicate names
   * will be elided.
   * @param documents documents or {@code null} for none
   */
  public BatchGetDocumentsRequest setDocuments(java.util.List<java.lang.String> documents) {
    this.documents = documents;
    return this;
  }

  /**
   * The fields to return. If not set, returns all fields.
   *
   * If a document has a field that is not present in this mask, that field will not be returned in
   * the response.
   * @return value or {@code null} for none
   */
  public DocumentMask getMask() {
    return mask;
  }

  /**
   * The fields to return. If not set, returns all fields.
   *
   * If a document has a field that is not present in this mask, that field will not be returned in
   * the response.
   * @param mask mask or {@code null} for none
   */
  public BatchGetDocumentsRequest setMask(DocumentMask mask) {
    this.mask = mask;
    return this;
  }

  /**
   * Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new
   * transaction ID will be returned as the first response in the stream.
   * @return value or {@code null} for none
   */
  public TransactionOptions getNewTransaction() {
    return newTransaction;
  }

  /**
   * Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new
   * transaction ID will be returned as the first response in the stream.
   * @param newTransaction newTransaction or {@code null} for none
   */
  public BatchGetDocumentsRequest setNewTransaction(TransactionOptions newTransaction) {
    this.newTransaction = newTransaction;
    return this;
  }

  /**
   * Reads documents as they were at the given time. This may not be older than 270 seconds.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * Reads documents as they were at the given time. This may not be older than 270 seconds.
   * @param readTime readTime or {@code null} for none
   */
  public BatchGetDocumentsRequest setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  /**
   * Reads documents in a transaction.
   * @see #decodeTransaction()
   * @return value or {@code null} for none
   */
  public java.lang.String getTransaction() {
    return transaction;
  }

  /**
   * Reads documents in a transaction.
   * @see #getTransaction()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTransaction() {
    return com.google.api.client.util.Base64.decodeBase64(transaction);
  }

  /**
   * Reads documents in a transaction.
   * @see #encodeTransaction()
   * @param transaction transaction or {@code null} for none
   */
  public BatchGetDocumentsRequest setTransaction(java.lang.String transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Reads documents in a transaction.
   * @see #setTransaction()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public BatchGetDocumentsRequest encodeTransaction(byte[] transaction) {
    this.transaction = com.google.api.client.util.Base64.encodeBase64URLSafeString(transaction);
    return this;
  }

  @Override
  public BatchGetDocumentsRequest set(String fieldName, Object value) {
    return (BatchGetDocumentsRequest) super.set(fieldName, value);
  }

  @Override
  public BatchGetDocumentsRequest clone() {
    return (BatchGetDocumentsRequest) super.clone();
  }

}
