package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = UnmanagedDevice.Builder.class)
public final class UnmanagedDevice {
    private final String deviceId;

    private final UnmanagedDeviceDeviceType deviceType;

    private final String connectedAccountId;

    private final List<UnmanagedDeviceCapabilitiesSupportedItem> capabilitiesSupported;

    private final String workspaceId;

    private final List<UnmanagedDeviceErrorsItem> errors;

    private final List<UnmanagedDeviceWarningsItem> warnings;

    private final String createdAt;

    private final String isManaged;

    private final UnmanagedDeviceProperties properties;

    private UnmanagedDevice(
            String deviceId,
            UnmanagedDeviceDeviceType deviceType,
            String connectedAccountId,
            List<UnmanagedDeviceCapabilitiesSupportedItem> capabilitiesSupported,
            String workspaceId,
            List<UnmanagedDeviceErrorsItem> errors,
            List<UnmanagedDeviceWarningsItem> warnings,
            String createdAt,
            String isManaged,
            UnmanagedDeviceProperties properties) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.connectedAccountId = connectedAccountId;
        this.capabilitiesSupported = capabilitiesSupported;
        this.workspaceId = workspaceId;
        this.errors = errors;
        this.warnings = warnings;
        this.createdAt = createdAt;
        this.isManaged = isManaged;
        this.properties = properties;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("device_type")
    public UnmanagedDeviceDeviceType getDeviceType() {
        return deviceType;
    }

    @JsonProperty("connected_account_id")
    public String getConnectedAccountId() {
        return connectedAccountId;
    }

