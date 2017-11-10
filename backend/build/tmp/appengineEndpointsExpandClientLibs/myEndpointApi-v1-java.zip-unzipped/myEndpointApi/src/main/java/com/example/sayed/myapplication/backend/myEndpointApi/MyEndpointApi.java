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
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-11-07 19:12:12 UTC)
 * on 2017-11-10 at 21:27:11 UTC 
 * Modify at your own risk.
 */

package com.example.sayed.myapplication.backend.myEndpointApi;

/**
 * Service definition for MyEndpointApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link MyEndpointApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class MyEndpointApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.23.0 of the myEndpointApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "myEndpointApi/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public MyEndpointApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  MyEndpointApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getMyEndpoint".
   *
   * This request holds the parameters needed by the myEndpointApi server.  After setting any optional
   * parameters, call the {@link GetMyEndpoint#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetMyEndpoint getMyEndpoint(java.lang.Long id) throws java.io.IOException {
    GetMyEndpoint result = new GetMyEndpoint(id);
    initialize(result);
    return result;
  }

  public class GetMyEndpoint extends MyEndpointApiRequest<com.example.sayed.myapplication.backend.myEndpointApi.model.MyEndpoint> {

    private static final String REST_PATH = "myendpoint/{id}";

    /**
     * Create a request for the method "getMyEndpoint".
     *
     * This request holds the parameters needed by the the myEndpointApi server.  After setting any
     * optional parameters, call the {@link GetMyEndpoint#execute()} method to invoke the remote
     * operation. <p> {@link GetMyEndpoint#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetMyEndpoint(java.lang.Long id) {
      super(MyEndpointApi.this, "GET", REST_PATH, null, com.example.sayed.myapplication.backend.myEndpointApi.model.MyEndpoint.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetMyEndpoint setAlt(java.lang.String alt) {
      return (GetMyEndpoint) super.setAlt(alt);
    }

    @Override
    public GetMyEndpoint setFields(java.lang.String fields) {
      return (GetMyEndpoint) super.setFields(fields);
    }

    @Override
    public GetMyEndpoint setKey(java.lang.String key) {
      return (GetMyEndpoint) super.setKey(key);
    }

    @Override
    public GetMyEndpoint setOauthToken(java.lang.String oauthToken) {
      return (GetMyEndpoint) super.setOauthToken(oauthToken);
    }

    @Override
    public GetMyEndpoint setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetMyEndpoint) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetMyEndpoint setQuotaUser(java.lang.String quotaUser) {
      return (GetMyEndpoint) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetMyEndpoint setUserIp(java.lang.String userIp) {
      return (GetMyEndpoint) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetMyEndpoint setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetMyEndpoint set(String parameterName, Object value) {
      return (GetMyEndpoint) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertMyEndpoint".
   *
   * This request holds the parameters needed by the myEndpointApi server.  After setting any optional
   * parameters, call the {@link InsertMyEndpoint#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.sayed.myapplication.backend.myEndpointApi.model.MyEndpoint}
   * @return the request
   */
  public InsertMyEndpoint insertMyEndpoint(com.example.sayed.myapplication.backend.myEndpointApi.model.MyEndpoint content) throws java.io.IOException {
    InsertMyEndpoint result = new InsertMyEndpoint(content);
    initialize(result);
    return result;
  }

  public class InsertMyEndpoint extends MyEndpointApiRequest<com.example.sayed.myapplication.backend.myEndpointApi.model.MyEndpoint> {

    private static final String REST_PATH = "myendpoint";

    /**
     * Create a request for the method "insertMyEndpoint".
     *
     * This request holds the parameters needed by the the myEndpointApi server.  After setting any
     * optional parameters, call the {@link InsertMyEndpoint#execute()} method to invoke the remote
     * operation. <p> {@link InsertMyEndpoint#initialize(com.google.api.client.googleapis.services.Abs
     * tractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.example.sayed.myapplication.backend.myEndpointApi.model.MyEndpoint}
     * @since 1.13
     */
    protected InsertMyEndpoint(com.example.sayed.myapplication.backend.myEndpointApi.model.MyEndpoint content) {
      super(MyEndpointApi.this, "POST", REST_PATH, content, com.example.sayed.myapplication.backend.myEndpointApi.model.MyEndpoint.class);
    }

    @Override
    public InsertMyEndpoint setAlt(java.lang.String alt) {
      return (InsertMyEndpoint) super.setAlt(alt);
    }

    @Override
    public InsertMyEndpoint setFields(java.lang.String fields) {
      return (InsertMyEndpoint) super.setFields(fields);
    }

    @Override
    public InsertMyEndpoint setKey(java.lang.String key) {
      return (InsertMyEndpoint) super.setKey(key);
    }

    @Override
    public InsertMyEndpoint setOauthToken(java.lang.String oauthToken) {
      return (InsertMyEndpoint) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertMyEndpoint setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertMyEndpoint) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertMyEndpoint setQuotaUser(java.lang.String quotaUser) {
      return (InsertMyEndpoint) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertMyEndpoint setUserIp(java.lang.String userIp) {
      return (InsertMyEndpoint) super.setUserIp(userIp);
    }

    @Override
    public InsertMyEndpoint set(String parameterName, Object value) {
      return (InsertMyEndpoint) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link MyEndpointApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link MyEndpointApi}. */
    @Override
    public MyEndpointApi build() {
      return new MyEndpointApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link MyEndpointApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMyEndpointApiRequestInitializer(
        MyEndpointApiRequestInitializer myendpointapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(myendpointapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}