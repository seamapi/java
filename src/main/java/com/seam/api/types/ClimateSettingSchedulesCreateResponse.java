package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClimateSettingSchedulesCreateResponse.Builder.class)
public final class ClimateSettingSchedulesCreateResponse {
    private final ClimateSettingSchedule climateSettingSchedule;

    private final boolean ok;

    private ClimateSettingSchedulesCreateResponse(ClimateSettingSchedule climateSettingSchedule, boolean ok) {
        this.climateSettingSchedule = climateSettingSchedule;
        this.ok = ok;
    }

    @JsonProperty("climate_setting_schedule")
    public ClimateSettingSchedule getClimateSettingSchedule() {
        return climateSettingSchedule;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClimateSettingSchedulesCreateResponse
                && equalTo((ClimateSettingSchedulesCreateResponse) other);
    }

    private boolean equalTo(ClimateSettingSchedulesCreateResponse other) {
        return climateSettingSchedule.equals(other.climateSettingSchedule) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.climateSettingSchedule, this.ok);
    }

    @Override
    public String toString() {
        return "ClimateSettingSchedulesCreateResponse{" + "climateSettingSchedule: " + climateSettingSchedule + ", ok: "
                + ok + "}";
    }

    public static ClimateSettingScheduleStage builder() {
        return new Builder();
    }

    public interface ClimateSettingScheduleStage {
        OkStage climateSettingSchedule(ClimateSettingSchedule climateSettingSchedule);

        Builder from(ClimateSettingSchedulesCreateResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        ClimateSettingSchedulesCreateResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ClimateSettingScheduleStage, OkStage, _FinalStage {
        private ClimateSettingSchedule climateSettingSchedule;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(ClimateSettingSchedulesCreateResponse other) {
            climateSettingSchedule(other.getClimateSettingSchedule());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("climate_setting_schedule")
        public OkStage climateSettingSchedule(ClimateSettingSchedule climateSettingSchedule) {
            this.climateSettingSchedule = climateSettingSchedule;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public ClimateSettingSchedulesCreateResponse build() {
            return new ClimateSettingSchedulesCreateResponse(climateSettingSchedule, ok);
        }
    }
}
