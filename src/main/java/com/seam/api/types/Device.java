package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = Device.Builder.class)
public final class Device {
    private final String deviceId;

    private final DeviceDeviceType deviceType;

    private final List<DeviceCapabilitiesSupportedItem> capabilitiesSupported;

    private final DeviceProperties properties;

    private final Optional<Object> location;

    private final String connectedAccountId;

    private final String workspaceId;

    private final List<DeviceErrorsItem> errors;

    private final List<DeviceWarningsItem> warnings;

    private final String createdAt;

    private final String isManaged;

    private Device(
            String deviceId,
            DeviceDeviceType deviceType,
            List<DeviceCapabilitiesSupportedItem> capabilitiesSupported,
            DeviceProperties properties,
            Optional<Object> location,
            String connectedAccountId,
            String workspaceId,
            List<DeviceErrorsItem> errors,
            List<DeviceWarningsItem> warnings,
            String createdAt,
            String isManaged) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.capabilitiesSupported = capabilitiesSupported;
        this.properties = properties;
        this.location = location;
        this.connectedAccountId = connectedAccountId;
        this.workspaceId = workspaceId;
        this.errors = errors;
        this.warnings = warnings;
        this.createdAt = createdAt;
        this.isManaged = isManaged;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("device_type")
    public DeviceDeviceType getDeviceType() {
        return deviceType;
    }

    @JsonProperty("capabilities_supported")
    public List<DeviceCapabilitiesSupportedItem> getCapabilitiesSupported() {
        return capabilitiesSupported;
    }

    @JsonProperty("properties")
    public DeviceProperties getProperties() {
        return properties;
    }

    @JsonProperty("location")
    public Optional<Object> getLocation() {
        return location;
    }

