package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LocksListRequestManufacturer {
    AKUVOX("akuvox"),

    AUGUST("august"),

    BRIVO("brivo"),

    BUTTERFLYMX("butterflymx"),

    DOORKING("doorking"),

    GENIE("genie"),

    IGLOO("igloo"),

    KEYWE("keywe"),

    KWIKSET("kwikset"),

    LINEAR("linear"),

    LOCKLY("lockly"),

    NUKI("nuki"),

    PHILIA("philia"),

    SALTO("salto"),

    SAMSUNG("samsung"),

    SCHLAGE("schlage"),

    SEAM("seam"),

    UNKNOWN("unknown"),

    YALE("yale"),

    MINUT("minut"),

    TWO_N("two_n"),

    TTLOCK("ttlock"),

    NEST("nest"),

    IGLOOHOME("igloohome"),

    ECOBEE("ecobee"),

    HUBITAT("hubitat");

    private final String value;

    LocksListRequestManufacturer(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
