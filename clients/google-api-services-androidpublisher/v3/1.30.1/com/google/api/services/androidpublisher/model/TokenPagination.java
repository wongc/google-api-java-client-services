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

package com.google.api.services.androidpublisher.model;

/**
 * Pagination information returned by a List operation when token pagination is enabled.
 *
 * List operations that supports paging return only one "page" of results. This protocol buffer
 * message describes the page that has been returned.
 *
 * When using token pagination, clients should use the next/previous token to get another page of
 * the result. The presence or absence of next/previous token indicates whether a next/previous page
 * is available and provides a mean of accessing this page. ListRequest.page_token should be set to
 * either next_page_token or previous_page_token to access another page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TokenPagination extends com.google.api.client.json.GenericJson {

  /**
   * Tokens to pass to the standard list field 'page_token'. Whenever available, tokens are
   * preferred over manipulating start_index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String previousPageToken;

  /**
   * Tokens to pass to the standard list field 'page_token'. Whenever available, tokens are
   * preferred over manipulating start_index.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Tokens to pass to the standard list field 'page_token'. Whenever available, tokens are
   * preferred over manipulating start_index.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public TokenPagination setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPreviousPageToken() {
    return previousPageToken;
  }

  /**
   * @param previousPageToken previousPageToken or {@code null} for none
   */
  public TokenPagination setPreviousPageToken(java.lang.String previousPageToken) {
    this.previousPageToken = previousPageToken;
    return this;
  }

  @Override
  public TokenPagination set(String fieldName, Object value) {
    return (TokenPagination) super.set(fieldName, value);
  }

  @Override
  public TokenPagination clone() {
    return (TokenPagination) super.clone();
  }

}
