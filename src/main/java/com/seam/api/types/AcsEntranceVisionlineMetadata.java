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
@JsonDeserialize(builder = AcsEntranceVisionlineMetadata.Builder.class)
public final class AcsEntranceVisionlineMetadata {
    private final String doorName;

    private final AcsEntranceVisionlineMetadataDoorCategory doorCategory;

    private final Optional<List<AcsEntranceVisionlineMetadataProfilesItem>> profiles;

    private final Map<String, Object> additionalProperties;

    private AcsEntranceVisionlineMetadata(
            String doorName,
            AcsEntranceVisionlineMetadataDoorCategory doorCategory,
            Optional<List<AcsEntranceVisionlineMetadataProfilesItem>> profiles,
            Map<String, Object> additionalProperties) {
        this.doorName = doorName;
        this.doorCategory = doorCategory;
        this.profiles = profiles;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("door_name")
    public String getDoorName() {
        return doorName;
    }

    @JsonProperty("door_category")
    public AcsEntranceVisionlineMetadataDoorCategory getDoorCategory() {
        return doorCategory;
    }

    @JsonProperty("profiles")
    public Optional<List<AcsEntranceVisionlineMetadataProfilesItem>> getProfiles() {
        return profiles;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AcsEntranceVisionlineMetadata && equalTo((AcsEntranceVisionlineMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AcsEntranceVisionlineMetadata other) {
        return doorName.equals(other.doorName)
                && doorCategory.equals(other.doorCategory)
                && profiles.equals(other.profiles);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.doorName, this.doorCategory, this.profiles);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DoorNameStage builder() {
        return new Builder();
    }

    public interface DoorNameStage {
        DoorCategoryStage doorName(String doorName);

        Builder from(AcsEntranceVisionlineMetadata other);
    }

    public interface DoorCategoryStage {
        _FinalStage doorCategory(AcsEntranceVisionlineMetadataDoorCategory doorCategory);
    }

    public interface _FinalStage {
        AcsEntranceVisionlineMetadata build();

        _FinalStage profiles(Optional<List<AcsEntranceVisionlineMetadataProfilesItem>> profiles);

        _FinalStage profiles(List<AcsEntranceVisionlineMetadataProfilesItem> profiles);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DoorNameStage, DoorCategoryStage, _FinalStage {
        private String doorName;

        private AcsEntranceVisionlineMetadataDoorCategory doorCategory;

        private Optional<List<AcsEntranceVisionlineMetadataProfilesItem>> profiles = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AcsEntranceVisionlineMetadata other) {
            doorName(other.getDoorName());
            doorCategory(other.getDoorCategory());
            profiles(other.getProfiles());
            return this;
        }

        @java.lang.Override
        @JsonSetter("door_name")
        public DoorCategoryStage doorName(String doorName) {
            this.doorName = doorName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("door_category")
        public _FinalStage doorCategory(AcsEntranceVisionlineMetadataDoorCategory doorCategory) {
            this.doorCategory = doorCategory;
            return this;
        }

        @java.lang.Override
        public _FinalStage profiles(List<AcsEntranceVisionlineMetadataProfilesItem> profiles) {
            this.profiles = Optional.of(profiles);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "profiles", nulls = Nulls.SKIP)
        public _FinalStage profiles(Optional<List<AcsEntranceVisionlineMetadataProfilesItem>> profiles) {
            this.profiles = profiles;
            return this;
        }

        @java.lang.Override
        public AcsEntranceVisionlineMetadata build() {
            return new AcsEntranceVisionlineMetadata(doorName, doorCategory, profiles, additionalProperties);
        }
    }
}
