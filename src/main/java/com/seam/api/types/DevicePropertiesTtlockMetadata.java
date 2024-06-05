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
@JsonDeserialize(builder = DevicePropertiesTtlockMetadata.Builder.class)
public final class DevicePropertiesTtlockMetadata {
    private final double lockId;

    private final String lockAlias;

    private final String featureValue;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesTtlockMetadata(
            double lockId, String lockAlias, String featureValue, Map<String, Object> additionalProperties) {
        this.lockId = lockId;
        this.lockAlias = lockAlias;
        this.featureValue = featureValue;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("lock_id")
    public double getLockId() {
        return lockId;
    }

    @JsonProperty("lock_alias")
    public String getLockAlias() {
        return lockAlias;
    }

    @JsonProperty("feature_value")
    public String getFeatureValue() {
        return featureValue;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesTtlockMetadata && equalTo((DevicePropertiesTtlockMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesTtlockMetadata other) {
        return lockId == other.lockId && lockAlias.equals(other.lockAlias) && featureValue.equals(other.featureValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.lockId, this.lockAlias, this.featureValue);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LockIdStage builder() {
        return new Builder();
    }

    public interface LockIdStage {
        LockAliasStage lockId(double lockId);

        Builder from(DevicePropertiesTtlockMetadata other);
    }

    public interface LockAliasStage {
        FeatureValueStage lockAlias(String lockAlias);
    }

    public interface FeatureValueStage {
        _FinalStage featureValue(String featureValue);
    }

    public interface _FinalStage {
        DevicePropertiesTtlockMetadata build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LockIdStage, LockAliasStage, FeatureValueStage, _FinalStage {
        private double lockId;

        private String lockAlias;

        private String featureValue;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DevicePropertiesTtlockMetadata other) {
            lockId(other.getLockId());
            lockAlias(other.getLockAlias());
            featureValue(other.getFeatureValue());
            return this;
        }

        @Override
        @JsonSetter("lock_id")
        public LockAliasStage lockId(double lockId) {
            this.lockId = lockId;
            return this;
        }

        @Override
        @JsonSetter("lock_alias")
        public FeatureValueStage lockAlias(String lockAlias) {
            this.lockAlias = lockAlias;
            return this;
        }

        @Override
        @JsonSetter("feature_value")
        public _FinalStage featureValue(String featureValue) {
            this.featureValue = featureValue;
            return this;
        }

        @Override
        public DevicePropertiesTtlockMetadata build() {
            return new DevicePropertiesTtlockMetadata(lockId, lockAlias, featureValue, additionalProperties);
        }
    }
}
