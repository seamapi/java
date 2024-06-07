/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.credentials.types;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CredentialsCreateRequestVisionlineMetadata.Builder.class)
public final class CredentialsCreateRequestVisionlineMetadata {
    private final Optional<String> assaAbloyCredentialServiceMobileEndpointId;

    private final Optional<CredentialsCreateRequestVisionlineMetadataCardFormat> cardFormat;

    private final Optional<CredentialsCreateRequestVisionlineMetadataCardFunctionType> cardFunctionType;

    private final Optional<Boolean> isOverrideKey;

    private final Optional<Boolean> override;

    private final Optional<List<String>> joinerAcsCredentialIds;

    private final Map<String, Object> additionalProperties;

    private CredentialsCreateRequestVisionlineMetadata(
            Optional<String> assaAbloyCredentialServiceMobileEndpointId,
            Optional<CredentialsCreateRequestVisionlineMetadataCardFormat> cardFormat,
            Optional<CredentialsCreateRequestVisionlineMetadataCardFunctionType> cardFunctionType,
            Optional<Boolean> isOverrideKey,
            Optional<Boolean> override,
            Optional<List<String>> joinerAcsCredentialIds,
            Map<String, Object> additionalProperties) {
        this.assaAbloyCredentialServiceMobileEndpointId = assaAbloyCredentialServiceMobileEndpointId;
        this.cardFormat = cardFormat;
        this.cardFunctionType = cardFunctionType;
        this.isOverrideKey = isOverrideKey;
        this.override = override;
        this.joinerAcsCredentialIds = joinerAcsCredentialIds;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("assa_abloy_credential_service_mobile_endpoint_id")
    public Optional<String> getAssaAbloyCredentialServiceMobileEndpointId() {
        return assaAbloyCredentialServiceMobileEndpointId;
    }

    @JsonProperty("card_format")
    public Optional<CredentialsCreateRequestVisionlineMetadataCardFormat> getCardFormat() {
        return cardFormat;
    }

    @JsonProperty("card_function_type")
    public Optional<CredentialsCreateRequestVisionlineMetadataCardFunctionType> getCardFunctionType() {
        return cardFunctionType;
    }

    /**
     * @return <hr />
     * <pre><code>      deprecated: use override.
     *       ---
     * </code></pre>
     */
    @JsonProperty("is_override_key")
    public Optional<Boolean> getIsOverrideKey() {
        return isOverrideKey;
    }

    @JsonProperty("override")
    public Optional<Boolean> getOverride() {
        return override;
    }

    @JsonProperty("joiner_acs_credential_ids")
    public Optional<List<String>> getJoinerAcsCredentialIds() {
        return joinerAcsCredentialIds;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CredentialsCreateRequestVisionlineMetadata
                && equalTo((CredentialsCreateRequestVisionlineMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CredentialsCreateRequestVisionlineMetadata other) {
        return assaAbloyCredentialServiceMobileEndpointId.equals(other.assaAbloyCredentialServiceMobileEndpointId)
                && cardFormat.equals(other.cardFormat)
                && cardFunctionType.equals(other.cardFunctionType)
                && isOverrideKey.equals(other.isOverrideKey)
                && override.equals(other.override)
                && joinerAcsCredentialIds.equals(other.joinerAcsCredentialIds);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.assaAbloyCredentialServiceMobileEndpointId,
                this.cardFormat,
                this.cardFunctionType,
                this.isOverrideKey,
                this.override,
                this.joinerAcsCredentialIds);
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
        private Optional<String> assaAbloyCredentialServiceMobileEndpointId = Optional.empty();

        private Optional<CredentialsCreateRequestVisionlineMetadataCardFormat> cardFormat = Optional.empty();

        private Optional<CredentialsCreateRequestVisionlineMetadataCardFunctionType> cardFunctionType =
                Optional.empty();

        private Optional<Boolean> isOverrideKey = Optional.empty();

        private Optional<Boolean> override = Optional.empty();

        private Optional<List<String>> joinerAcsCredentialIds = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CredentialsCreateRequestVisionlineMetadata other) {
            assaAbloyCredentialServiceMobileEndpointId(other.getAssaAbloyCredentialServiceMobileEndpointId());
            cardFormat(other.getCardFormat());
            cardFunctionType(other.getCardFunctionType());
            isOverrideKey(other.getIsOverrideKey());
            override(other.getOverride());
            joinerAcsCredentialIds(other.getJoinerAcsCredentialIds());
            return this;
        }

        @JsonSetter(value = "assa_abloy_credential_service_mobile_endpoint_id", nulls = Nulls.SKIP)
        public Builder assaAbloyCredentialServiceMobileEndpointId(
                Optional<String> assaAbloyCredentialServiceMobileEndpointId) {
            this.assaAbloyCredentialServiceMobileEndpointId = assaAbloyCredentialServiceMobileEndpointId;
            return this;
        }

        public Builder assaAbloyCredentialServiceMobileEndpointId(String assaAbloyCredentialServiceMobileEndpointId) {
            this.assaAbloyCredentialServiceMobileEndpointId = Optional.of(assaAbloyCredentialServiceMobileEndpointId);
            return this;
        }

        @JsonSetter(value = "card_format", nulls = Nulls.SKIP)
        public Builder cardFormat(Optional<CredentialsCreateRequestVisionlineMetadataCardFormat> cardFormat) {
            this.cardFormat = cardFormat;
            return this;
        }

        public Builder cardFormat(CredentialsCreateRequestVisionlineMetadataCardFormat cardFormat) {
            this.cardFormat = Optional.of(cardFormat);
            return this;
        }

        @JsonSetter(value = "card_function_type", nulls = Nulls.SKIP)
        public Builder cardFunctionType(
                Optional<CredentialsCreateRequestVisionlineMetadataCardFunctionType> cardFunctionType) {
            this.cardFunctionType = cardFunctionType;
            return this;
        }

        public Builder cardFunctionType(CredentialsCreateRequestVisionlineMetadataCardFunctionType cardFunctionType) {
            this.cardFunctionType = Optional.of(cardFunctionType);
            return this;
        }

        @JsonSetter(value = "is_override_key", nulls = Nulls.SKIP)
        public Builder isOverrideKey(Optional<Boolean> isOverrideKey) {
            this.isOverrideKey = isOverrideKey;
            return this;
        }

        public Builder isOverrideKey(Boolean isOverrideKey) {
            this.isOverrideKey = Optional.of(isOverrideKey);
            return this;
        }

        @JsonSetter(value = "override", nulls = Nulls.SKIP)
        public Builder override(Optional<Boolean> override) {
            this.override = override;
            return this;
        }

        public Builder override(Boolean override) {
            this.override = Optional.of(override);
            return this;
        }

        @JsonSetter(value = "joiner_acs_credential_ids", nulls = Nulls.SKIP)
        public Builder joinerAcsCredentialIds(Optional<List<String>> joinerAcsCredentialIds) {
            this.joinerAcsCredentialIds = joinerAcsCredentialIds;
            return this;
        }

        public Builder joinerAcsCredentialIds(List<String> joinerAcsCredentialIds) {
            this.joinerAcsCredentialIds = Optional.of(joinerAcsCredentialIds);
            return this;
        }

        public CredentialsCreateRequestVisionlineMetadata build() {
            return new CredentialsCreateRequestVisionlineMetadata(
                    assaAbloyCredentialServiceMobileEndpointId,
                    cardFormat,
                    cardFunctionType,
                    isOverrideKey,
                    override,
                    joinerAcsCredentialIds,
                    additionalProperties);
        }
    }
}