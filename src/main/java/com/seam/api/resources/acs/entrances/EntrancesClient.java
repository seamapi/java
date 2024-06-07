/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.entrances;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.seam.api.core.ClientOptions;
import com.seam.api.core.MediaTypes;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.core.SeamApiApiError;
import com.seam.api.core.SeamApiError;
import com.seam.api.errors.SeamApiBadRequestError;
import com.seam.api.errors.SeamApiUnauthorizedError;
import com.seam.api.resources.acs.entrances.requests.EntrancesGetRequest;
import com.seam.api.resources.acs.entrances.requests.EntrancesGrantAccessRequest;
import com.seam.api.resources.acs.entrances.requests.EntrancesListCredentialsWithAccessRequest;
import com.seam.api.resources.acs.entrances.requests.EntrancesListRequest;
import com.seam.api.resources.acs.entrances.types.EntrancesGetResponse;
import com.seam.api.resources.acs.entrances.types.EntrancesGrantAccessResponse;
import com.seam.api.resources.acs.entrances.types.EntrancesListCredentialsWithAccessResponse;
import com.seam.api.resources.acs.entrances.types.EntrancesListResponse;
import com.seam.api.types.AcsCredential;
import com.seam.api.types.AcsEntrance;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class EntrancesClient {
    protected final ClientOptions clientOptions;

    public EntrancesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public AcsEntrance get(EntrancesGetRequest request) {
        return get(request, null);
    }

    public AcsEntrance get(EntrancesGetRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("acs/entrances/get")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new SeamApiError("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                EntrancesGetResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), EntrancesGetResponse.class);
                return parsedResponse.getAcsEntrance();
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new SeamApiBadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                    case 401:
                        throw new SeamApiUnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new SeamApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new SeamApiError("Network error executing HTTP request", e);
        }
    }

    public EntrancesGrantAccessResponse grantAccess(EntrancesGrantAccessRequest request) {
        return grantAccess(request, null);
    }

    public EntrancesGrantAccessResponse grantAccess(
            EntrancesGrantAccessRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("acs/entrances/grant_access")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new SeamApiError("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), EntrancesGrantAccessResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new SeamApiBadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                    case 401:
                        throw new SeamApiUnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new SeamApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new SeamApiError("Network error executing HTTP request", e);
        }
    }

    public List<AcsEntrance> list() {
        return list(EntrancesListRequest.builder().build());
    }

    public List<AcsEntrance> list(EntrancesListRequest request) {
        return list(request, null);
    }

    public List<AcsEntrance> list(EntrancesListRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("acs/entrances/list")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new SeamApiError("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                EntrancesListResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), EntrancesListResponse.class);
                return parsedResponse.getAcsEntrances();
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new SeamApiBadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                    case 401:
                        throw new SeamApiUnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new SeamApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new SeamApiError("Network error executing HTTP request", e);
        }
    }

    public List<AcsCredential> listCredentialsWithAccess(EntrancesListCredentialsWithAccessRequest request) {
        return listCredentialsWithAccess(request, null);
    }

    public List<AcsCredential> listCredentialsWithAccess(
            EntrancesListCredentialsWithAccessRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("acs/entrances/list_credentials_with_access")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new SeamApiError("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                EntrancesListCredentialsWithAccessResponse parsedResponse = ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), EntrancesListCredentialsWithAccessResponse.class);
                return parsedResponse.getAcsCredentials();
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new SeamApiBadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                    case 401:
                        throw new SeamApiUnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new SeamApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new SeamApiError("Network error executing HTTP request", e);
        }
    }
}