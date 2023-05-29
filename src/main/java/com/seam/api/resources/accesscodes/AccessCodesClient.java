package com.seam.api.resources.accesscodes;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesDeleteRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesUpdatePutRequest;
import com.seam.api.types.AccessCodesCreateResponse;
import com.seam.api.types.AccessCodesDeleteResponse;
import com.seam.api.types.AccessCodesUpdatePutResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AccessCodesClient {
    protected final ClientOptions clientOptions;

    public AccessCodesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public AccessCodesCreateResponse create(AccessCodesCreateRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/create")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("name", request.getName());
        _requestBodyProperties.put("starts_at", request.getStartsAt());
        _requestBodyProperties.put("ends_at", request.getEndsAt());
        _requestBodyProperties.put("code", request.getCode());
        _requestBodyProperties.put("sync", request.getSync());
        _requestBodyProperties.put("attempt_for_offline_device", request.getAttemptForOfflineDevice());
        _requestBodyProperties.put("common_code_key", request.getCommonCodeKey());
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
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), AccessCodesCreateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCodesDeleteResponse delete(AccessCodesDeleteRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/delete")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("access_code_id", request.getAccessCodeId());
        _requestBodyProperties.put("sync", request.getSync());
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
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), AccessCodesDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCodesUpdatePutResponse updatePut(AccessCodesUpdatePutRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/update")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("name", request.getName());
        _requestBodyProperties.put("starts_at", request.getStartsAt());
        _requestBodyProperties.put("ends_at", request.getEndsAt());
        _requestBodyProperties.put("code", request.getCode());
        _requestBodyProperties.put("sync", request.getSync());
        _requestBodyProperties.put("attempt_for_offline_device", request.getAttemptForOfflineDevice());
        _requestBodyProperties.put("access_code_id", request.getAccessCodeId());
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("type", request.getType());
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
                .method("PUT", _requestBody)
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), AccessCodesUpdatePutResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
