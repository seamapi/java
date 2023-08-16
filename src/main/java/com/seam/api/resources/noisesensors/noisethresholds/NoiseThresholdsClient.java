package com.seam.api.resources.noisesensors.noisethresholds;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsCreateRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsDeleteRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsGetRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsListRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsUpdateRequest;
import com.seam.api.types.NoiseThresholdsCreateResponse;
import com.seam.api.types.NoiseThresholdsDeleteResponse;
import com.seam.api.types.NoiseThresholdsGetResponse;
import com.seam.api.types.NoiseThresholdsListResponse;
import com.seam.api.types.NoiseThresholdsUpdateResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class NoiseThresholdsClient {
    protected final ClientOptions clientOptions;

    public NoiseThresholdsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public NoiseThresholdsCreateResponse create(NoiseThresholdsCreateRequest request) {
        return create(request, null);
    }

    public NoiseThresholdsCreateResponse create(NoiseThresholdsCreateRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("noise_sensors/noise_thresholds/create")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        if (request.getSync().isPresent()) {
            _requestBodyProperties.put("sync", request.getSync());
        }
        if (request.getName().isPresent()) {
            _requestBodyProperties.put("name", request.getName());
        }
        _requestBodyProperties.put("starts_daily_at", request.getStartsDailyAt());
        _requestBodyProperties.put("ends_daily_at", request.getEndsDailyAt());
        if (request.getNoiseThresholdDecibels().isPresent()) {
            _requestBodyProperties.put("noise_threshold_decibels", request.getNoiseThresholdDecibels());
        }
        if (request.getNoiseThresholdNrs().isPresent()) {
            _requestBodyProperties.put("noise_threshold_nrs", request.getNoiseThresholdNrs());
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
                        _response.body().string(), NoiseThresholdsCreateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NoiseThresholdsDeleteResponse delete(NoiseThresholdsDeleteRequest request) {
        return delete(request, null);
    }

    public NoiseThresholdsDeleteResponse delete(NoiseThresholdsDeleteRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("noise_sensors/noise_thresholds/delete")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("noise_threshold_id", request.getNoiseThresholdId());
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), NoiseThresholdsDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NoiseThresholdsGetResponse get(NoiseThresholdsGetRequest request) {
        return get(request, null);
    }

    public NoiseThresholdsGetResponse get(NoiseThresholdsGetRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("noise_sensors/noise_thresholds/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("noise_threshold_id", request.getNoiseThresholdId());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), NoiseThresholdsGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NoiseThresholdsListResponse list(NoiseThresholdsListRequest request) {
        return list(request, null);
    }

    public NoiseThresholdsListResponse list(NoiseThresholdsListRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("noise_sensors/noise_thresholds/list")
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
                        _response.body().string(), NoiseThresholdsListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NoiseThresholdsUpdateResponse update(NoiseThresholdsUpdateRequest request) {
        return update(request, null);
    }

    public NoiseThresholdsUpdateResponse update(NoiseThresholdsUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("noise_sensors/noise_thresholds/update")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("noise_threshold_id", request.getNoiseThresholdId());
        _requestBodyProperties.put("device_id", request.getDeviceId());
        if (request.getSync().isPresent()) {
            _requestBodyProperties.put("sync", request.getSync());
        }
        if (request.getName().isPresent()) {
            _requestBodyProperties.put("name", request.getName());
        }
        if (request.getStartsDailyAt().isPresent()) {
            _requestBodyProperties.put("starts_daily_at", request.getStartsDailyAt());
        }
        if (request.getEndsDailyAt().isPresent()) {
            _requestBodyProperties.put("ends_daily_at", request.getEndsDailyAt());
        }
        if (request.getNoiseThresholdDecibels().isPresent()) {
            _requestBodyProperties.put("noise_threshold_decibels", request.getNoiseThresholdDecibels());
        }
        if (request.getNoiseThresholdNrs().isPresent()) {
            _requestBodyProperties.put("noise_threshold_nrs", request.getNoiseThresholdNrs());
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
                        _response.body().string(), NoiseThresholdsUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
