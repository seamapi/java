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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AcsCredentialVisionlineMetadata.Builder.class)
public final class AcsCredentialVisionlineMetadata {
    private final AcsCredentialVisionlineMetadataCardFunctionType cardFunctionType;

    private final Optional<List<String>> joinerAcsCredentialIds;

    private final Optional<List<String>> guestAcsEntranceIds;

    private final Optional<List<String>> commonAcsEntranceIds;

    private final Map<String, Object> additionalProperties;

    private AcsCredentialVisionlineMetadata(
            AcsCredentialVisionlineMetadataCardFunctionType cardFunctionType,
            Optional<List<String>> joinerAcsCredentialIds,
            Optional<List<String>> guestAcsEntranceIds,
            Optional<List<String>> commonAcsEntranceIds,
            Map<String, Object> additionalProperties) {
        this.cardFunctionType = cardFunctionType;
        this.joinerAcsCredentialIds = joinerAcsCredentialIds;
        this.guestAcsEntranceIds = guestAcsEntranceIds;
        this.commonAcsEntranceIds = commonAcsEntranceIds;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("card_function_type")
    public AcsCredentialVisionlineMetadataCardFunctionType getCardFunctionType() {
        return cardFunctionType;
    }

    @JsonProperty("joiner_acs_credential_ids")
    public Optional<List<String>> getJoinerAcsCredentialIds() {
        return joinerAcsCredentialIds;
    }

    @JsonProperty("guest_acs_entrance_ids")
    public Optional<List<String>> getGuestAcsEntranceIds() {
        return guestAcsEntranceIds;
    }

    @JsonProperty("common_acs_entrance_ids")
    public Optional<List<String>> getCommonAcsEntranceIds() {
        return commonAcsEntranceIds;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AcsCredentialVisionlineMetadata && equalTo((AcsCredentialVisionlineMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AcsCredentialVisionlineMetadata other) {
        return cardFunctionType.equals(other.cardFunctionType)
                && joinerAcsCredentialIds.equals(other.joinerAcsCredentialIds)
                && guestAcsEntranceIds.equals(other.guestAcsEntranceIds)
                && commonAcsEntranceIds.equals(other.commonAcsEntranceIds);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.cardFunctionType,
                this.joinerAcsCredentialIds,
                this.guestAcsEntranceIds,
                this.commonAcsEntranceIds);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CardFunctionTypeStage builder() {
        return new Builder();
    }

    public interface CardFunctionTypeStage {
        _FinalStage cardFunctionType(AcsCredentialVisionlineMetadataCardFunctionType cardFunctionType);

        Builder from(AcsCredentialVisionlineMetadata other);
    }

    public interface _FinalStage {
        AcsCredentialVisionlineMetadata build();

        _FinalStage joinerAcsCredentialIds(Optional<List<String>> joinerAcsCredentialIds);

        _FinalStage joinerAcsCredentialIds(List<String> joinerAcsCredentialIds);

        _FinalStage guestAcsEntranceIds(Optional<List<String>> guestAcsEntranceIds);

        _FinalStage guestAcsEntranceIds(List<String> guestAcsEntranceIds);

        _FinalStage commonAcsEntranceIds(Optional<List<String>> commonAcsEntranceIds);

        _FinalStage commonAcsEntranceIds(List<String> commonAcsEntranceIds);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CardFunctionTypeStage, _FinalStage {
        private AcsCredentialVisionlineMetadataCardFunctionType cardFunctionType;

        private Optional<List<String>> commonAcsEntranceIds = Optional.empty();

        private Optional<List<String>> guestAcsEntranceIds = Optional.empty();

        private Optional<List<String>> joinerAcsCredentialIds = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AcsCredentialVisionlineMetadata other) {
            cardFunctionType(other.getCardFunctionType());
            joinerAcsCredentialIds(other.getJoinerAcsCredentialIds());
            guestAcsEntranceIds(other.getGuestAcsEntranceIds());
            commonAcsEntranceIds(other.getCommonAcsEntranceIds());
            return this;
        }

        @java.lang.Override
        @JsonSetter("card_function_type")
        public _FinalStage cardFunctionType(AcsCredentialVisionlineMetadataCardFunctionType cardFunctionType) {
            this.cardFunctionType = cardFunctionType;
            return this;
        }

        @java.lang.Override
        public _FinalStage commonAcsEntranceIds(List<String> commonAcsEntranceIds) {
            this.commonAcsEntranceIds = Optional.of(commonAcsEntranceIds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "common_acs_entrance_ids", nulls = Nulls.SKIP)
        public _FinalStage commonAcsEntranceIds(Optional<List<String>> commonAcsEntranceIds) {
            this.commonAcsEntranceIds = commonAcsEntranceIds;
            return this;
        }

        @java.lang.Override
        public _FinalStage guestAcsEntranceIds(List<String> guestAcsEntranceIds) {
            this.guestAcsEntranceIds = Optional.of(guestAcsEntranceIds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "guest_acs_entrance_ids", nulls = Nulls.SKIP)
        public _FinalStage guestAcsEntranceIds(Optional<List<String>> guestAcsEntranceIds) {
            this.guestAcsEntranceIds = guestAcsEntranceIds;
            return this;
        }

        @java.lang.Override
        public _FinalStage joinerAcsCredentialIds(List<String> joinerAcsCredentialIds) {
            this.joinerAcsCredentialIds = Optional.of(joinerAcsCredentialIds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "joiner_acs_credential_ids", nulls = Nulls.SKIP)
        public _FinalStage joinerAcsCredentialIds(Optional<List<String>> joinerAcsCredentialIds) {
            this.joinerAcsCredentialIds = joinerAcsCredentialIds;
            return this;
        }

        @java.lang.Override
        public AcsCredentialVisionlineMetadata build() {
            return new AcsCredentialVisionlineMetadata(
                    cardFunctionType,
                    joinerAcsCredentialIds,
                    guestAcsEntranceIds,
                    commonAcsEntranceIds,
                    additionalProperties);
        }
    }
}