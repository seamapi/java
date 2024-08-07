/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.thermostats.climatesettingschedules.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.ClimateSettingSchedule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClimateSettingSchedulesUpdateResponse.Builder.class)
public final class ClimateSettingSchedulesUpdateResponse {
    private final ClimateSettingSchedule climateSettingSchedule;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private ClimateSettingSchedulesUpdateResponse(
            ClimateSettingSchedule climateSettingSchedule, boolean ok, Map<String, Object> additionalProperties) {
        this.climateSettingSchedule = climateSettingSchedule;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("climate_setting_schedule")
    public ClimateSettingSchedule getClimateSettingSchedule() {
        return climateSettingSchedule;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClimateSettingSchedulesUpdateResponse
                && equalTo((ClimateSettingSchedulesUpdateResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClimateSettingSchedulesUpdateResponse other) {
        return climateSettingSchedule.equals(other.climateSettingSchedule) && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.climateSettingSchedule, this.ok);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ClimateSettingScheduleStage builder() {
        return new Builder();
    }

    public interface ClimateSettingScheduleStage {
        OkStage climateSettingSchedule(ClimateSettingSchedule climateSettingSchedule);

        Builder from(ClimateSettingSchedulesUpdateResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        ClimateSettingSchedulesUpdateResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ClimateSettingScheduleStage, OkStage, _FinalStage {
        private ClimateSettingSchedule climateSettingSchedule;

        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClimateSettingSchedulesUpdateResponse other) {
            climateSettingSchedule(other.getClimateSettingSchedule());
            ok(other.getOk());
            return this;
        }

        @java.lang.Override
        @JsonSetter("climate_setting_schedule")
        public OkStage climateSettingSchedule(ClimateSettingSchedule climateSettingSchedule) {
            this.climateSettingSchedule = climateSettingSchedule;
            return this;
        }

        @java.lang.Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @java.lang.Override
        public ClimateSettingSchedulesUpdateResponse build() {
            return new ClimateSettingSchedulesUpdateResponse(climateSettingSchedule, ok, additionalProperties);
        }
    }
}
