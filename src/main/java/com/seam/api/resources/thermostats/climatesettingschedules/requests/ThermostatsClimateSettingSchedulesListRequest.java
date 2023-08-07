package com.seam.api.resources.thermostats.climatesettingschedules.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ThermostatsClimateSettingSchedulesListRequest.Builder.class)
public final class ThermostatsClimateSettingSchedulesListRequest {
    private final String deviceId;

    private ThermostatsClimateSettingSchedulesListRequest(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsClimateSettingSchedulesListRequest
                && equalTo((ThermostatsClimateSettingSchedulesListRequest) other);
    }

    private boolean equalTo(ThermostatsClimateSettingSchedulesListRequest other) {
        return deviceId.equals(other.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId);
    }

    @Override
    public String toString() {
        return "ThermostatsClimateSettingSchedulesListRequest{" + "deviceId: " + deviceId + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);

        Builder from(ThermostatsClimateSettingSchedulesListRequest other);
    }

    public interface _FinalStage {
        ThermostatsClimateSettingSchedulesListRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, _FinalStage {
        private String deviceId;

        private Builder() {}

        @Override
        public Builder from(ThermostatsClimateSettingSchedulesListRequest other) {
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
        public ThermostatsClimateSettingSchedulesListRequest build() {
            return new ThermostatsClimateSettingSchedulesListRequest(deviceId);
        }
    }
}
