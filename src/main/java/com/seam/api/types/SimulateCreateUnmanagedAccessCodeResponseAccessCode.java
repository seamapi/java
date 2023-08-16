package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class SimulateCreateUnmanagedAccessCodeResponseAccessCode {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private SimulateCreateUnmanagedAccessCodeResponseAccessCode(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static SimulateCreateUnmanagedAccessCodeResponseAccessCode ongoing(
            SimulateCreateUnmanagedAccessCodeResponseAccessCodeOngoing value) {
        return new SimulateCreateUnmanagedAccessCodeResponseAccessCode(new OngoingValue(value));
    }

    public static SimulateCreateUnmanagedAccessCodeResponseAccessCode timeBound(
            SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound value) {
        return new SimulateCreateUnmanagedAccessCodeResponseAccessCode(new TimeBoundValue(value));
    }

    public boolean isOngoing() {
        return value instanceof OngoingValue;
    }

    public boolean isTimeBound() {
        return value instanceof TimeBoundValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<SimulateCreateUnmanagedAccessCodeResponseAccessCodeOngoing> getOngoing() {
        if (isOngoing()) {
            return Optional.of(((OngoingValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound> getTimeBound() {
        if (isTimeBound()) {
            return Optional.of(((TimeBoundValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitOngoing(SimulateCreateUnmanagedAccessCodeResponseAccessCodeOngoing ongoing);

        T visitTimeBound(SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound timeBound);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(OngoingValue.class), @JsonSubTypes.Type(TimeBoundValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("ongoing")
    private static final class OngoingValue implements Value {
        @JsonUnwrapped
        private SimulateCreateUnmanagedAccessCodeResponseAccessCodeOngoing value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OngoingValue() {}

        private OngoingValue(SimulateCreateUnmanagedAccessCodeResponseAccessCodeOngoing value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitOngoing(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof OngoingValue && equalTo((OngoingValue) other);
        }

        private boolean equalTo(OngoingValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "SimulateCreateUnmanagedAccessCodeResponseAccessCode{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("time_bound")
    private static final class TimeBoundValue implements Value {
        @JsonUnwrapped
        private SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TimeBoundValue() {}

        private TimeBoundValue(SimulateCreateUnmanagedAccessCodeResponseAccessCodeTimeBound value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTimeBound(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TimeBoundValue && equalTo((TimeBoundValue) other);
        }

        private boolean equalTo(TimeBoundValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "SimulateCreateUnmanagedAccessCodeResponseAccessCode{" + "value: " + value + "}";
        }
    }

    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @Override
        public String toString() {
            return "SimulateCreateUnmanagedAccessCodeResponseAccessCode{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
