/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public final class UnmanagedGetResponseAccessCodeType {
    public static final UnmanagedGetResponseAccessCodeType TIME_BOUND =
            new UnmanagedGetResponseAccessCodeType(Value.TIME_BOUND, "time_bound");

    public static final UnmanagedGetResponseAccessCodeType ONGOING =
            new UnmanagedGetResponseAccessCodeType(Value.ONGOING, "ongoing");

    private final Value value;

    private final String string;

    UnmanagedGetResponseAccessCodeType(Value value, String string) {
        this.value = value;
        this.string = string;
    }

    public Value getEnumValue() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return this.string;
    }

    @Override
    public boolean equals(Object other) {
        return (this == other)
                || (other instanceof UnmanagedGetResponseAccessCodeType
                        && this.string.equals(((UnmanagedGetResponseAccessCodeType) other).string));
    }

    @Override
    public int hashCode() {
        return this.string.hashCode();
    }

    public <T> T visit(Visitor<T> visitor) {
        switch (value) {
            case TIME_BOUND:
                return visitor.visitTimeBound();
            case ONGOING:
                return visitor.visitOngoing();
            case UNKNOWN:
            default:
                return visitor.visitUnknown(string);
        }
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static UnmanagedGetResponseAccessCodeType valueOf(String value) {
        switch (value) {
            case "time_bound":
                return TIME_BOUND;
            case "ongoing":
                return ONGOING;
            default:
                return new UnmanagedGetResponseAccessCodeType(Value.UNKNOWN, value);
        }
    }

    public enum Value {
        TIME_BOUND,

        ONGOING,

        UNKNOWN
    }

    public interface Visitor<T> {
        T visitTimeBound();

        T visitOngoing();

        T visitUnknown(String unknownType);
    }
}
