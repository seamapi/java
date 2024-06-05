/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.thermostats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ThermostatsListRequestIncludeIfItem {
    CAN_REMOTELY_UNLOCK("can_remotely_unlock"),

    CAN_REMOTELY_LOCK("can_remotely_lock"),

    CAN_PROGRAM_OFFLINE_ACCESS_CODES("can_program_offline_access_codes"),

    CAN_PROGRAM_ONLINE_ACCESS_CODES("can_program_online_access_codes"),

    CAN_SIMULATE_REMOVAL("can_simulate_removal");

    private final String value;

    ThermostatsListRequestIncludeIfItem(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
