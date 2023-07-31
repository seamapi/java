package com.seam.api.resources.noisesensors.simulate;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.noisesensors.simulate.requests.NoiseSensorsSimulateTriggerNoiseThresholdRequest;
import com.seam.api.types.NoiseSensorsSimulateTriggerNoiseThresholdResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SimulateClient {
    protected final ClientOptions clientOptions;

    public SimulateClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public NoiseSensorsSimulateTriggerNoiseThresholdResponse triggerNoiseThreshold(
            NoiseSensorsSimulateTriggerNoiseThresholdRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("noise_sensors/simulate/trigger_noise_threshold")
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
                        _response.body().string(), NoiseSensorsSimulateTriggerNoiseThresholdResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
