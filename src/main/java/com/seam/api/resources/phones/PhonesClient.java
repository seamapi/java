/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.phones;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.seam.api.core.ClientOptions;
import com.seam.api.core.MediaTypes;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.core.SeamApiApiError;
import com.seam.api.core.SeamApiError;
import com.seam.api.core.Suppliers;
import com.seam.api.errors.SeamApiBadRequestError;
import com.seam.api.errors.SeamApiUnauthorizedError;
import com.seam.api.resources.phones.requests.PhonesDeactivateRequest;
import com.seam.api.resources.phones.requests.PhonesListRequest;
import com.seam.api.resources.phones.simulate.SimulateClient;
import com.seam.api.resources.phones.types.PhonesDeactivateResponse;
import com.seam.api.resources.phones.types.PhonesListResponse;
import com.seam.api.types.Phone;
import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class PhonesClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<SimulateClient> simulateClient;

    public PhonesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.simulateClient = Suppliers.memoize(() -> new SimulateClient(clientOptions));
    }

    public PhonesDeactivateResponse deactivate(PhonesDeactivateRequest request) {
        return deactivate(request, null);
    }

    public PhonesDeactivateResponse deactivate(PhonesDeactivateRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("phones/deactivate")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), PhonesDeactivateResponse.class);
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

    public List<Phone> list() {
        return list(PhonesListRequest.builder().build());
    }

    public List<Phone> list(PhonesListRequest request) {
        return list(request, null);
    }

    public List<Phone> list(PhonesListRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("phones/list")
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
                PhonesListResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), PhonesListResponse.class);
                return parsedResponse.getPhones();
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

    public SimulateClient simulate() {
        return this.simulateClient.get();
    }
}
