/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.devices.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.ProviderCategory;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DevicesListDeviceProvidersRequest.Builder.class)
public final class DevicesListDeviceProvidersRequest {
    private final Optional<ProviderCategory> providerCategory;

    private final Map<String, Object> additionalProperties;

    private DevicesListDeviceProvidersRequest(
            Optional<ProviderCategory> providerCategory, Map<String, Object> additionalProperties) {
        this.providerCategory = providerCategory;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider_category")
    public Optional<ProviderCategory> getProviderCategory() {
        return providerCategory;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesListDeviceProvidersRequest && equalTo((DevicesListDeviceProvidersRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicesListDeviceProvidersRequest other) {
        return providerCategory.equals(other.providerCategory);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.providerCategory);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<ProviderCategory> providerCategory = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(DevicesListDeviceProvidersRequest other) {
            providerCategory(other.getProviderCategory());
            return this;
        }

        @JsonSetter(value = "provider_category", nulls = Nulls.SKIP)
        public Builder providerCategory(Optional<ProviderCategory> providerCategory) {
            this.providerCategory = providerCategory;
            return this;
        }

        public Builder providerCategory(ProviderCategory providerCategory) {
            this.providerCategory = Optional.of(providerCategory);
            return this;
        }

        public DevicesListDeviceProvidersRequest build() {
            return new DevicesListDeviceProvidersRequest(providerCategory, additionalProperties);
        }
    }
}
