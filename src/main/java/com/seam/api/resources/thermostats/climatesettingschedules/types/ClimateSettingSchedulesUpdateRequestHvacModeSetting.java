/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.thermostats.climatesettingschedules.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClimateSettingSchedulesUpdateRequestHvacModeSetting {
    OFF("off"),

    HEAT("heat"),

    COOL("cool"),

    HEAT_COOL("heat_cool");

    private final String value;

    ClimateSettingSchedulesUpdateRequestHvacModeSetting(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
