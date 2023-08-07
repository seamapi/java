package com.seam.api.resources.noisesensors.noisethresholds;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseSensorsNoiseThresholdsCreateRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseSensorsNoiseThresholdsDeleteRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseSensorsNoiseThresholdsGetRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseSensorsNoiseThresholdsListRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseSensorsNoiseThresholdsUpdateRequest;
import com.seam.api.types.NoiseSensorsNoiseThresholdsCreateResponse;
import com.seam.api.types.NoiseSensorsNoiseThresholdsDeleteResponse;
import com.seam.api.types.NoiseSensorsNoiseThresholdsGetResponse;
import com.seam.api.types.NoiseSensorsNoiseThresholdsListResponse;
import com.seam.api.types.NoiseSensorsNoiseThresholdsUpdateResponse;
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

    public NoiseSensorsNoiseThresholdsCreateResponse create(NoiseSensorsNoiseThresholdsCreateRequest request) {
        return create(request, null);
    }

    public NoiseSensorsNoiseThresholdsCreateResponse create(
            NoiseSensorsNoiseThresholdsCreateRequest request, RequestOptions requestOptions) {
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
                        _response.body().string(), NoiseSensorsNoiseThresholdsCreateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NoiseSensorsNoiseThresholdsDeleteResponse delete(NoiseSensorsNoiseThresholdsDeleteRequest request) {
        return delete(request, null);
    }

    public NoiseSensorsNoiseThresholdsDeleteResponse delete(
            NoiseSensorsNoiseThresholdsDeleteRequest request, RequestOptions requestOptions) {
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
                        _response.body().string(), NoiseSensorsNoiseThresholdsDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NoiseSensorsNoiseThresholdsGetResponse get(NoiseSensorsNoiseThresholdsGetRequest request) {
        return get(request, null);
    }

    public NoiseSensorsNoiseThresholdsGetResponse get(
            NoiseSensorsNoiseThresholdsGetRequest request, RequestOptions requestOptions) {
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), NoiseSensorsNoiseThresholdsGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NoiseSensorsNoiseThresholdsListResponse list(NoiseSensorsNoiseThresholdsListRequest request) {
        return list(request, null);
    }

    public NoiseSensorsNoiseThresholdsListResponse list(
            NoiseSensorsNoiseThresholdsListRequest request, RequestOptions requestOptions) {
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
                        _response.body().string(), NoiseSensorsNoiseThresholdsListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NoiseSensorsNoiseThresholdsUpdateResponse update(NoiseSensorsNoiseThresholdsUpdateRequest request) {
        return update(request, null);
    }

    public NoiseSensorsNoiseThresholdsUpdateResponse update(
            NoiseSensorsNoiseThresholdsUpdateRequest request, RequestOptions requestOptions) {
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
                        _response.body().string(), NoiseSensorsNoiseThresholdsUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
