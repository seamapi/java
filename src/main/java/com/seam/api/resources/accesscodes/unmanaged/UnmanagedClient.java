package com.seam.api.resources.accesscodes.unmanaged;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.accesscodes.unmanaged.requests.AccessCodesUnmanagedConvertToManagedRequest;
import com.seam.api.resources.accesscodes.unmanaged.requests.AccessCodesUnmanagedDeleteRequest;
import com.seam.api.resources.accesscodes.unmanaged.requests.AccessCodesUnmanagedGetRequest;
import com.seam.api.resources.accesscodes.unmanaged.requests.AccessCodesUnmanagedListRequest;
import com.seam.api.resources.accesscodes.unmanaged.requests.AccessCodesUnmanagedUpdateRequest;
import com.seam.api.types.AccessCodesUnmanagedConvertToManagedResponse;
import com.seam.api.types.AccessCodesUnmanagedDeleteResponse;
import com.seam.api.types.AccessCodesUnmanagedGetResponse;
import com.seam.api.types.AccessCodesUnmanagedListResponse;
import com.seam.api.types.AccessCodesUnmanagedUpdateResponse;
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

    public AccessCodesUnmanagedConvertToManagedResponse convertToManaged(
            AccessCodesUnmanagedConvertToManagedRequest request) {
        return convertToManaged(request, null);
    }

    public AccessCodesUnmanagedConvertToManagedResponse convertToManaged(
            AccessCodesUnmanagedConvertToManagedRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/unmanaged/convert_to_managed")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("access_code_id", request.getAccessCodeId());
        if (request.getForce().isPresent()) {
            _requestBodyProperties.put("force", request.getForce());
        }
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), AccessCodesUnmanagedConvertToManagedResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCodesUnmanagedDeleteResponse delete(AccessCodesUnmanagedDeleteRequest request) {
        return delete(request, null);
    }

    public AccessCodesUnmanagedDeleteResponse delete(
            AccessCodesUnmanagedDeleteRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/unmanaged/delete")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("access_code_id", request.getAccessCodeId());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), AccessCodesUnmanagedDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCodesUnmanagedGetResponse get(AccessCodesUnmanagedGetRequest request) {
        return get(request, null);
    }

    public AccessCodesUnmanagedGetResponse get(AccessCodesUnmanagedGetRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/unmanaged/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getDeviceId().isPresent()) {
            _requestBodyProperties.put("device_id", request.getDeviceId());
        }
        if (request.getAccessCodeId().isPresent()) {
            _requestBodyProperties.put("access_code_id", request.getAccessCodeId());
        }
        if (request.getCode().isPresent()) {
            _requestBodyProperties.put("code", request.getCode());
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
                        _response.body().string(), AccessCodesUnmanagedGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCodesUnmanagedListResponse list(AccessCodesUnmanagedListRequest request) {
        return list(request, null);
    }

    public AccessCodesUnmanagedListResponse list(
            AccessCodesUnmanagedListRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/unmanaged/list")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
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
                        _response.body().string(), AccessCodesUnmanagedListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCodesUnmanagedUpdateResponse update(AccessCodesUnmanagedUpdateRequest request) {
        return update(request, null);
    }

    public AccessCodesUnmanagedUpdateResponse update(
            AccessCodesUnmanagedUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/unmanaged/update")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("access_code_id", request.getAccessCodeId());
        _requestBodyProperties.put("is_managed", request.getIsManaged());
        if (request.getForce().isPresent()) {
            _requestBodyProperties.put("force", request.getForce());
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
                        _response.body().string(), AccessCodesUnmanagedUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
