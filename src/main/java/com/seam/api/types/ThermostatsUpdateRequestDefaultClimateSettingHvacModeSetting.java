package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ThermostatsUpdateRequestDefaultClimateSettingHvacModeSetting {
    OFF("off"),

    HEAT("heat"),

    COOL("cool"),

    HEATCOOL("heatcool");

    private final String value;

    ThermostatsUpdateRequestDefaultClimateSettingHvacModeSetting(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
