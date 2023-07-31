package com.seam.api.resources.devices.unmanaged;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.devices.unmanaged.requests.DevicesUnmanagedListRequest;
import com.seam.api.resources.devices.unmanaged.requests.DevicesUnmanagedUpdateRequest;
import com.seam.api.types.DevicesUnmanagedListResponse;
import com.seam.api.types.DevicesUnmanagedUpdateResponse;
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

    public DevicesUnmanagedListResponse list(DevicesUnmanagedListRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("devices/unmanaged/list")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("connected_account_id", request.getConnectedAccountId());
        _requestBodyProperties.put("connected_account_ids", request.getConnectedAccountIds());
        _requestBodyProperties.put("connect_webview_id", request.getConnectWebviewId());
        _requestBodyProperties.put("device_type", request.getDeviceType());
        _requestBodyProperties.put("device_types", request.getDeviceTypes());
        _requestBodyProperties.put("manufacturer", request.getManufacturer());
        _requestBodyProperties.put("device_ids", request.getDeviceIds());
        _requestBodyProperties.put("limit", request.getLimit());
        _requestBodyProperties.put("created_before", request.getCreatedBefore());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), DevicesUnmanagedListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DevicesUnmanagedUpdateResponse update(DevicesUnmanagedUpdateRequest request) {
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
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), DevicesUnmanagedUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
