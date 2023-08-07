package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ThermostatsClimateSettingSchedulesCreateResponse.Builder.class)
public final class ThermostatsClimateSettingSchedulesCreateResponse {
    private final ClimateSettingSchedule climateSettingSchedule;

    private final boolean ok;

    private ThermostatsClimateSettingSchedulesCreateResponse(
            ClimateSettingSchedule climateSettingSchedule, boolean ok) {
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
        return other instanceof ThermostatsClimateSettingSchedulesCreateResponse
                && equalTo((ThermostatsClimateSettingSchedulesCreateResponse) other);
    }

    private boolean equalTo(ThermostatsClimateSettingSchedulesCreateResponse other) {
        return climateSettingSchedule.equals(other.climateSettingSchedule) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.climateSettingSchedule, this.ok);
    }

    @Override
    public String toString() {
        return "ThermostatsClimateSettingSchedulesCreateResponse{" + "climateSettingSchedule: " + climateSettingSchedule
                + ", ok: " + ok + "}";
    }

    public static ClimateSettingScheduleStage builder() {
        return new Builder();
    }

    public interface ClimateSettingScheduleStage {
        OkStage climateSettingSchedule(ClimateSettingSchedule climateSettingSchedule);

        Builder from(ThermostatsClimateSettingSchedulesCreateResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        ThermostatsClimateSettingSchedulesCreateResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ClimateSettingScheduleStage, OkStage, _FinalStage {
        private ClimateSettingSchedule climateSettingSchedule;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(ThermostatsClimateSettingSchedulesCreateResponse other) {
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
        public ThermostatsClimateSettingSchedulesCreateResponse build() {
            return new ThermostatsClimateSettingSchedulesCreateResponse(climateSettingSchedule, ok);
        }
    }
}
