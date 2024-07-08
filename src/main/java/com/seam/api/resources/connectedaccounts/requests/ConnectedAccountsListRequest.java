/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.connectedaccounts.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.connectedaccounts.types.ConnectedAccountsListRequestCustomMetadataHasValue;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectedAccountsListRequest.Builder.class)
public final class ConnectedAccountsListRequest {
    private final Optional<Map<String, ConnectedAccountsListRequestCustomMetadataHasValue>> customMetadataHas;

    private final Map<String, Object> additionalProperties;

    private ConnectedAccountsListRequest(
            Optional<Map<String, ConnectedAccountsListRequestCustomMetadataHasValue>> customMetadataHas,
            Map<String, Object> additionalProperties) {
        this.customMetadataHas = customMetadataHas;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return <p>devices where the account's custom_metadata contains all of the provided key/value pairs.</p>
     */
    @JsonProperty("custom_metadata_has")
    public Optional<Map<String, ConnectedAccountsListRequestCustomMetadataHasValue>> getCustomMetadataHas() {
        return customMetadataHas;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsListRequest && equalTo((ConnectedAccountsListRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConnectedAccountsListRequest other) {
        return customMetadataHas.equals(other.customMetadataHas);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.customMetadataHas);
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
        private Optional<Map<String, ConnectedAccountsListRequestCustomMetadataHasValue>> customMetadataHas =
                Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ConnectedAccountsListRequest other) {
            customMetadataHas(other.getCustomMetadataHas());
            return this;
        }

        @JsonSetter(value = "custom_metadata_has", nulls = Nulls.SKIP)
        public Builder customMetadataHas(
                Optional<Map<String, ConnectedAccountsListRequestCustomMetadataHasValue>> customMetadataHas) {
            this.customMetadataHas = customMetadataHas;
            return this;
        }

        public Builder customMetadataHas(
                Map<String, ConnectedAccountsListRequestCustomMetadataHasValue> customMetadataHas) {
            this.customMetadataHas = Optional.of(customMetadataHas);
            return this;
        }

        public ConnectedAccountsListRequest build() {
            return new ConnectedAccountsListRequest(customMetadataHas, additionalProperties);
        }
    }
}
