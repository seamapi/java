package com.seam.api.resources.clientsessions;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.clientsessions.requests.ClientSessionsCreateRequest;
import com.seam.api.resources.clientsessions.requests.ClientSessionsDeleteRequest;
import com.seam.api.resources.clientsessions.requests.ClientSessionsGetRequest;
import com.seam.api.resources.clientsessions.requests.ClientSessionsListRequest;
import com.seam.api.types.ClientSessionsCreateResponse;
import com.seam.api.types.ClientSessionsDeleteResponse;
import com.seam.api.types.ClientSessionsGetResponse;
import com.seam.api.types.ClientSessionsListResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ClientSessionsClient {
    protected final ClientOptions clientOptions;

    public ClientSessionsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ClientSessionsCreateResponse create(ClientSessionsCreateRequest request) {
        return create(request, null);
    }

    public ClientSessionsCreateResponse create(ClientSessionsCreateRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("client_sessions/create")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getUserIdentifierKey().isPresent()) {
            _requestBodyProperties.put("user_identifier_key", request.getUserIdentifierKey());
        }
        if (request.getConnectWebviewIds().isPresent()) {
            _requestBodyProperties.put("connect_webview_ids", request.getConnectWebviewIds());
        }
        if (request.getConnectedAccountIds().isPresent()) {
            _requestBodyProperties.put("connected_account_ids", request.getConnectedAccountIds());
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
                        _response.body().string(), ClientSessionsCreateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ClientSessionsDeleteResponse delete(ClientSessionsDeleteRequest request) {
        return delete(request, null);
    }

    public ClientSessionsDeleteResponse delete(ClientSessionsDeleteRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("client_sessions/delete")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("client_session_id", request.getClientSessionId());
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
                        _response.body().string(), ClientSessionsDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ClientSessionsGetResponse get(ClientSessionsGetRequest request) {
        return get(request, null);
    }

    public ClientSessionsGetResponse get(ClientSessionsGetRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("client_sessions/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getClientSessionId().isPresent()) {
            _requestBodyProperties.put("client_session_id", request.getClientSessionId());
        }
        if (request.getUserIdentifierKey().isPresent()) {
            _requestBodyProperties.put("user_identifier_key", request.getUserIdentifierKey());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ClientSessionsGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ClientSessionsListResponse list(ClientSessionsListRequest request) {
        return list(request, null);
    }

    public ClientSessionsListResponse list(ClientSessionsListRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("client_sessions/list")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getClientSessionId().isPresent()) {
            _requestBodyProperties.put("client_session_id", request.getClientSessionId());
        }
        if (request.getUserIdentifierKey().isPresent()) {
            _requestBodyProperties.put("user_identifier_key", request.getUserIdentifierKey());
        }
        if (request.getWithoutUserIdentifierKey().isPresent()) {
            _requestBodyProperties.put("without_user_identifier_key", request.getWithoutUserIdentifierKey());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ClientSessionsListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