    @JsonProperty("connected_account_id")
    public String getConnectedAccountId() {
        return connectedAccountId;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("errors")
    public List<DeviceErrorsItem> getErrors() {
        return errors;
    }

    @JsonProperty("warnings")
    public List<DeviceWarningsItem> getWarnings() {
        return warnings;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("is_managed")
    public String getIsManaged() {
        return isManaged;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Device && equalTo((Device) other);
    }

    private boolean equalTo(Device other) {
        return deviceId.equals(other.deviceId)
                && deviceType.equals(other.deviceType)
                && capabilitiesSupported.equals(other.capabilitiesSupported)
                && properties.equals(other.properties)
                && location.equals(other.location)
                && connectedAccountId.equals(other.connectedAccountId)
                && workspaceId.equals(other.workspaceId)
                && errors.equals(other.errors)
                && warnings.equals(other.warnings)
                && createdAt.equals(other.createdAt)
                && isManaged.equals(other.isManaged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.deviceId,
                this.deviceType,
                this.capabilitiesSupported,
                this.properties,
                this.location,
                this.connectedAccountId,
                this.workspaceId,
                this.errors,
                this.warnings,
                this.createdAt,
                this.isManaged);
    }

    @Override
    public String toString() {
        return "Device{" + "deviceId: " + deviceId + ", deviceType: " + deviceType + ", capabilitiesSupported: "
                + capabilitiesSupported + ", properties: " + properties + ", location: " + location
                + ", connectedAccountId: " + connectedAccountId + ", workspaceId: " + workspaceId + ", errors: "
                + errors + ", warnings: " + warnings + ", createdAt: " + createdAt + ", isManaged: " + isManaged + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        DeviceTypeStage deviceId(String deviceId);

        Builder from(Device other);
    }

    public interface DeviceTypeStage {
        PropertiesStage deviceType(DeviceDeviceType deviceType);
    }

    public interface PropertiesStage {
        ConnectedAccountIdStage properties(DeviceProperties properties);
    }

    public interface ConnectedAccountIdStage {
        WorkspaceIdStage connectedAccountId(String connectedAccountId);
    }

    public interface WorkspaceIdStage {
        CreatedAtStage workspaceId(String workspaceId);
    }

    public interface CreatedAtStage {
        IsManagedStage createdAt(String createdAt);
    }

    public interface IsManagedStage {
        _FinalStage isManaged(String isManaged);
    }

    public interface _FinalStage {
        Device build();

        _FinalStage capabilitiesSupported(List<DeviceCapabilitiesSupportedItem> capabilitiesSupported);

        _FinalStage addCapabilitiesSupported(DeviceCapabilitiesSupportedItem capabilitiesSupported);

        _FinalStage addAllCapabilitiesSupported(List<DeviceCapabilitiesSupportedItem> capabilitiesSupported);

        _FinalStage location(Optional<Object> location);

        _FinalStage location(Object location);

        _FinalStage errors(List<DeviceErrorsItem> errors);

        _FinalStage addErrors(DeviceErrorsItem errors);

        _FinalStage addAllErrors(List<DeviceErrorsItem> errors);

        _FinalStage warnings(List<DeviceWarningsItem> warnings);

        _FinalStage addWarnings(DeviceWarningsItem warnings);

        _FinalStage addAllWarnings(List<DeviceWarningsItem> warnings);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements DeviceIdStage,
                    DeviceTypeStage,
                    PropertiesStage,
                    ConnectedAccountIdStage,
                    WorkspaceIdStage,
                    CreatedAtStage,
                    IsManagedStage,
                    _FinalStage {
        private String deviceId;

        private DeviceDeviceType deviceType;

        private DeviceProperties properties;

        private String connectedAccountId;

        private String workspaceId;

        private String createdAt;

        private String isManaged;

        private List<DeviceWarningsItem> warnings = new ArrayList<>();

        private List<DeviceErrorsItem> errors = new ArrayList<>();

        private Optional<Object> location = Optional.empty();

        private List<DeviceCapabilitiesSupportedItem> capabilitiesSupported = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(Device other) {
            deviceId(other.getDeviceId());
            deviceType(other.getDeviceType());
            capabilitiesSupported(other.getCapabilitiesSupported());
            properties(other.getProperties());
            location(other.getLocation());
            connectedAccountId(other.getConnectedAccountId());
            workspaceId(other.getWorkspaceId());
            errors(other.getErrors());
            warnings(other.getWarnings());
            createdAt(other.getCreatedAt());
            isManaged(other.getIsManaged());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public DeviceTypeStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("device_type")
        public PropertiesStage deviceType(DeviceDeviceType deviceType) {
            this.deviceType = deviceType;
            return this;
        }

        @Override
        @JsonSetter("properties")
        public ConnectedAccountIdStage properties(DeviceProperties properties) {
            this.properties = properties;
            return this;
        }

        @Override
        @JsonSetter("connected_account_id")
        public WorkspaceIdStage connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        @Override
        @JsonSetter("workspace_id")
        public CreatedAtStage workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public IsManagedStage createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("is_managed")
        public _FinalStage isManaged(String isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @Override
        public _FinalStage addAllWarnings(List<DeviceWarningsItem> warnings) {
            this.warnings.addAll(warnings);
            return this;
        }

        @Override
        public _FinalStage addWarnings(DeviceWarningsItem warnings) {
            this.warnings.add(warnings);
            return this;
        }

        @Override
        @JsonSetter(value = "warnings", nulls = Nulls.SKIP)
        public _FinalStage warnings(List<DeviceWarningsItem> warnings) {
            this.warnings.clear();
            this.warnings.addAll(warnings);
            return this;
        }

        @Override
        public _FinalStage addAllErrors(List<DeviceErrorsItem> errors) {
            this.errors.addAll(errors);
            return this;
        }

        @Override
        public _FinalStage addErrors(DeviceErrorsItem errors) {
            this.errors.add(errors);
            return this;
        }

        @Override
        @JsonSetter(value = "errors", nulls = Nulls.SKIP)
        public _FinalStage errors(List<DeviceErrorsItem> errors) {
            this.errors.clear();
            this.errors.addAll(errors);
            return this;
        }

        @Override
        public _FinalStage location(Object location) {
            this.location = Optional.of(location);
            return this;
        }

        @Override
        @JsonSetter(value = "location", nulls = Nulls.SKIP)
        public _FinalStage location(Optional<Object> location) {
            this.location = location;
            return this;
        }

        @Override
        public _FinalStage addAllCapabilitiesSupported(List<DeviceCapabilitiesSupportedItem> capabilitiesSupported) {
            this.capabilitiesSupported.addAll(capabilitiesSupported);
            return this;
        }

        @Override
        public _FinalStage addCapabilitiesSupported(DeviceCapabilitiesSupportedItem capabilitiesSupported) {
            this.capabilitiesSupported.add(capabilitiesSupported);
            return this;
        }

        @Override
        @JsonSetter(value = "capabilities_supported", nulls = Nulls.SKIP)
        public _FinalStage capabilitiesSupported(List<DeviceCapabilitiesSupportedItem> capabilitiesSupported) {
            this.capabilitiesSupported.clear();
            this.capabilitiesSupported.addAll(capabilitiesSupported);
            return this;
        }

        @Override
        public Device build() {
            return new Device(
                    deviceId,
                    deviceType,
                    capabilitiesSupported,
                    properties,
                    location,
                    connectedAccountId,
                    workspaceId,
                    errors,
                    warnings,
                    createdAt,
                    isManaged);
        }
    }
}