    @JsonProperty("capabilities_supported")
    public List<UnmanagedDeviceCapabilitiesSupportedItem> getCapabilitiesSupported() {
        return capabilitiesSupported;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("errors")
    public List<UnmanagedDeviceErrorsItem> getErrors() {
        return errors;
    }

    @JsonProperty("warnings")
    public List<UnmanagedDeviceWarningsItem> getWarnings() {
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

    @JsonProperty("properties")
    public UnmanagedDeviceProperties getProperties() {
        return properties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedDevice && equalTo((UnmanagedDevice) other);
    }

    private boolean equalTo(UnmanagedDevice other) {
        return deviceId.equals(other.deviceId)
                && deviceType.equals(other.deviceType)
                && connectedAccountId.equals(other.connectedAccountId)
                && capabilitiesSupported.equals(other.capabilitiesSupported)
                && workspaceId.equals(other.workspaceId)
                && errors.equals(other.errors)
                && warnings.equals(other.warnings)
                && createdAt.equals(other.createdAt)
                && isManaged.equals(other.isManaged)
                && properties.equals(other.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.deviceId,
                this.deviceType,
                this.connectedAccountId,
                this.capabilitiesSupported,
                this.workspaceId,
                this.errors,
                this.warnings,
                this.createdAt,
                this.isManaged,
                this.properties);
    }

    @Override
    public String toString() {
        return "UnmanagedDevice{" + "deviceId: " + deviceId + ", deviceType: " + deviceType + ", connectedAccountId: "
                + connectedAccountId + ", capabilitiesSupported: " + capabilitiesSupported + ", workspaceId: "
                + workspaceId + ", errors: " + errors + ", warnings: " + warnings + ", createdAt: " + createdAt
                + ", isManaged: " + isManaged + ", properties: " + properties + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        DeviceTypeStage deviceId(String deviceId);

        Builder from(UnmanagedDevice other);
    }

    public interface DeviceTypeStage {
        ConnectedAccountIdStage deviceType(UnmanagedDeviceDeviceType deviceType);
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
        PropertiesStage isManaged(String isManaged);
    }

    public interface PropertiesStage {
        _FinalStage properties(UnmanagedDeviceProperties properties);
    }

    public interface _FinalStage {
        UnmanagedDevice build();

        _FinalStage capabilitiesSupported(List<UnmanagedDeviceCapabilitiesSupportedItem> capabilitiesSupported);

        _FinalStage addCapabilitiesSupported(UnmanagedDeviceCapabilitiesSupportedItem capabilitiesSupported);

        _FinalStage addAllCapabilitiesSupported(List<UnmanagedDeviceCapabilitiesSupportedItem> capabilitiesSupported);

        _FinalStage errors(List<UnmanagedDeviceErrorsItem> errors);

        _FinalStage addErrors(UnmanagedDeviceErrorsItem errors);

        _FinalStage addAllErrors(List<UnmanagedDeviceErrorsItem> errors);

        _FinalStage warnings(List<UnmanagedDeviceWarningsItem> warnings);

        _FinalStage addWarnings(UnmanagedDeviceWarningsItem warnings);

        _FinalStage addAllWarnings(List<UnmanagedDeviceWarningsItem> warnings);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements DeviceIdStage,
                    DeviceTypeStage,
                    ConnectedAccountIdStage,
                    WorkspaceIdStage,
                    CreatedAtStage,
                    IsManagedStage,
                    PropertiesStage,
                    _FinalStage {
        private String deviceId;

        private UnmanagedDeviceDeviceType deviceType;

        private String connectedAccountId;

        private String workspaceId;

        private String createdAt;

        private String isManaged;

        private UnmanagedDeviceProperties properties;

        private List<UnmanagedDeviceWarningsItem> warnings = new ArrayList<>();

        private List<UnmanagedDeviceErrorsItem> errors = new ArrayList<>();

        private List<UnmanagedDeviceCapabilitiesSupportedItem> capabilitiesSupported = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(UnmanagedDevice other) {
            deviceId(other.getDeviceId());
            deviceType(other.getDeviceType());
            connectedAccountId(other.getConnectedAccountId());
            capabilitiesSupported(other.getCapabilitiesSupported());
            workspaceId(other.getWorkspaceId());
            errors(other.getErrors());
            warnings(other.getWarnings());
            createdAt(other.getCreatedAt());
            isManaged(other.getIsManaged());
            properties(other.getProperties());
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
        public ConnectedAccountIdStage deviceType(UnmanagedDeviceDeviceType deviceType) {
            this.deviceType = deviceType;
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
        public PropertiesStage isManaged(String isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @Override
        @JsonSetter("properties")
        public _FinalStage properties(UnmanagedDeviceProperties properties) {
            this.properties = properties;
            return this;
        }

        @Override
        public _FinalStage addAllWarnings(List<UnmanagedDeviceWarningsItem> warnings) {
            this.warnings.addAll(warnings);
            return this;
        }

        @Override
        public _FinalStage addWarnings(UnmanagedDeviceWarningsItem warnings) {
            this.warnings.add(warnings);
            return this;
        }

        @Override
        @JsonSetter(value = "warnings", nulls = Nulls.SKIP)
        public _FinalStage warnings(List<UnmanagedDeviceWarningsItem> warnings) {
            this.warnings.clear();
            this.warnings.addAll(warnings);
            return this;
        }

        @Override
        public _FinalStage addAllErrors(List<UnmanagedDeviceErrorsItem> errors) {
            this.errors.addAll(errors);
            return this;
        }

        @Override
        public _FinalStage addErrors(UnmanagedDeviceErrorsItem errors) {
            this.errors.add(errors);
            return this;
        }

        @Override
        @JsonSetter(value = "errors", nulls = Nulls.SKIP)
        public _FinalStage errors(List<UnmanagedDeviceErrorsItem> errors) {
            this.errors.clear();
            this.errors.addAll(errors);
            return this;
        }

        @Override
        public _FinalStage addAllCapabilitiesSupported(
                List<UnmanagedDeviceCapabilitiesSupportedItem> capabilitiesSupported) {
            this.capabilitiesSupported.addAll(capabilitiesSupported);
            return this;
        }

        @Override
        public _FinalStage addCapabilitiesSupported(UnmanagedDeviceCapabilitiesSupportedItem capabilitiesSupported) {
            this.capabilitiesSupported.add(capabilitiesSupported);
            return this;
        }

        @Override
        @JsonSetter(value = "capabilities_supported", nulls = Nulls.SKIP)
        public _FinalStage capabilitiesSupported(List<UnmanagedDeviceCapabilitiesSupportedItem> capabilitiesSupported) {
            this.capabilitiesSupported.clear();
            this.capabilitiesSupported.addAll(capabilitiesSupported);
            return this;
        }

        @Override
        public UnmanagedDevice build() {
            return new UnmanagedDevice(
                    deviceId,
                    deviceType,
                    connectedAccountId,
                    capabilitiesSupported,
                    workspaceId,
                    errors,
                    warnings,
                    createdAt,
                    isManaged,
                    properties);
        }
    }
}
