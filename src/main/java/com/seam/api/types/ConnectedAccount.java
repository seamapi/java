package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = ConnectedAccount.Builder.class)
public final class ConnectedAccount {
    private final Optional<String> connectedAccountId;

    private final Optional<String> createdAt;

    private final Optional<ConnectedAccountUserIdentifier> userIdentifier;

    private final Optional<String> accountType;

    private final Optional<Object> errors;

    private final Optional<Object> warnings;

    private final Optional<Map<String, Optional<ConnectedAccountCustomMetadataValue>>> customMetadata;

    private ConnectedAccount(
            Optional<String> connectedAccountId,
            Optional<String> createdAt,
            Optional<ConnectedAccountUserIdentifier> userIdentifier,
            Optional<String> accountType,
            Optional<Object> errors,
            Optional<Object> warnings,
            Optional<Map<String, Optional<ConnectedAccountCustomMetadataValue>>> customMetadata) {
        this.connectedAccountId = connectedAccountId;
        this.createdAt = createdAt;
        this.userIdentifier = userIdentifier;
        this.accountType = accountType;
        this.errors = errors;
        this.warnings = warnings;
        this.customMetadata = customMetadata;
    }

    @JsonProperty("connected_account_id")
    public Optional<String> getConnectedAccountId() {
        return connectedAccountId;
    }

    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("user_identifier")
    public Optional<ConnectedAccountUserIdentifier> getUserIdentifier() {
        return userIdentifier;
    }

    @JsonProperty("account_type")
    public Optional<String> getAccountType() {
        return accountType;
    }

    @JsonProperty("errors")
    public Optional<Object> getErrors() {
        return errors;
    }

    @JsonProperty("warnings")
    public Optional<Object> getWarnings() {
        return warnings;
    }

    @JsonProperty("custom_metadata")
    public Optional<Map<String, Optional<ConnectedAccountCustomMetadataValue>>> getCustomMetadata() {
        return customMetadata;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccount && equalTo((ConnectedAccount) other);
    }

    private boolean equalTo(ConnectedAccount other) {
        return connectedAccountId.equals(other.connectedAccountId)
                && createdAt.equals(other.createdAt)
                && userIdentifier.equals(other.userIdentifier)
                && accountType.equals(other.accountType)
                && errors.equals(other.errors)
                && warnings.equals(other.warnings)
                && customMetadata.equals(other.customMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.connectedAccountId,
                this.createdAt,
                this.userIdentifier,
                this.accountType,
                this.errors,
                this.warnings,
                this.customMetadata);
    }

    @Override
    public String toString() {
        return "ConnectedAccount{" + "connectedAccountId: " + connectedAccountId + ", createdAt: " + createdAt
                + ", userIdentifier: " + userIdentifier + ", accountType: " + accountType + ", errors: " + errors
                + ", warnings: " + warnings + ", customMetadata: " + customMetadata + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> connectedAccountId = Optional.empty();

        private Optional<String> createdAt = Optional.empty();

        private Optional<ConnectedAccountUserIdentifier> userIdentifier = Optional.empty();

        private Optional<String> accountType = Optional.empty();

        private Optional<Object> errors = Optional.empty();

        private Optional<Object> warnings = Optional.empty();

        private Optional<Map<String, Optional<ConnectedAccountCustomMetadataValue>>> customMetadata = Optional.empty();

        private Builder() {}

        public Builder from(ConnectedAccount other) {
            connectedAccountId(other.getConnectedAccountId());
            createdAt(other.getCreatedAt());
            userIdentifier(other.getUserIdentifier());
            accountType(other.getAccountType());
            errors(other.getErrors());
            warnings(other.getWarnings());
            customMetadata(other.getCustomMetadata());
            return this;
        }

        @JsonSetter(value = "connected_account_id", nulls = Nulls.SKIP)
        public Builder connectedAccountId(Optional<String> connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        public Builder connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = Optional.of(connectedAccountId);
            return this;
        }

        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Optional.of(createdAt);
            return this;
        }

        @JsonSetter(value = "user_identifier", nulls = Nulls.SKIP)
        public Builder userIdentifier(Optional<ConnectedAccountUserIdentifier> userIdentifier) {
            this.userIdentifier = userIdentifier;
            return this;
        }

        public Builder userIdentifier(ConnectedAccountUserIdentifier userIdentifier) {
            this.userIdentifier = Optional.of(userIdentifier);
            return this;
        }

        @JsonSetter(value = "account_type", nulls = Nulls.SKIP)
        public Builder accountType(Optional<String> accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder accountType(String accountType) {
            this.accountType = Optional.of(accountType);
            return this;
        }

        @JsonSetter(value = "errors", nulls = Nulls.SKIP)
        public Builder errors(Optional<Object> errors) {
            this.errors = errors;
            return this;
        }

        public Builder errors(Object errors) {
            this.errors = Optional.of(errors);
            return this;
        }

        @JsonSetter(value = "warnings", nulls = Nulls.SKIP)
        public Builder warnings(Optional<Object> warnings) {
            this.warnings = warnings;
            return this;
        }

        public Builder warnings(Object warnings) {
            this.warnings = Optional.of(warnings);
            return this;
        }

        @JsonSetter(value = "custom_metadata", nulls = Nulls.SKIP)
        public Builder customMetadata(
                Optional<Map<String, Optional<ConnectedAccountCustomMetadataValue>>> customMetadata) {
            this.customMetadata = customMetadata;
            return this;
        }

        public Builder customMetadata(Map<String, Optional<ConnectedAccountCustomMetadataValue>> customMetadata) {
            this.customMetadata = Optional.of(customMetadata);
            return this;
        }

        public ConnectedAccount build() {
            return new ConnectedAccount(
                    connectedAccountId, createdAt, userIdentifier, accountType, errors, warnings, customMetadata);
        }
    }
}
