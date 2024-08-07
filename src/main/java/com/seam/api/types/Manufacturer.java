/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Manufacturer {
    AKUVOX("akuvox"),

    AUGUST("august"),

    AVIGILON_ALTA("avigilon_alta"),

    BRIVO("brivo"),

    BUTTERFLYMX("butterflymx"),

    DOORKING("doorking"),

    FOUR_SUITES("four_suites"),

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

    WYZE("wyze"),

    YALE("yale"),

    MINUT("minut"),

    TWO_N("two_n"),

    TTLOCK("ttlock"),

    NEST("nest"),

    IGLOOHOME("igloohome"),

    ECOBEE("ecobee"),

    HUBITAT("hubitat"),

    CONTROLBYWEB("controlbyweb"),

    SMARTTHINGS("smartthings"),

    DORMAKABA_ORACODE("dormakaba_oracode");

    private final String value;

    Manufacturer(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
