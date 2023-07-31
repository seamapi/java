package com.seam.api.resources.thermostats.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = ThermostatsHeatRequest.Builder.class)
public final class ThermostatsHeatRequest {
    private final String deviceId;

    private final Optional<Double> heatingSetPointCelsius;

    private final Optional<Double> heatingSetPointFahrenheit;

    private final Optional<Boolean> sync;

    private ThermostatsHeatRequest(
            String deviceId,
            Optional<Double> heatingSetPointCelsius,
            Optional<Double> heatingSetPointFahrenheit,
            Optional<Boolean> sync) {
        this.deviceId = deviceId;
        this.heatingSetPointCelsius = heatingSetPointCelsius;
        this.heatingSetPointFahrenheit = heatingSetPointFahrenheit;
        this.sync = sync;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("heating_set_point_celsius")
    public Optional<Double> getHeatingSetPointCelsius() {
        return heatingSetPointCelsius;
    }

    @JsonProperty("heating_set_point_fahrenheit")
    public Optional<Double> getHeatingSetPointFahrenheit() {
        return heatingSetPointFahrenheit;
    }

    @JsonProperty("sync")
    public Optional<Boolean> getSync() {
        return sync;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsHeatRequest && equalTo((ThermostatsHeatRequest) other);
    }

    private boolean equalTo(ThermostatsHeatRequest other) {
        return deviceId.equals(other.deviceId)
                && heatingSetPointCelsius.equals(other.heatingSetPointCelsius)
                && heatingSetPointFahrenheit.equals(other.heatingSetPointFahrenheit)
                && sync.equals(other.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.heatingSetPointCelsius, this.heatingSetPointFahrenheit, this.sync);
    }

    @Override
    public String toString() {
        return "ThermostatsHeatRequest{" + "deviceId: " + deviceId + ", heatingSetPointCelsius: "
                + heatingSetPointCelsius + ", heatingSetPointFahrenheit: " + heatingSetPointFahrenheit + ", sync: "
                + sync + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);

        Builder from(ThermostatsHeatRequest other);
    }

    public interface _FinalStage {
        ThermostatsHeatRequest build();

        _FinalStage heatingSetPointCelsius(Optional<Double> heatingSetPointCelsius);

        _FinalStage heatingSetPointCelsius(Double heatingSetPointCelsius);

        _FinalStage heatingSetPointFahrenheit(Optional<Double> heatingSetPointFahrenheit);

        _FinalStage heatingSetPointFahrenheit(Double heatingSetPointFahrenheit);

        _FinalStage sync(Optional<Boolean> sync);

        _FinalStage sync(Boolean sync);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, _FinalStage {
        private String deviceId;

        private Optional<Boolean> sync = Optional.empty();

        private Optional<Double> heatingSetPointFahrenheit = Optional.empty();

        private Optional<Double> heatingSetPointCelsius = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ThermostatsHeatRequest other) {
            deviceId(other.getDeviceId());
            heatingSetPointCelsius(other.getHeatingSetPointCelsius());
            heatingSetPointFahrenheit(other.getHeatingSetPointFahrenheit());
            sync(other.getSync());
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
        public _FinalStage heatingSetPointFahrenheit(Double heatingSetPointFahrenheit) {
            this.heatingSetPointFahrenheit = Optional.of(heatingSetPointFahrenheit);
            return this;
        }

        @Override
        @JsonSetter(value = "heating_set_point_fahrenheit", nulls = Nulls.SKIP)
        public _FinalStage heatingSetPointFahrenheit(Optional<Double> heatingSetPointFahrenheit) {
            this.heatingSetPointFahrenheit = heatingSetPointFahrenheit;
            return this;
        }

        @Override
        public _FinalStage heatingSetPointCelsius(Double heatingSetPointCelsius) {
            this.heatingSetPointCelsius = Optional.of(heatingSetPointCelsius);
            return this;
        }

        @Override
        @JsonSetter(value = "heating_set_point_celsius", nulls = Nulls.SKIP)
        public _FinalStage heatingSetPointCelsius(Optional<Double> heatingSetPointCelsius) {
            this.heatingSetPointCelsius = heatingSetPointCelsius;
            return this;
        }

        @Override
        public ThermostatsHeatRequest build() {
            return new ThermostatsHeatRequest(deviceId, heatingSetPointCelsius, heatingSetPointFahrenheit, sync);
        }
    }
}
