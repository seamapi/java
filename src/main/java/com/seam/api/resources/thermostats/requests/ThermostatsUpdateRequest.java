package com.seam.api.resources.thermostats.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.types.ThermostatsUpdateRequestDefaultClimateSetting;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ThermostatsUpdateRequest.Builder.class)
public final class ThermostatsUpdateRequest {
    private final String deviceId;

    private final ThermostatsUpdateRequestDefaultClimateSetting defaultClimateSetting;

    private ThermostatsUpdateRequest(
            String deviceId, ThermostatsUpdateRequestDefaultClimateSetting defaultClimateSetting) {
        this.deviceId = deviceId;
        this.defaultClimateSetting = defaultClimateSetting;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("default_climate_setting")
    public ThermostatsUpdateRequestDefaultClimateSetting getDefaultClimateSetting() {
        return defaultClimateSetting;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsUpdateRequest && equalTo((ThermostatsUpdateRequest) other);
    }

    private boolean equalTo(ThermostatsUpdateRequest other) {
        return deviceId.equals(other.deviceId) && defaultClimateSetting.equals(other.defaultClimateSetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.defaultClimateSetting);
    }

    @Override
    public String toString() {
        return "ThermostatsUpdateRequest{" + "deviceId: " + deviceId + ", defaultClimateSetting: "
                + defaultClimateSetting + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        DefaultClimateSettingStage deviceId(String deviceId);

        Builder from(ThermostatsUpdateRequest other);
    }

    public interface DefaultClimateSettingStage {
        _FinalStage defaultClimateSetting(ThermostatsUpdateRequestDefaultClimateSetting defaultClimateSetting);
    }

    public interface _FinalStage {
        ThermostatsUpdateRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, DefaultClimateSettingStage, _FinalStage {
        private String deviceId;

        private ThermostatsUpdateRequestDefaultClimateSetting defaultClimateSetting;

        private Builder() {}

        @Override
        public Builder from(ThermostatsUpdateRequest other) {
            deviceId(other.getDeviceId());
            defaultClimateSetting(other.getDefaultClimateSetting());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public DefaultClimateSettingStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("default_climate_setting")
        public _FinalStage defaultClimateSetting(ThermostatsUpdateRequestDefaultClimateSetting defaultClimateSetting) {
            this.defaultClimateSetting = defaultClimateSetting;
            return this;
        }

        @Override
        public ThermostatsUpdateRequest build() {
            return new ThermostatsUpdateRequest(deviceId, defaultClimateSetting);
        }
    }
}