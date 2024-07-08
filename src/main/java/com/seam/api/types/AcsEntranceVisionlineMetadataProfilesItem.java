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
@JsonDeserialize(builder = AcsEntranceVisionlineMetadataProfilesItem.Builder.class)
public final class AcsEntranceVisionlineMetadataProfilesItem {
    private final String visionlineDoorProfileId;

    private final AcsEntranceVisionlineMetadataProfilesItemVisionlineDoorProfileType visionlineDoorProfileType;

    private final Map<String, Object> additionalProperties;

    private AcsEntranceVisionlineMetadataProfilesItem(
            String visionlineDoorProfileId,
            AcsEntranceVisionlineMetadataProfilesItemVisionlineDoorProfileType visionlineDoorProfileType,
            Map<String, Object> additionalProperties) {
        this.visionlineDoorProfileId = visionlineDoorProfileId;
        this.visionlineDoorProfileType = visionlineDoorProfileType;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("visionline_door_profile_id")
    public String getVisionlineDoorProfileId() {
        return visionlineDoorProfileId;
    }

    @JsonProperty("visionline_door_profile_type")
    public AcsEntranceVisionlineMetadataProfilesItemVisionlineDoorProfileType getVisionlineDoorProfileType() {
        return visionlineDoorProfileType;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AcsEntranceVisionlineMetadataProfilesItem
                && equalTo((AcsEntranceVisionlineMetadataProfilesItem) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AcsEntranceVisionlineMetadataProfilesItem other) {
        return visionlineDoorProfileId.equals(other.visionlineDoorProfileId)
                && visionlineDoorProfileType.equals(other.visionlineDoorProfileType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.visionlineDoorProfileId, this.visionlineDoorProfileType);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VisionlineDoorProfileIdStage builder() {
        return new Builder();
    }

    public interface VisionlineDoorProfileIdStage {
        VisionlineDoorProfileTypeStage visionlineDoorProfileId(String visionlineDoorProfileId);

        Builder from(AcsEntranceVisionlineMetadataProfilesItem other);
    }

    public interface VisionlineDoorProfileTypeStage {
        _FinalStage visionlineDoorProfileType(
                AcsEntranceVisionlineMetadataProfilesItemVisionlineDoorProfileType visionlineDoorProfileType);
    }

    public interface _FinalStage {
        AcsEntranceVisionlineMetadataProfilesItem build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements VisionlineDoorProfileIdStage, VisionlineDoorProfileTypeStage, _FinalStage {
        private String visionlineDoorProfileId;

        private AcsEntranceVisionlineMetadataProfilesItemVisionlineDoorProfileType visionlineDoorProfileType;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AcsEntranceVisionlineMetadataProfilesItem other) {
            visionlineDoorProfileId(other.getVisionlineDoorProfileId());
            visionlineDoorProfileType(other.getVisionlineDoorProfileType());
            return this;
        }

        @java.lang.Override
        @JsonSetter("visionline_door_profile_id")
        public VisionlineDoorProfileTypeStage visionlineDoorProfileId(String visionlineDoorProfileId) {
            this.visionlineDoorProfileId = visionlineDoorProfileId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("visionline_door_profile_type")
        public _FinalStage visionlineDoorProfileType(
                AcsEntranceVisionlineMetadataProfilesItemVisionlineDoorProfileType visionlineDoorProfileType) {
            this.visionlineDoorProfileType = visionlineDoorProfileType;
            return this;
        }

        @java.lang.Override
        public AcsEntranceVisionlineMetadataProfilesItem build() {
            return new AcsEntranceVisionlineMetadataProfilesItem(
                    visionlineDoorProfileId, visionlineDoorProfileType, additionalProperties);
        }
    }
}
