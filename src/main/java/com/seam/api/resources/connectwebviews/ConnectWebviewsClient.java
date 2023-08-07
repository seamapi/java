package com.seam.api.resources.connectwebviews;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.connectwebviews.requests.ConnectWebviewsCreateRequest;
import com.seam.api.resources.connectwebviews.requests.ConnectWebviewsDeleteRequest;
import com.seam.api.resources.connectwebviews.requests.ConnectWebviewsGetRequest;
import com.seam.api.resources.connectwebviews.requests.ConnectWebviewsViewRequest;
import com.seam.api.types.ConnectWebviewsCreateResponse;
import com.seam.api.types.ConnectWebviewsDeleteResponse;
import com.seam.api.types.ConnectWebviewsGetResponse;
import com.seam.api.types.ConnectWebviewsListResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ConnectWebviewsClient {
    protected final ClientOptions clientOptions;

    public ConnectWebviewsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ConnectWebviewsCreateResponse create(ConnectWebviewsCreateRequest request) {
        return create(request, null);
    }

    public ConnectWebviewsCreateResponse create(ConnectWebviewsCreateRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("connect_webviews/create")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getDeviceSelectionMode().isPresent()) {
            _requestBodyProperties.put("device_selection_mode", request.getDeviceSelectionMode());
        }
        if (request.getCustomRedirectUrl().isPresent()) {
            _requestBodyProperties.put("custom_redirect_url", request.getCustomRedirectUrl());
        }
        if (request.getCustomRedirectFailureUrl().isPresent()) {
            _requestBodyProperties.put("custom_redirect_failure_url", request.getCustomRedirectFailureUrl());
        }
        if (request.getAcceptedProviders().isPresent()) {
            _requestBodyProperties.put("accepted_providers", request.getAcceptedProviders());
        }
        if (request.getProviderCategory().isPresent()) {
            _requestBodyProperties.put("provider_category", request.getProviderCategory());
        }
        if (request.getCustomMetadata().isPresent()) {
            _requestBodyProperties.put("custom_metadata", request.getCustomMetadata());
        }
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), ConnectWebviewsCreateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ConnectWebviewsDeleteResponse delete(ConnectWebviewsDeleteRequest request) {
        return delete(request, null);
    }

    public ConnectWebviewsDeleteResponse delete(ConnectWebviewsDeleteRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("connect_webviews/delete")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("connect_webview_id", request.getConnectWebviewId());
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), ConnectWebviewsDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ConnectWebviewsGetResponse get(ConnectWebviewsGetRequest request) {
        return get(request, null);
    }

    public ConnectWebviewsGetResponse get(ConnectWebviewsGetRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("connect_webviews/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("connect_webview_id", request.getConnectWebviewId());
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ConnectWebviewsGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ConnectWebviewsListResponse list() {
        return list(null);
    }

    public ConnectWebviewsListResponse list(RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("connect_webviews/list")
                .build();
        Request _request = new Request.Builder()
                .url(_httpUrl)
                .method("POST", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), ConnectWebviewsListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void view(ConnectWebviewsViewRequest request) {
        view(request, null);
    }

    public void view(ConnectWebviewsViewRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder _httpUrl = HttpUrl.parse(
                        this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("connect_webviews/view");
        _httpUrl.addQueryParameter("connect_webview_id", request.getConnectWebviewId());
        _httpUrl.addQueryParameter("auth_token", request.getAuthToken());
        RequestBody _requestBody = null;
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl.build())
                .method("GET", _requestBody)
                .headers(Headers.of(clientOptions.headers(requestOptions)));
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return;
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
