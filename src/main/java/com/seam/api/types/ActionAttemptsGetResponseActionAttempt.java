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

public final class ActionAttemptsGetResponseActionAttempt {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ActionAttemptsGetResponseActionAttempt(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ActionAttemptsGetResponseActionAttempt success(ActionAttemptsGetResponseActionAttemptSuccess value) {
        return new ActionAttemptsGetResponseActionAttempt(new SuccessValue(value));
    }

    public static ActionAttemptsGetResponseActionAttempt pending(ActionAttemptsGetResponseActionAttemptPending value) {
        return new ActionAttemptsGetResponseActionAttempt(new PendingValue(value));
    }

    public static ActionAttemptsGetResponseActionAttempt error(ActionAttemptsGetResponseActionAttemptError value) {
        return new ActionAttemptsGetResponseActionAttempt(new ErrorValue(value));
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

    public Optional<ActionAttemptsGetResponseActionAttemptSuccess> getSuccess() {
        if (isSuccess()) {
            return Optional.of(((SuccessValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ActionAttemptsGetResponseActionAttemptPending> getPending() {
        if (isPending()) {
            return Optional.of(((PendingValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ActionAttemptsGetResponseActionAttemptError> getError() {
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
        T visitSuccess(ActionAttemptsGetResponseActionAttemptSuccess success);

        T visitPending(ActionAttemptsGetResponseActionAttemptPending pending);

        T visitError(ActionAttemptsGetResponseActionAttemptError error);

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
        private ActionAttemptsGetResponseActionAttemptSuccess value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SuccessValue() {}

        private SuccessValue(ActionAttemptsGetResponseActionAttemptSuccess value) {
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
            return "ActionAttemptsGetResponseActionAttempt{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("pending")
    private static final class PendingValue implements Value {
        @JsonUnwrapped
        private ActionAttemptsGetResponseActionAttemptPending value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private PendingValue() {}

        private PendingValue(ActionAttemptsGetResponseActionAttemptPending value) {
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
            return "ActionAttemptsGetResponseActionAttempt{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("error")
    private static final class ErrorValue implements Value {
        @JsonUnwrapped
        private ActionAttemptsGetResponseActionAttemptError value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ErrorValue() {}

        private ErrorValue(ActionAttemptsGetResponseActionAttemptError value) {
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
            return "ActionAttemptsGetResponseActionAttempt{" + "value: " + value + "}";
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
            return "ActionAttemptsGetResponseActionAttempt{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
