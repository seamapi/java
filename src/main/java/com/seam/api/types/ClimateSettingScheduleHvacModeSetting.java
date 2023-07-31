package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClimateSettingScheduleHvacModeSetting {
    OFF("off"),

    HEAT("heat"),

    COOL("cool"),

    HEATCOOL("heatcool");

    private final String value;

    ClimateSettingScheduleHvacModeSetting(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
