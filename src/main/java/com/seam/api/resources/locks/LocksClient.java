package com.seam.api.resources.locks;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.locks.requests.LocksGetRequest;
import com.seam.api.resources.locks.requests.LocksListRequest;
import com.seam.api.resources.locks.requests.LocksLockDoorRequest;
import com.seam.api.resources.locks.requests.LocksUnlockDoorRequest;
import com.seam.api.types.LocksGetResponse;
import com.seam.api.types.LocksListResponse;
import com.seam.api.types.LocksLockDoorResponse;
import com.seam.api.types.LocksUnlockDoorResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LocksClient {
    protected final ClientOptions clientOptions;

    public LocksClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public LocksGetResponse get(LocksGetRequest request) {
        return get(request, null);
    }

    public LocksGetResponse get(LocksGetRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("locks/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getDeviceId().isPresent()) {
            _requestBodyProperties.put("device_id", request.getDeviceId());
        }
        if (request.getName().isPresent()) {
            _requestBodyProperties.put("name", request.getName());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), LocksGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public LocksListResponse list(LocksListRequest request) {
        return list(request, null);
    }

    public LocksListResponse list(LocksListRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("locks/list")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getConnectedAccountId().isPresent()) {
            _requestBodyProperties.put("connected_account_id", request.getConnectedAccountId());
        }
        if (request.getConnectedAccountIds().isPresent()) {
            _requestBodyProperties.put("connected_account_ids", request.getConnectedAccountIds());
        }
        if (request.getConnectWebviewId().isPresent()) {
            _requestBodyProperties.put("connect_webview_id", request.getConnectWebviewId());
        }
        if (request.getDeviceType().isPresent()) {
            _requestBodyProperties.put("device_type", request.getDeviceType());
        }
        if (request.getDeviceTypes().isPresent()) {
            _requestBodyProperties.put("device_types", request.getDeviceTypes());
        }
        if (request.getManufacturer().isPresent()) {
            _requestBodyProperties.put("manufacturer", request.getManufacturer());
        }
        if (request.getDeviceIds().isPresent()) {
            _requestBodyProperties.put("device_ids", request.getDeviceIds());
        }
        if (request.getLimit().isPresent()) {
            _requestBodyProperties.put("limit", request.getLimit());
        }
        if (request.getCreatedBefore().isPresent()) {
            _requestBodyProperties.put("created_before", request.getCreatedBefore());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), LocksListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public LocksLockDoorResponse lockDoor(LocksLockDoorRequest request) {
        return lockDoor(request, null);
    }

    public LocksLockDoorResponse lockDoor(LocksLockDoorRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("locks/lock_door")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        if (request.getSync().isPresent()) {
            _requestBodyProperties.put("sync", request.getSync());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), LocksLockDoorResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public LocksUnlockDoorResponse unlockDoor(LocksUnlockDoorRequest request) {
        return unlockDoor(request, null);
    }

    public LocksUnlockDoorResponse unlockDoor(LocksUnlockDoorRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("locks/unlock_door")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        if (request.getSync().isPresent()) {
            _requestBodyProperties.put("sync", request.getSync());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), LocksUnlockDoorResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}