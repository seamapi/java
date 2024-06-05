/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DevicePropertiesDormakabaOracodeMetadata.Builder.class)
public final class DevicePropertiesDormakabaOracodeMetadata {
    private final double doorId;

    private final String doorName;

    private final Optional<Double> deviceId;

    private final boolean doorIsWireless;

    private final double siteId;

    private final String siteName;

    private final Optional<String> ianaTimezone;

    private final Optional<List<DevicePropertiesDormakabaOracodeMetadataPredefinedTimeSlotsItem>> predefinedTimeSlots;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesDormakabaOracodeMetadata(
            double doorId,
            String doorName,
            Optional<Double> deviceId,
            boolean doorIsWireless,
            double siteId,
            String siteName,
            Optional<String> ianaTimezone,
            Optional<List<DevicePropertiesDormakabaOracodeMetadataPredefinedTimeSlotsItem>> predefinedTimeSlots,
            Map<String, Object> additionalProperties) {
        this.doorId = doorId;
        this.doorName = doorName;
        this.deviceId = deviceId;
        this.doorIsWireless = doorIsWireless;
        this.siteId = siteId;
        this.siteName = siteName;
        this.ianaTimezone = ianaTimezone;
        this.predefinedTimeSlots = predefinedTimeSlots;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("door_id")
    public double getDoorId() {
        return doorId;
    }

    @JsonProperty("door_name")
    public String getDoorName() {
        return doorName;
    }

    @JsonProperty("device_id")
    public Optional<Double> getDeviceId() {
        return deviceId;
    }

    @JsonProperty("door_is_wireless")
    public boolean getDoorIsWireless() {
        return doorIsWireless;
    }

    @JsonProperty("site_id")
    public double getSiteId() {
        return siteId;
    }

    @JsonProperty("site_name")
    public String getSiteName() {
        return siteName;
    }

    @JsonProperty("iana_timezone")
    public Optional<String> getIanaTimezone() {
        return ianaTimezone;
    }

    @JsonProperty("predefined_time_slots")
    public Optional<List<DevicePropertiesDormakabaOracodeMetadataPredefinedTimeSlotsItem>> getPredefinedTimeSlots() {
        return predefinedTimeSlots;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesDormakabaOracodeMetadata
                && equalTo((DevicePropertiesDormakabaOracodeMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesDormakabaOracodeMetadata other) {
        return doorId == other.doorId
                && doorName.equals(other.doorName)
                && deviceId.equals(other.deviceId)
                && doorIsWireless == other.doorIsWireless
                && siteId == other.siteId
                && siteName.equals(other.siteName)
                && ianaTimezone.equals(other.ianaTimezone)
                && predefinedTimeSlots.equals(other.predefinedTimeSlots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.doorId,
                this.doorName,
                this.deviceId,
                this.doorIsWireless,
                this.siteId,
                this.siteName,
                this.ianaTimezone,
                this.predefinedTimeSlots);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DoorIdStage builder() {
        return new Builder();
    }

    public interface DoorIdStage {
        DoorNameStage doorId(double doorId);

        Builder from(DevicePropertiesDormakabaOracodeMetadata other);
    }

    public interface DoorNameStage {
        DoorIsWirelessStage doorName(String doorName);
    }

    public interface DoorIsWirelessStage {
        SiteIdStage doorIsWireless(boolean doorIsWireless);
    }

    public interface SiteIdStage {
        SiteNameStage siteId(double siteId);
    }

    public interface SiteNameStage {
        _FinalStage siteName(String siteName);
    }

    public interface _FinalStage {
        DevicePropertiesDormakabaOracodeMetadata build();

        _FinalStage deviceId(Optional<Double> deviceId);

        _FinalStage deviceId(Double deviceId);

        _FinalStage ianaTimezone(Optional<String> ianaTimezone);

        _FinalStage ianaTimezone(String ianaTimezone);

        _FinalStage predefinedTimeSlots(
                Optional<List<DevicePropertiesDormakabaOracodeMetadataPredefinedTimeSlotsItem>> predefinedTimeSlots);

        _FinalStage predefinedTimeSlots(
                List<DevicePropertiesDormakabaOracodeMetadataPredefinedTimeSlotsItem> predefinedTimeSlots);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements DoorIdStage, DoorNameStage, DoorIsWirelessStage, SiteIdStage, SiteNameStage, _FinalStage {
        private double doorId;

        private String doorName;

        private boolean doorIsWireless;

        private double siteId;

        private String siteName;

        private Optional<List<DevicePropertiesDormakabaOracodeMetadataPredefinedTimeSlotsItem>> predefinedTimeSlots =
                Optional.empty();

        private Optional<String> ianaTimezone = Optional.empty();

        private Optional<Double> deviceId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DevicePropertiesDormakabaOracodeMetadata other) {
            doorId(other.getDoorId());
            doorName(other.getDoorName());
            deviceId(other.getDeviceId());
            doorIsWireless(other.getDoorIsWireless());
            siteId(other.getSiteId());
            siteName(other.getSiteName());
            ianaTimezone(other.getIanaTimezone());
            predefinedTimeSlots(other.getPredefinedTimeSlots());
            return this;
        }

        @Override
        @JsonSetter("door_id")
        public DoorNameStage doorId(double doorId) {
            this.doorId = doorId;
            return this;
        }

        @Override
        @JsonSetter("door_name")
        public DoorIsWirelessStage doorName(String doorName) {
            this.doorName = doorName;
            return this;
        }

        @Override
        @JsonSetter("door_is_wireless")
        public SiteIdStage doorIsWireless(boolean doorIsWireless) {
            this.doorIsWireless = doorIsWireless;
            return this;
        }

        @Override
        @JsonSetter("site_id")
        public SiteNameStage siteId(double siteId) {
            this.siteId = siteId;
            return this;
        }

        @Override
        @JsonSetter("site_name")
        public _FinalStage siteName(String siteName) {
            this.siteName = siteName;
            return this;
        }

        @Override
        public _FinalStage predefinedTimeSlots(
                List<DevicePropertiesDormakabaOracodeMetadataPredefinedTimeSlotsItem> predefinedTimeSlots) {
            this.predefinedTimeSlots = Optional.of(predefinedTimeSlots);
            return this;
        }

        @Override
        @JsonSetter(value = "predefined_time_slots", nulls = Nulls.SKIP)
        public _FinalStage predefinedTimeSlots(
                Optional<List<DevicePropertiesDormakabaOracodeMetadataPredefinedTimeSlotsItem>> predefinedTimeSlots) {
            this.predefinedTimeSlots = predefinedTimeSlots;
            return this;
        }

        @Override
        public _FinalStage ianaTimezone(String ianaTimezone) {
            this.ianaTimezone = Optional.of(ianaTimezone);
            return this;
        }

        @Override
        @JsonSetter(value = "iana_timezone", nulls = Nulls.SKIP)
        public _FinalStage ianaTimezone(Optional<String> ianaTimezone) {
            this.ianaTimezone = ianaTimezone;
            return this;
        }

        @Override
        public _FinalStage deviceId(Double deviceId) {
            this.deviceId = Optional.of(deviceId);
            return this;
        }

        @Override
        @JsonSetter(value = "device_id", nulls = Nulls.SKIP)
        public _FinalStage deviceId(Optional<Double> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public DevicePropertiesDormakabaOracodeMetadata build() {
            return new DevicePropertiesDormakabaOracodeMetadata(
                    doorId,
                    doorName,
                    deviceId,
                    doorIsWireless,
                    siteId,
                    siteName,
                    ianaTimezone,
                    predefinedTimeSlots,
                    additionalProperties);
        }
    }
}
