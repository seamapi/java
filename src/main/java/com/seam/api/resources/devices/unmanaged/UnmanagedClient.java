package com.seam.api.resources.devices.unmanaged;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.devices.unmanaged.requests.UnmanagedListRequest;
import com.seam.api.resources.devices.unmanaged.requests.UnmanagedUpdateRequest;
import com.seam.api.types.UnmanagedListResponse;
import com.seam.api.types.UnmanagedUpdateResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class UnmanagedClient {
    protected final ClientOptions clientOptions;

    public UnmanagedClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public UnmanagedListResponse list(UnmanagedListRequest request) {
        return list(request, null);
    }

    public UnmanagedListResponse list(UnmanagedListRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("devices/unmanaged/list")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), UnmanagedListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public UnmanagedUpdateResponse update(UnmanagedUpdateRequest request) {
        return update(request, null);
    }

    public UnmanagedUpdateResponse update(UnmanagedUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("devices/unmanaged/update")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("is_managed", request.getIsManaged());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), UnmanagedUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
