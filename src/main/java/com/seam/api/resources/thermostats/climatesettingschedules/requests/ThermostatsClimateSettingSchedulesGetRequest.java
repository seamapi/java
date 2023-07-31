package com.seam.api.resources.thermostats.climatesettingschedules.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = ThermostatsClimateSettingSchedulesGetRequest.Builder.class)
public final class ThermostatsClimateSettingSchedulesGetRequest {
    private final Optional<String> climateSettingScheduleId;

    private final Optional<String> deviceId;

    private ThermostatsClimateSettingSchedulesGetRequest(
            Optional<String> climateSettingScheduleId, Optional<String> deviceId) {
        this.climateSettingScheduleId = climateSettingScheduleId;
        this.deviceId = deviceId;
    }

    @JsonProperty("climate_setting_schedule_id")
    public Optional<String> getClimateSettingScheduleId() {
        return climateSettingScheduleId;
    }

    @JsonProperty("device_id")
    public Optional<String> getDeviceId() {
        return deviceId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsClimateSettingSchedulesGetRequest
                && equalTo((ThermostatsClimateSettingSchedulesGetRequest) other);
    }

    private boolean equalTo(ThermostatsClimateSettingSchedulesGetRequest other) {
        return climateSettingScheduleId.equals(other.climateSettingScheduleId) && deviceId.equals(other.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.climateSettingScheduleId, this.deviceId);
    }

    @Override
    public String toString() {
        return "ThermostatsClimateSettingSchedulesGetRequest{" + "climateSettingScheduleId: " + climateSettingScheduleId
                + ", deviceId: " + deviceId + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> climateSettingScheduleId = Optional.empty();

        private Optional<String> deviceId = Optional.empty();

        private Builder() {}

        public Builder from(ThermostatsClimateSettingSchedulesGetRequest other) {
            climateSettingScheduleId(other.getClimateSettingScheduleId());
            deviceId(other.getDeviceId());
            return this;
        }

        @JsonSetter(value = "climate_setting_schedule_id", nulls = Nulls.SKIP)
        public Builder climateSettingScheduleId(Optional<String> climateSettingScheduleId) {
            this.climateSettingScheduleId = climateSettingScheduleId;
            return this;
        }

        public Builder climateSettingScheduleId(String climateSettingScheduleId) {
            this.climateSettingScheduleId = Optional.of(climateSettingScheduleId);
            return this;
        }

        @JsonSetter(value = "device_id", nulls = Nulls.SKIP)
        public Builder deviceId(Optional<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Builder deviceId(String deviceId) {
            this.deviceId = Optional.of(deviceId);
            return this;
        }

        public ThermostatsClimateSettingSchedulesGetRequest build() {
            return new ThermostatsClimateSettingSchedulesGetRequest(climateSettingScheduleId, deviceId);
        }
    }
}
