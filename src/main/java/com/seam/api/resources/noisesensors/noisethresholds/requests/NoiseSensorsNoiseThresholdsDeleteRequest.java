package com.seam.api.resources.noisesensors.noisethresholds.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NoiseSensorsNoiseThresholdsDeleteRequest.Builder.class)
public final class NoiseSensorsNoiseThresholdsDeleteRequest {
    private final String noiseThresholdId;

    private final String deviceId;

    private final Optional<Boolean> sync;

    private NoiseSensorsNoiseThresholdsDeleteRequest(String noiseThresholdId, String deviceId, Optional<Boolean> sync) {
        this.noiseThresholdId = noiseThresholdId;
        this.deviceId = deviceId;
        this.sync = sync;
    }

    @JsonProperty("noise_threshold_id")
    public String getNoiseThresholdId() {
        return noiseThresholdId;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("sync")
    public Optional<Boolean> getSync() {
        return sync;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseSensorsNoiseThresholdsDeleteRequest
                && equalTo((NoiseSensorsNoiseThresholdsDeleteRequest) other);
    }

    private boolean equalTo(NoiseSensorsNoiseThresholdsDeleteRequest other) {
        return noiseThresholdId.equals(other.noiseThresholdId)
                && deviceId.equals(other.deviceId)
                && sync.equals(other.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.noiseThresholdId, this.deviceId, this.sync);
    }

    @Override
    public String toString() {
        return "NoiseSensorsNoiseThresholdsDeleteRequest{" + "noiseThresholdId: " + noiseThresholdId + ", deviceId: "
                + deviceId + ", sync: " + sync + "}";
    }

    public static NoiseThresholdIdStage builder() {
        return new Builder();
    }

    public interface NoiseThresholdIdStage {
        DeviceIdStage noiseThresholdId(String noiseThresholdId);

        Builder from(NoiseSensorsNoiseThresholdsDeleteRequest other);
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);
    }

    public interface _FinalStage {
        NoiseSensorsNoiseThresholdsDeleteRequest build();

        _FinalStage sync(Optional<Boolean> sync);

        _FinalStage sync(Boolean sync);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NoiseThresholdIdStage, DeviceIdStage, _FinalStage {
        private String noiseThresholdId;

        private String deviceId;

        private Optional<Boolean> sync = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(NoiseSensorsNoiseThresholdsDeleteRequest other) {
            noiseThresholdId(other.getNoiseThresholdId());
            deviceId(other.getDeviceId());
            sync(other.getSync());
            return this;
        }

        @Override
        @JsonSetter("noise_threshold_id")
        public DeviceIdStage noiseThresholdId(String noiseThresholdId) {
            this.noiseThresholdId = noiseThresholdId;
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public _FinalStage sync(Boolean sync) {
            this.sync = Optional.of(sync);
            return this;
        }

        @Override
        @JsonSetter(value = "sync", nulls = Nulls.SKIP)
        public _FinalStage sync(Optional<Boolean> sync) {
            this.sync = sync;
            return this;
        }

        @Override
        public NoiseSensorsNoiseThresholdsDeleteRequest build() {
            return new NoiseSensorsNoiseThresholdsDeleteRequest(noiseThresholdId, deviceId, sync);
        }
    }
}
