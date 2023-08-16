package com.seam.api.resources.accesscodes.unmanaged;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.accesscodes.unmanaged.requests.UnmanagedConvertToManagedRequest;
import com.seam.api.resources.accesscodes.unmanaged.requests.UnmanagedDeleteRequest;
import com.seam.api.resources.accesscodes.unmanaged.requests.UnmanagedGetRequest;
import com.seam.api.resources.accesscodes.unmanaged.requests.UnmanagedListRequest;
import com.seam.api.resources.accesscodes.unmanaged.requests.UnmanagedUpdateRequest;
import com.seam.api.types.UnmanagedConvertToManagedResponse;
import com.seam.api.types.UnmanagedDeleteResponse;
import com.seam.api.types.UnmanagedGetResponse;
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

    public UnmanagedConvertToManagedResponse convertToManaged(UnmanagedConvertToManagedRequest request) {
        return convertToManaged(request, null);
    }

    public UnmanagedConvertToManagedResponse convertToManaged(
            UnmanagedConvertToManagedRequest request, RequestOptions requestOptions) {
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
                        _response.body().string(), UnmanagedConvertToManagedResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public UnmanagedDeleteResponse delete(UnmanagedDeleteRequest request) {
        return delete(request, null);
    }

    public UnmanagedDeleteResponse delete(UnmanagedDeleteRequest request, RequestOptions requestOptions) {
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), UnmanagedDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public UnmanagedGetResponse get(UnmanagedGetRequest request) {
        return get(request, null);
    }

    public UnmanagedGetResponse get(UnmanagedGetRequest request, RequestOptions requestOptions) {
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), UnmanagedGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public UnmanagedListResponse list(UnmanagedListRequest request) {
        return list(request, null);
    }

    public UnmanagedListResponse list(UnmanagedListRequest request, RequestOptions requestOptions) {
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), UnmanagedUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
