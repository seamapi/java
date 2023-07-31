package com.seam.api.resources.thermostats.climatesettingschedules;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ThermostatsClimateSettingSchedulesCreateRequest;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ThermostatsClimateSettingSchedulesDeleteRequest;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ThermostatsClimateSettingSchedulesGetRequest;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ThermostatsClimateSettingSchedulesListRequest;
import com.seam.api.resources.thermostats.climatesettingschedules.requests.ThermostatsClimateSettingSchedulesUpdateRequest;
import com.seam.api.types.ThermostatsClimateSettingSchedulesCreateResponse;
import com.seam.api.types.ThermostatsClimateSettingSchedulesDeleteResponse;
import com.seam.api.types.ThermostatsClimateSettingSchedulesGetResponse;
import com.seam.api.types.ThermostatsClimateSettingSchedulesListResponse;
import com.seam.api.types.ThermostatsClimateSettingSchedulesUpdateResponse;
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

    public ThermostatsClimateSettingSchedulesCreateResponse create(
            ThermostatsClimateSettingSchedulesCreateRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/climate_setting_schedules/create")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("schedule_type", request.getScheduleType());
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("name", request.getName());
        _requestBodyProperties.put("schedule_starts_at", request.getScheduleStartsAt());
        _requestBodyProperties.put("schedule_ends_at", request.getScheduleEndsAt());
        _requestBodyProperties.put("automatic_heating_enabled", request.getAutomaticHeatingEnabled());
        _requestBodyProperties.put("automatic_cooling_enabled", request.getAutomaticCoolingEnabled());
        _requestBodyProperties.put("hvac_mode_setting", request.getHvacModeSetting());
        _requestBodyProperties.put("cooling_set_point_celsius", request.getCoolingSetPointCelsius());
        _requestBodyProperties.put("heating_set_point_celsius", request.getHeatingSetPointCelsius());
        _requestBodyProperties.put("cooling_set_point_fahrenheit", request.getCoolingSetPointFahrenheit());
        _requestBodyProperties.put("heating_set_point_fahrenheit", request.getHeatingSetPointFahrenheit());
        _requestBodyProperties.put("manual_override_allowed", request.getManualOverrideAllowed());
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
                        _response.body().string(), ThermostatsClimateSettingSchedulesCreateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ThermostatsClimateSettingSchedulesDeleteResponse delete(
            ThermostatsClimateSettingSchedulesDeleteRequest request) {
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
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), ThermostatsClimateSettingSchedulesDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ThermostatsClimateSettingSchedulesGetResponse get(ThermostatsClimateSettingSchedulesGetRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/climate_setting_schedules/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("climate_setting_schedule_id", request.getClimateSettingScheduleId());
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
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), ThermostatsClimateSettingSchedulesGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ThermostatsClimateSettingSchedulesListResponse list(ThermostatsClimateSettingSchedulesListRequest request) {
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
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), ThermostatsClimateSettingSchedulesListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ThermostatsClimateSettingSchedulesUpdateResponse update(
            ThermostatsClimateSettingSchedulesUpdateRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/climate_setting_schedules/update")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("climate_setting_schedule_id", request.getClimateSettingScheduleId());
        _requestBodyProperties.put("schedule_type", request.getScheduleType());
        _requestBodyProperties.put("name", request.getName());
        _requestBodyProperties.put("schedule_starts_at", request.getScheduleStartsAt());
        _requestBodyProperties.put("schedule_ends_at", request.getScheduleEndsAt());
        _requestBodyProperties.put("automatic_heating_enabled", request.getAutomaticHeatingEnabled());
        _requestBodyProperties.put("automatic_cooling_enabled", request.getAutomaticCoolingEnabled());
        _requestBodyProperties.put("hvac_mode_setting", request.getHvacModeSetting());
        _requestBodyProperties.put("cooling_set_point_celsius", request.getCoolingSetPointCelsius());
        _requestBodyProperties.put("heating_set_point_celsius", request.getHeatingSetPointCelsius());
        _requestBodyProperties.put("cooling_set_point_fahrenheit", request.getCoolingSetPointFahrenheit());
        _requestBodyProperties.put("heating_set_point_fahrenheit", request.getHeatingSetPointFahrenheit());
        _requestBodyProperties.put("manual_override_allowed", request.getManualOverrideAllowed());
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
                        _response.body().string(), ThermostatsClimateSettingSchedulesUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
