package com.seam.api.resources.thermostats.climatesettingschedules;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ClimateSettingSchedulesCreateRequest;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ClimateSettingSchedulesDeleteRequest;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ClimateSettingSchedulesGetRequest;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ClimateSettingSchedulesListRequest;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ClimateSettingSchedulesUpdateRequest;
import com.seam.api.types.ClimateSettingSchedulesCreateResponse;
import com.seam.api.types.ClimateSettingSchedulesDeleteResponse;
import com.seam.api.types.ClimateSettingSchedulesGetResponse;
import com.seam.api.types.ClimateSettingSchedulesListResponse;
import com.seam.api.types.ClimateSettingSchedulesUpdateResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ClimateSettingSchedulesClient {
    protected final ClientOptions clientOptions;

    public ClimateSettingSchedulesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public ClimateSettingSchedulesCreateResponse create(ClimateSettingSchedulesCreateRequest request) {
        return create(request, null);
    }

    public ClimateSettingSchedulesCreateResponse create(
            ClimateSettingSchedulesCreateRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/climate_setting_schedules/create")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getScheduleType().isPresent()) {
            _requestBodyProperties.put("schedule_type", request.getScheduleType());
        }
        _requestBodyProperties.put("device_id", request.getDeviceId());
        if (request.getName().isPresent()) {
            _requestBodyProperties.put("name", request.getName());
        }
        _requestBodyProperties.put("schedule_starts_at", request.getScheduleStartsAt());
        _requestBodyProperties.put("schedule_ends_at", request.getScheduleEndsAt());
        if (request.getAutomaticHeatingEnabled().isPresent()) {
            _requestBodyProperties.put("automatic_heating_enabled", request.getAutomaticHeatingEnabled());
        }
        if (request.getAutomaticCoolingEnabled().isPresent()) {
            _requestBodyProperties.put("automatic_cooling_enabled", request.getAutomaticCoolingEnabled());
        }
        if (request.getHvacModeSetting().isPresent()) {
            _requestBodyProperties.put("hvac_mode_setting", request.getHvacModeSetting());
        }
        if (request.getCoolingSetPointCelsius().isPresent()) {
            _requestBodyProperties.put("cooling_set_point_celsius", request.getCoolingSetPointCelsius());
        }
        if (request.getHeatingSetPointCelsius().isPresent()) {
            _requestBodyProperties.put("heating_set_point_celsius", request.getHeatingSetPointCelsius());
        }
        if (request.getCoolingSetPointFahrenheit().isPresent()) {
            _requestBodyProperties.put("cooling_set_point_fahrenheit", request.getCoolingSetPointFahrenheit());
        }
        if (request.getHeatingSetPointFahrenheit().isPresent()) {
            _requestBodyProperties.put("heating_set_point_fahrenheit", request.getHeatingSetPointFahrenheit());
        }
        if (request.getManualOverrideAllowed().isPresent()) {
            _requestBodyProperties.put("manual_override_allowed", request.getManualOverrideAllowed());
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
                        _response.body().string(), ClimateSettingSchedulesCreateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ClimateSettingSchedulesDeleteResponse delete(ClimateSettingSchedulesDeleteRequest request) {
        return delete(request, null);
    }

    public ClimateSettingSchedulesDeleteResponse delete(
            ClimateSettingSchedulesDeleteRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/climate_setting_schedules/delete")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("climate_setting_schedule_id", request.getClimateSettingScheduleId());
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
                        _response.body().string(), ClimateSettingSchedulesDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ClimateSettingSchedulesGetResponse get(ClimateSettingSchedulesGetRequest request) {
        return get(request, null);
    }

    public ClimateSettingSchedulesGetResponse get(
            ClimateSettingSchedulesGetRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/climate_setting_schedules/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getClimateSettingScheduleId().isPresent()) {
            _requestBodyProperties.put("climate_setting_schedule_id", request.getClimateSettingScheduleId());
        }
        if (request.getDeviceId().isPresent()) {
            _requestBodyProperties.put("device_id", request.getDeviceId());
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
                        _response.body().string(), ClimateSettingSchedulesGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ClimateSettingSchedulesListResponse list(ClimateSettingSchedulesListRequest request) {
        return list(request, null);
    }

    public ClimateSettingSchedulesListResponse list(
            ClimateSettingSchedulesListRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/climate_setting_schedules/list")
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
                        _response.body().string(), ClimateSettingSchedulesListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ClimateSettingSchedulesUpdateResponse update(ClimateSettingSchedulesUpdateRequest request) {
        return update(request, null);
    }

    public ClimateSettingSchedulesUpdateResponse update(
            ClimateSettingSchedulesUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/climate_setting_schedules/update")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("climate_setting_schedule_id", request.getClimateSettingScheduleId());
        if (request.getScheduleType().isPresent()) {
            _requestBodyProperties.put("schedule_type", request.getScheduleType());
        }
        if (request.getName().isPresent()) {
            _requestBodyProperties.put("name", request.getName());
        }
        if (request.getScheduleStartsAt().isPresent()) {
            _requestBodyProperties.put("schedule_starts_at", request.getScheduleStartsAt());
        }
        if (request.getScheduleEndsAt().isPresent()) {
            _requestBodyProperties.put("schedule_ends_at", request.getScheduleEndsAt());
        }
        if (request.getAutomaticHeatingEnabled().isPresent()) {
            _requestBodyProperties.put("automatic_heating_enabled", request.getAutomaticHeatingEnabled());
        }
        if (request.getAutomaticCoolingEnabled().isPresent()) {
            _requestBodyProperties.put("automatic_cooling_enabled", request.getAutomaticCoolingEnabled());
        }
        if (request.getHvacModeSetting().isPresent()) {
            _requestBodyProperties.put("hvac_mode_setting", request.getHvacModeSetting());
        }
        if (request.getCoolingSetPointCelsius().isPresent()) {
            _requestBodyProperties.put("cooling_set_point_celsius", request.getCoolingSetPointCelsius());
        }
        if (request.getHeatingSetPointCelsius().isPresent()) {
            _requestBodyProperties.put("heating_set_point_celsius", request.getHeatingSetPointCelsius());
        }
        if (request.getCoolingSetPointFahrenheit().isPresent()) {
            _requestBodyProperties.put("cooling_set_point_fahrenheit", request.getCoolingSetPointFahrenheit());
        }
        if (request.getHeatingSetPointFahrenheit().isPresent()) {
            _requestBodyProperties.put("heating_set_point_fahrenheit", request.getHeatingSetPointFahrenheit());
        }
        if (request.getManualOverrideAllowed().isPresent()) {
            _requestBodyProperties.put("manual_override_allowed", request.getManualOverrideAllowed());
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
                        _response.body().string(), ClimateSettingSchedulesUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
