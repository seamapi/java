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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AcsEntranceLatchMetadata.Builder.class)
public final class AcsEntranceLatchMetadata {
    private final String accessibilityType;

    private final String doorName;

    private final String doorType;

    private final boolean isConnected;

    private final Map<String, Object> additionalProperties;

    private AcsEntranceLatchMetadata(
            String accessibilityType,
            String doorName,
            String doorType,
            boolean isConnected,
            Map<String, Object> additionalProperties) {
        this.accessibilityType = accessibilityType;
        this.doorName = doorName;
        this.doorType = doorType;
        this.isConnected = isConnected;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("accessibility_type")
    public String getAccessibilityType() {
        return accessibilityType;
    }

    @JsonProperty("door_name")
    public String getDoorName() {
        return doorName;
    }

    @JsonProperty("door_type")
    public String getDoorType() {
        return doorType;
    }

    @JsonProperty("is_connected")
    public boolean getIsConnected() {
        return isConnected;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AcsEntranceLatchMetadata && equalTo((AcsEntranceLatchMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AcsEntranceLatchMetadata other) {
        return accessibilityType.equals(other.accessibilityType)
                && doorName.equals(other.doorName)
                && doorType.equals(other.doorType)
                && isConnected == other.isConnected;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.accessibilityType, this.doorName, this.doorType, this.isConnected);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AccessibilityTypeStage builder() {
        return new Builder();
    }

    public interface AccessibilityTypeStage {
        DoorNameStage accessibilityType(String accessibilityType);

        Builder from(AcsEntranceLatchMetadata other);
    }

    public interface DoorNameStage {
        DoorTypeStage doorName(String doorName);
    }

    public interface DoorTypeStage {
        IsConnectedStage doorType(String doorType);
    }

    public interface IsConnectedStage {
        _FinalStage isConnected(boolean isConnected);
    }

    public interface _FinalStage {
        AcsEntranceLatchMetadata build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AccessibilityTypeStage, DoorNameStage, DoorTypeStage, IsConnectedStage, _FinalStage {
        private String accessibilityType;

        private String doorName;

        private String doorType;

        private boolean isConnected;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AcsEntranceLatchMetadata other) {
            accessibilityType(other.getAccessibilityType());
            doorName(other.getDoorName());
            doorType(other.getDoorType());
            isConnected(other.getIsConnected());
            return this;
        }

        @java.lang.Override
        @JsonSetter("accessibility_type")
        public DoorNameStage accessibilityType(String accessibilityType) {
            this.accessibilityType = accessibilityType;
            return this;
        }

        @java.lang.Override
        @JsonSetter("door_name")
        public DoorTypeStage doorName(String doorName) {
            this.doorName = doorName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("door_type")
        public IsConnectedStage doorType(String doorType) {
            this.doorType = doorType;
            return this;
        }

        @java.lang.Override
        @JsonSetter("is_connected")
        public _FinalStage isConnected(boolean isConnected) {
            this.isConnected = isConnected;
            return this;
        }

        @java.lang.Override
        public AcsEntranceLatchMetadata build() {
            return new AcsEntranceLatchMetadata(
                    accessibilityType, doorName, doorType, isConnected, additionalProperties);
        }
    }
}
