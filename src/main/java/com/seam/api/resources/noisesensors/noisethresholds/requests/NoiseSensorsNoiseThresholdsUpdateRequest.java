package com.seam.api.resources.noisesensors.noisethresholds.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = NoiseSensorsNoiseThresholdsUpdateRequest.Builder.class)
public final class NoiseSensorsNoiseThresholdsUpdateRequest {
    private final String noiseThresholdId;

    private final String deviceId;

    private final Optional<Boolean> sync;

    private final Optional<String> name;

    private final Optional<String> startsDailyAt;

    private final Optional<String> endsDailyAt;

    private final Optional<Double> noiseThresholdDecibels;

    private final Optional<Double> noiseThresholdNrs;

    private NoiseSensorsNoiseThresholdsUpdateRequest(
            String noiseThresholdId,
            String deviceId,
            Optional<Boolean> sync,
            Optional<String> name,
            Optional<String> startsDailyAt,
            Optional<String> endsDailyAt,
            Optional<Double> noiseThresholdDecibels,
            Optional<Double> noiseThresholdNrs) {
        this.noiseThresholdId = noiseThresholdId;
        this.deviceId = deviceId;
        this.sync = sync;
        this.name = name;
        this.startsDailyAt = startsDailyAt;
        this.endsDailyAt = endsDailyAt;
        this.noiseThresholdDecibels = noiseThresholdDecibels;
        this.noiseThresholdNrs = noiseThresholdNrs;
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

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("starts_daily_at")
    public Optional<String> getStartsDailyAt() {
        return startsDailyAt;
    }

    @JsonProperty("ends_daily_at")
    public Optional<String> getEndsDailyAt() {
        return endsDailyAt;
    }

    @JsonProperty("noise_threshold_decibels")
    public Optional<Double> getNoiseThresholdDecibels() {
        return noiseThresholdDecibels;
    }

    @JsonProperty("noise_threshold_nrs")
    public Optional<Double> getNoiseThresholdNrs() {
        return noiseThresholdNrs;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseSensorsNoiseThresholdsUpdateRequest
                && equalTo((NoiseSensorsNoiseThresholdsUpdateRequest) other);
    }

    private boolean equalTo(NoiseSensorsNoiseThresholdsUpdateRequest other) {
        return noiseThresholdId.equals(other.noiseThresholdId)
                && deviceId.equals(other.deviceId)
                && sync.equals(other.sync)
                && name.equals(other.name)
                && startsDailyAt.equals(other.startsDailyAt)
                && endsDailyAt.equals(other.endsDailyAt)
                && noiseThresholdDecibels.equals(other.noiseThresholdDecibels)
                && noiseThresholdNrs.equals(other.noiseThresholdNrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.noiseThresholdId,
                this.deviceId,
                this.sync,
                this.name,
                this.startsDailyAt,
                this.endsDailyAt,
                this.noiseThresholdDecibels,
                this.noiseThresholdNrs);
    }

    @Override
    public String toString() {
        return "NoiseSensorsNoiseThresholdsUpdateRequest{" + "noiseThresholdId: " + noiseThresholdId + ", deviceId: "
                + deviceId + ", sync: " + sync + ", name: " + name + ", startsDailyAt: " + startsDailyAt
                + ", endsDailyAt: " + endsDailyAt + ", noiseThresholdDecibels: " + noiseThresholdDecibels
                + ", noiseThresholdNrs: " + noiseThresholdNrs + "}";
    }

    public static NoiseThresholdIdStage builder() {
        return new Builder();
    }

    public interface NoiseThresholdIdStage {
        DeviceIdStage noiseThresholdId(String noiseThresholdId);

        Builder from(NoiseSensorsNoiseThresholdsUpdateRequest other);
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);
    }

    public interface _FinalStage {
        NoiseSensorsNoiseThresholdsUpdateRequest build();

        _FinalStage sync(Optional<Boolean> sync);

        _FinalStage sync(Boolean sync);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage startsDailyAt(Optional<String> startsDailyAt);

        _FinalStage startsDailyAt(String startsDailyAt);

        _FinalStage endsDailyAt(Optional<String> endsDailyAt);

        _FinalStage endsDailyAt(String endsDailyAt);

        _FinalStage noiseThresholdDecibels(Optional<Double> noiseThresholdDecibels);

        _FinalStage noiseThresholdDecibels(Double noiseThresholdDecibels);

        _FinalStage noiseThresholdNrs(Optional<Double> noiseThresholdNrs);

        _FinalStage noiseThresholdNrs(Double noiseThresholdNrs);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NoiseThresholdIdStage, DeviceIdStage, _FinalStage {
        private String noiseThresholdId;

        private String deviceId;

        private Optional<Double> noiseThresholdNrs = Optional.empty();

        private Optional<Double> noiseThresholdDecibels = Optional.empty();

        private Optional<String> endsDailyAt = Optional.empty();

        private Optional<String> startsDailyAt = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Boolean> sync = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(NoiseSensorsNoiseThresholdsUpdateRequest other) {
            noiseThresholdId(other.getNoiseThresholdId());
            deviceId(other.getDeviceId());
            sync(other.getSync());
            name(other.getName());
            startsDailyAt(other.getStartsDailyAt());
            endsDailyAt(other.getEndsDailyAt());
            noiseThresholdDecibels(other.getNoiseThresholdDecibels());
            noiseThresholdNrs(other.getNoiseThresholdNrs());
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
        public _FinalStage noiseThresholdNrs(Double noiseThresholdNrs) {
            this.noiseThresholdNrs = Optional.of(noiseThresholdNrs);
            return this;
        }

        @Override
        @JsonSetter(value = "noise_threshold_nrs", nulls = Nulls.SKIP)
        public _FinalStage noiseThresholdNrs(Optional<Double> noiseThresholdNrs) {
            this.noiseThresholdNrs = noiseThresholdNrs;
            return this;
        }

        @Override
        public _FinalStage noiseThresholdDecibels(Double noiseThresholdDecibels) {
            this.noiseThresholdDecibels = Optional.of(noiseThresholdDecibels);
            return this;
        }

        @Override
        @JsonSetter(value = "noise_threshold_decibels", nulls = Nulls.SKIP)
        public _FinalStage noiseThresholdDecibels(Optional<Double> noiseThresholdDecibels) {
            this.noiseThresholdDecibels = noiseThresholdDecibels;
            return this;
        }

        @Override
        public _FinalStage endsDailyAt(String endsDailyAt) {
            this.endsDailyAt = Optional.of(endsDailyAt);
            return this;
        }

        @Override
        @JsonSetter(value = "ends_daily_at", nulls = Nulls.SKIP)
        public _FinalStage endsDailyAt(Optional<String> endsDailyAt) {
            this.endsDailyAt = endsDailyAt;
            return this;
        }

        @Override
        public _FinalStage startsDailyAt(String startsDailyAt) {
            this.startsDailyAt = Optional.of(startsDailyAt);
            return this;
        }

        @Override
        @JsonSetter(value = "starts_daily_at", nulls = Nulls.SKIP)
        public _FinalStage startsDailyAt(Optional<String> startsDailyAt) {
            this.startsDailyAt = startsDailyAt;
            return this;
        }

        @Override
        public _FinalStage name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
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
        public NoiseSensorsNoiseThresholdsUpdateRequest build() {
            return new NoiseSensorsNoiseThresholdsUpdateRequest(
                    noiseThresholdId,
                    deviceId,
                    sync,
                    name,
                    startsDailyAt,
                    endsDailyAt,
                    noiseThresholdDecibels,
                    noiseThresholdNrs);
        }
    }
}
