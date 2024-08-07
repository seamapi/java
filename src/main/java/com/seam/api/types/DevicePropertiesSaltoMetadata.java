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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DevicePropertiesSaltoMetadata.Builder.class)
public final class DevicePropertiesSaltoMetadata {
    private final String lockId;

    private final String customerReference;

    private final String lockType;

    private final String batteryLevel;

    private final String lockedState;

    private final Optional<String> model;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesSaltoMetadata(
            String lockId,
            String customerReference,
            String lockType,
            String batteryLevel,
            String lockedState,
            Optional<String> model,
            Map<String, Object> additionalProperties) {
        this.lockId = lockId;
        this.customerReference = customerReference;
        this.lockType = lockType;
        this.batteryLevel = batteryLevel;
        this.lockedState = lockedState;
        this.model = model;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("lock_id")
    public String getLockId() {
        return lockId;
    }

    @JsonProperty("customer_reference")
    public String getCustomerReference() {
        return customerReference;
    }

    @JsonProperty("lock_type")
    public String getLockType() {
        return lockType;
    }

    @JsonProperty("battery_level")
    public String getBatteryLevel() {
        return batteryLevel;
    }

    @JsonProperty("locked_state")
    public String getLockedState() {
        return lockedState;
    }

    @JsonProperty("model")
    public Optional<String> getModel() {
        return model;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesSaltoMetadata && equalTo((DevicePropertiesSaltoMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesSaltoMetadata other) {
        return lockId.equals(other.lockId)
                && customerReference.equals(other.customerReference)
                && lockType.equals(other.lockType)
                && batteryLevel.equals(other.batteryLevel)
                && lockedState.equals(other.lockedState)
                && model.equals(other.model);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.lockId, this.customerReference, this.lockType, this.batteryLevel, this.lockedState, this.model);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LockIdStage builder() {
        return new Builder();
    }

    public interface LockIdStage {
        CustomerReferenceStage lockId(String lockId);

        Builder from(DevicePropertiesSaltoMetadata other);
    }

    public interface CustomerReferenceStage {
        LockTypeStage customerReference(String customerReference);
    }

    public interface LockTypeStage {
        BatteryLevelStage lockType(String lockType);
    }

    public interface BatteryLevelStage {
        LockedStateStage batteryLevel(String batteryLevel);
    }

    public interface LockedStateStage {
        _FinalStage lockedState(String lockedState);
    }

    public interface _FinalStage {
        DevicePropertiesSaltoMetadata build();

        _FinalStage model(Optional<String> model);

        _FinalStage model(String model);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements LockIdStage,
                    CustomerReferenceStage,
                    LockTypeStage,
                    BatteryLevelStage,
                    LockedStateStage,
                    _FinalStage {
        private String lockId;

        private String customerReference;

        private String lockType;

        private String batteryLevel;

        private String lockedState;

        private Optional<String> model = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DevicePropertiesSaltoMetadata other) {
            lockId(other.getLockId());
            customerReference(other.getCustomerReference());
            lockType(other.getLockType());
            batteryLevel(other.getBatteryLevel());
            lockedState(other.getLockedState());
            model(other.getModel());
            return this;
        }

        @java.lang.Override
        @JsonSetter("lock_id")
        public CustomerReferenceStage lockId(String lockId) {
            this.lockId = lockId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("customer_reference")
        public LockTypeStage customerReference(String customerReference) {
            this.customerReference = customerReference;
            return this;
        }

        @java.lang.Override
        @JsonSetter("lock_type")
        public BatteryLevelStage lockType(String lockType) {
            this.lockType = lockType;
            return this;
        }

        @java.lang.Override
        @JsonSetter("battery_level")
        public LockedStateStage batteryLevel(String batteryLevel) {
            this.batteryLevel = batteryLevel;
            return this;
        }

        @java.lang.Override
        @JsonSetter("locked_state")
        public _FinalStage lockedState(String lockedState) {
            this.lockedState = lockedState;
            return this;
        }

        @java.lang.Override
        public _FinalStage model(String model) {
            this.model = Optional.of(model);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public _FinalStage model(Optional<String> model) {
            this.model = model;
            return this;
        }

        @java.lang.Override
        public DevicePropertiesSaltoMetadata build() {
            return new DevicePropertiesSaltoMetadata(
                    lockId, customerReference, lockType, batteryLevel, lockedState, model, additionalProperties);
        }
    }
}
