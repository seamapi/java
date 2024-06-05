/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DevicePropertiesCodeConstraintsItemZero.Builder.class)
public final class DevicePropertiesCodeConstraintsItemZero {
    private final DevicePropertiesCodeConstraintsItemZeroConstraintType constraintType;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesCodeConstraintsItemZero(
            DevicePropertiesCodeConstraintsItemZeroConstraintType constraintType,
            Map<String, Object> additionalProperties) {
        this.constraintType = constraintType;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("constraint_type")
    public DevicePropertiesCodeConstraintsItemZeroConstraintType getConstraintType() {
        return constraintType;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesCodeConstraintsItemZero
                && equalTo((DevicePropertiesCodeConstraintsItemZero) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesCodeConstraintsItemZero other) {
        return constraintType.equals(other.constraintType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.constraintType);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ConstraintTypeStage builder() {
        return new Builder();
    }

    public interface ConstraintTypeStage {
        _FinalStage constraintType(DevicePropertiesCodeConstraintsItemZeroConstraintType constraintType);

        Builder from(DevicePropertiesCodeConstraintsItemZero other);
    }

    public interface _FinalStage {
        DevicePropertiesCodeConstraintsItemZero build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConstraintTypeStage, _FinalStage {
        private DevicePropertiesCodeConstraintsItemZeroConstraintType constraintType;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DevicePropertiesCodeConstraintsItemZero other) {
            constraintType(other.getConstraintType());
            return this;
        }

        @Override
        @JsonSetter("constraint_type")
        public _FinalStage constraintType(DevicePropertiesCodeConstraintsItemZeroConstraintType constraintType) {
            this.constraintType = constraintType;
            return this;
        }

        @Override
        public DevicePropertiesCodeConstraintsItemZero build() {
            return new DevicePropertiesCodeConstraintsItemZero(constraintType, additionalProperties);
        }
    }
}
