package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = ThermostatsClimateSettingSchedulesListResponse.Builder.class)
public final class ThermostatsClimateSettingSchedulesListResponse {
    private final List<ClimateSettingSchedule> climateSettingSchedules;

    private final boolean ok;

    private ThermostatsClimateSettingSchedulesListResponse(
            List<ClimateSettingSchedule> climateSettingSchedules, boolean ok) {
        this.climateSettingSchedules = climateSettingSchedules;
        this.ok = ok;
    }

    @JsonProperty("climate_setting_schedules")
    public List<ClimateSettingSchedule> getClimateSettingSchedules() {
        return climateSettingSchedules;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsClimateSettingSchedulesListResponse
                && equalTo((ThermostatsClimateSettingSchedulesListResponse) other);
    }

    private boolean equalTo(ThermostatsClimateSettingSchedulesListResponse other) {
        return climateSettingSchedules.equals(other.climateSettingSchedules) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.climateSettingSchedules, this.ok);
    }

    @Override
    public String toString() {
        return "ThermostatsClimateSettingSchedulesListResponse{" + "climateSettingSchedules: " + climateSettingSchedules
                + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(ThermostatsClimateSettingSchedulesListResponse other);
    }

    public interface _FinalStage {
        ThermostatsClimateSettingSchedulesListResponse build();

        _FinalStage climateSettingSchedules(List<ClimateSettingSchedule> climateSettingSchedules);

        _FinalStage addClimateSettingSchedules(ClimateSettingSchedule climateSettingSchedules);

        _FinalStage addAllClimateSettingSchedules(List<ClimateSettingSchedule> climateSettingSchedules);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<ClimateSettingSchedule> climateSettingSchedules = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ThermostatsClimateSettingSchedulesListResponse other) {
            climateSettingSchedules(other.getClimateSettingSchedules());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public _FinalStage addAllClimateSettingSchedules(List<ClimateSettingSchedule> climateSettingSchedules) {
            this.climateSettingSchedules.addAll(climateSettingSchedules);
            return this;
        }

        @Override
        public _FinalStage addClimateSettingSchedules(ClimateSettingSchedule climateSettingSchedules) {
            this.climateSettingSchedules.add(climateSettingSchedules);
            return this;
        }

        @Override
        @JsonSetter(value = "climate_setting_schedules", nulls = Nulls.SKIP)
        public _FinalStage climateSettingSchedules(List<ClimateSettingSchedule> climateSettingSchedules) {
            this.climateSettingSchedules.clear();
            this.climateSettingSchedules.addAll(climateSettingSchedules);
            return this;
        }

        @Override
        public ThermostatsClimateSettingSchedulesListResponse build() {
            return new ThermostatsClimateSettingSchedulesListResponse(climateSettingSchedules, ok);
        }
    }
}
