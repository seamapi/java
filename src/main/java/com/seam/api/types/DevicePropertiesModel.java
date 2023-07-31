package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = DevicePropertiesModel.Builder.class)
public final class DevicePropertiesModel {
    private final String displayName;

    private DevicePropertiesModel(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesModel && equalTo((DevicePropertiesModel) other);
    }

    private boolean equalTo(DevicePropertiesModel other) {
        return displayName.equals(other.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.displayName);
    }

    @Override
    public String toString() {
        return "DevicePropertiesModel{" + "displayName: " + displayName + "}";
    }

    public static DisplayNameStage builder() {
        return new Builder();
    }

    public interface DisplayNameStage {
        _FinalStage displayName(String displayName);

        Builder from(DevicePropertiesModel other);
    }

    public interface _FinalStage {
        DevicePropertiesModel build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DisplayNameStage, _FinalStage {
        private String displayName;

        private Builder() {}

        @Override
        public Builder from(DevicePropertiesModel other) {
            displayName(other.getDisplayName());
            return this;
        }

        @Override
        @JsonSetter("display_name")
        public _FinalStage displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        @Override
        public DevicePropertiesModel build() {
            return new DevicePropertiesModel(displayName);
        }
    }
}
