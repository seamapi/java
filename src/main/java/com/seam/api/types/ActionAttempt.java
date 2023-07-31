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

public final class ActionAttempt {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ActionAttempt(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ActionAttempt success(ActionAttemptSuccess value) {
        return new ActionAttempt(new SuccessValue(value));
    }

    public static ActionAttempt pending(ActionAttemptPending value) {
        return new ActionAttempt(new PendingValue(value));
    }

    public static ActionAttempt error(ActionAttemptError value) {
        return new ActionAttempt(new ErrorValue(value));
    }

    public boolean isSuccess() {
        return value instanceof SuccessValue;
    }

    public boolean isPending() {
        return value instanceof PendingValue;
    }

    public boolean isError() {
        return value instanceof ErrorValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<ActionAttemptSuccess> getSuccess() {
        if (isSuccess()) {
            return Optional.of(((SuccessValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ActionAttemptPending> getPending() {
        if (isPending()) {
            return Optional.of(((PendingValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ActionAttemptError> getError() {
        if (isError()) {
            return Optional.of(((ErrorValue) value).value);
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
        T visitSuccess(ActionAttemptSuccess success);

        T visitPending(ActionAttemptPending pending);

        T visitError(ActionAttemptError error);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "status", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(SuccessValue.class),
        @JsonSubTypes.Type(PendingValue.class),
        @JsonSubTypes.Type(ErrorValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("success")
    private static final class SuccessValue implements Value {
        @JsonUnwrapped
        private ActionAttemptSuccess value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SuccessValue() {}

        private SuccessValue(ActionAttemptSuccess value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSuccess(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SuccessValue && equalTo((SuccessValue) other);
        }

        private boolean equalTo(SuccessValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "ActionAttempt{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("pending")
    private static final class PendingValue implements Value {
        @JsonUnwrapped
        private ActionAttemptPending value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private PendingValue() {}

        private PendingValue(ActionAttemptPending value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitPending(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof PendingValue && equalTo((PendingValue) other);
        }

        private boolean equalTo(PendingValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "ActionAttempt{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("error")
    private static final class ErrorValue implements Value {
        @JsonUnwrapped
        private ActionAttemptError value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ErrorValue() {}

        private ErrorValue(ActionAttemptError value) {
            this.value = value;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitError(value);
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ErrorValue && equalTo((ErrorValue) other);
        }

        private boolean equalTo(ErrorValue other) {
            return value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @Override
        public String toString() {
            return "ActionAttempt{" + "value: " + value + "}";
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
            return "ActionAttempt{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
