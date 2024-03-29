/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.clientsessions;

import com.seam.api.core.ApiError;
import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.clientsessions.requests.ClientSessionsCreateRequest;
import com.seam.api.resources.clientsessions.requests.ClientSessionsDeleteRequest;
import com.seam.api.resources.clientsessions.requests.ClientSessionsGetRequest;
import com.seam.api.resources.clientsessions.requests.ClientSessionsListRequest;
import com.seam.api.types.ClientSession;
import com.seam.api.types.ClientSessionsCreateResponse;
import com.seam.api.types.ClientSessionsDeleteResponse;
import com.seam.api.types.ClientSessionsGetResponse;
import com.seam.api.types.ClientSessionsListResponse;
import java.io.IOException;
import java.util.List;
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

    public ClientSession create(ClientSessionsCreateRequest request) {
        return create(request, null);
    }

    public ClientSession create(ClientSessionsCreateRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("client_sessions/create")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                ClientSessionsCreateResponse parsedResponse = ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), ClientSessionsCreateResponse.class);
                return parsedResponse.getClientSession();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientSession create() {
        return create(ClientSessionsCreateRequest.builder().build());
    }

    public void delete(ClientSessionsDeleteRequest request) {
        delete(request, null);
    }

    public void delete(ClientSessionsDeleteRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("client_sessions/delete")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ClientSessionsDeleteResponse.class);
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientSession getById(String clientSessionId) {
        return get(ClientSessionsGetRequest.builder()
                .clientSessionId(clientSessionId)
                .build());
    }

    public ClientSession get(ClientSessionsGetRequest request) {
        return get(request, null);
    }

    public ClientSession get(ClientSessionsGetRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("client_sessions/get")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                ClientSessionsGetResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ClientSessionsGetResponse.class);
                return parsedResponse.getClientSession();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientSession get() {
        return get(ClientSessionsGetRequest.builder().build());
    }

    public List<ClientSession> list(ClientSessionsListRequest request) {
        return list(request, null);
    }

    public List<ClientSession> list(ClientSessionsListRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("client_sessions/list")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                ClientSessionsListResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ClientSessionsListResponse.class);
                return parsedResponse.getClientSessions();
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ClientSession> list() {
        return list(ClientSessionsListRequest.builder().build());
    }
}
