package com.seam.api.resources.accesscodes;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.Suppliers;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateMultipleRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesDeleteRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesGetRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesListRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesPullBackupAccessCodeRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesUpdateRequest;
import com.seam.api.resources.accesscodes.simulate.SimulateClient;
import com.seam.api.resources.accesscodes.unmanaged.UnmanagedClient;
import com.seam.api.types.AccessCodesCreateMultipleResponse;
import com.seam.api.types.AccessCodesCreateResponse;
import com.seam.api.types.AccessCodesDeleteResponse;
import com.seam.api.types.AccessCodesGetResponse;
import com.seam.api.types.AccessCodesListResponse;
import com.seam.api.types.AccessCodesPullBackupAccessCodeResponse;
import com.seam.api.types.AccessCodesUpdateResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AccessCodesClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<SimulateClient> simulateClient;

    protected final Supplier<UnmanagedClient> unmanagedClient;

    public AccessCodesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.simulateClient = Suppliers.memoize(() -> new SimulateClient(clientOptions));
        this.unmanagedClient = Suppliers.memoize(() -> new UnmanagedClient(clientOptions));
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
        _requestBodyProperties.put("prefer_native_scheduling", request.getPreferNativeScheduling());
        _requestBodyProperties.put("use_backup_access_code_pool", request.getUseBackupAccessCodePool());
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

    public AccessCodesCreateMultipleResponse createMultiple(AccessCodesCreateMultipleRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/create_multiple")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_ids", request.getDeviceIds());
        _requestBodyProperties.put("behavior_when_code_cannot_be_shared", request.getBehaviorWhenCodeCannotBeShared());
        _requestBodyProperties.put("name", request.getName());
        _requestBodyProperties.put("starts_at", request.getStartsAt());
        _requestBodyProperties.put("ends_at", request.getEndsAt());
        _requestBodyProperties.put("code", request.getCode());
        _requestBodyProperties.put("attempt_for_offline_device", request.getAttemptForOfflineDevice());
        _requestBodyProperties.put("prefer_native_scheduling", request.getPreferNativeScheduling());
        _requestBodyProperties.put("use_backup_access_code_pool", request.getUseBackupAccessCodePool());
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
                        _response.body().string(), AccessCodesCreateMultipleResponse.class);
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

    public AccessCodesGetResponse get(AccessCodesGetRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("access_code_id", request.getAccessCodeId());
        _requestBodyProperties.put("code", request.getCode());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), AccessCodesGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCodesListResponse list(AccessCodesListRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/list")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("access_code_ids", request.getAccessCodeIds());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), AccessCodesListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCodesPullBackupAccessCodeResponse pullBackupAccessCode(
            AccessCodesPullBackupAccessCodeRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("access_codes/pull_backup_access_code")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("access_code_id", request.getAccessCodeId());
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
                        _response.body().string(), AccessCodesPullBackupAccessCodeResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AccessCodesUpdateResponse update(AccessCodesUpdateRequest request) {
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
        _requestBodyProperties.put("prefer_native_scheduling", request.getPreferNativeScheduling());
        _requestBodyProperties.put("use_backup_access_code_pool", request.getUseBackupAccessCodePool());
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
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), AccessCodesUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public SimulateClient simulate() {
        return this.simulateClient.get();
    }

    public UnmanagedClient unmanaged() {
        return this.unmanagedClient.get();
    }
}
