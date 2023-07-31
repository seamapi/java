package com.seam.api.resources.noisesensors.simulate.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = NoiseSensorsSimulateTriggerNoiseThresholdRequest.Builder.class)
public final class NoiseSensorsSimulateTriggerNoiseThresholdRequest {
    private final String deviceId;

    private NoiseSensorsSimulateTriggerNoiseThresholdRequest(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseSensorsSimulateTriggerNoiseThresholdRequest
                && equalTo((NoiseSensorsSimulateTriggerNoiseThresholdRequest) other);
    }

    private boolean equalTo(NoiseSensorsSimulateTriggerNoiseThresholdRequest other) {
        return deviceId.equals(other.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId);
    }

    @Override
    public String toString() {
        return "NoiseSensorsSimulateTriggerNoiseThresholdRequest{" + "deviceId: " + deviceId + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);

        Builder from(NoiseSensorsSimulateTriggerNoiseThresholdRequest other);
    }

    public interface _FinalStage {
        NoiseSensorsSimulateTriggerNoiseThresholdRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, _FinalStage {
        private String deviceId;

        private Builder() {}

        @Override
        public Builder from(NoiseSensorsSimulateTriggerNoiseThresholdRequest other) {
            deviceId(other.getDeviceId());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public NoiseSensorsSimulateTriggerNoiseThresholdRequest build() {
            return new NoiseSensorsSimulateTriggerNoiseThresholdRequest(deviceId);
        }
    }
}
