/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.clientsessions.requests;

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
@JsonDeserialize(builder = ClientSessionsGrantAccessRequest.Builder.class)
public final class ClientSessionsGrantAccessRequest {
    private final Optional<String> clientSessionId;

    private final Optional<String> userIdentifierKey;

    private final Optional<List<String>> connectedAccountIds;

    private final Optional<List<String>> connectWebviewIds;

    private final Optional<List<String>> userIdentityIds;

    private final Map<String, Object> additionalProperties;

    private ClientSessionsGrantAccessRequest(
            Optional<String> clientSessionId,
            Optional<String> userIdentifierKey,
            Optional<List<String>> connectedAccountIds,
            Optional<List<String>> connectWebviewIds,
            Optional<List<String>> userIdentityIds,
            Map<String, Object> additionalProperties) {
        this.clientSessionId = clientSessionId;
        this.userIdentifierKey = userIdentifierKey;
        this.connectedAccountIds = connectedAccountIds;
        this.connectWebviewIds = connectWebviewIds;
        this.userIdentityIds = userIdentityIds;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("client_session_id")
    public Optional<String> getClientSessionId() {
        return clientSessionId;
    }

    @JsonProperty("user_identifier_key")
    public Optional<String> getUserIdentifierKey() {
        return userIdentifierKey;
    }

    @JsonProperty("connected_account_ids")
    public Optional<List<String>> getConnectedAccountIds() {
        return connectedAccountIds;
    }

    @JsonProperty("connect_webview_ids")
    public Optional<List<String>> getConnectWebviewIds() {
        return connectWebviewIds;
    }

    @JsonProperty("user_identity_ids")
    public Optional<List<String>> getUserIdentityIds() {
        return userIdentityIds;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSessionsGrantAccessRequest && equalTo((ClientSessionsGrantAccessRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientSessionsGrantAccessRequest other) {
        return clientSessionId.equals(other.clientSessionId)
                && userIdentifierKey.equals(other.userIdentifierKey)
                && connectedAccountIds.equals(other.connectedAccountIds)
                && connectWebviewIds.equals(other.connectWebviewIds)
                && userIdentityIds.equals(other.userIdentityIds);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.clientSessionId,
                this.userIdentifierKey,
                this.connectedAccountIds,
                this.connectWebviewIds,
                this.userIdentityIds);
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
        private Optional<String> clientSessionId = Optional.empty();

        private Optional<String> userIdentifierKey = Optional.empty();

        private Optional<List<String>> connectedAccountIds = Optional.empty();

        private Optional<List<String>> connectWebviewIds = Optional.empty();

        private Optional<List<String>> userIdentityIds = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ClientSessionsGrantAccessRequest other) {
            clientSessionId(other.getClientSessionId());
            userIdentifierKey(other.getUserIdentifierKey());
            connectedAccountIds(other.getConnectedAccountIds());
            connectWebviewIds(other.getConnectWebviewIds());
            userIdentityIds(other.getUserIdentityIds());
            return this;
        }

        @JsonSetter(value = "client_session_id", nulls = Nulls.SKIP)
        public Builder clientSessionId(Optional<String> clientSessionId) {
            this.clientSessionId = clientSessionId;
            return this;
        }

        public Builder clientSessionId(String clientSessionId) {
            this.clientSessionId = Optional.of(clientSessionId);
            return this;
        }

        @JsonSetter(value = "user_identifier_key", nulls = Nulls.SKIP)
        public Builder userIdentifierKey(Optional<String> userIdentifierKey) {
            this.userIdentifierKey = userIdentifierKey;
            return this;
        }

        public Builder userIdentifierKey(String userIdentifierKey) {
            this.userIdentifierKey = Optional.of(userIdentifierKey);
            return this;
        }

        @JsonSetter(value = "connected_account_ids", nulls = Nulls.SKIP)
        public Builder connectedAccountIds(Optional<List<String>> connectedAccountIds) {
            this.connectedAccountIds = connectedAccountIds;
            return this;
        }

        public Builder connectedAccountIds(List<String> connectedAccountIds) {
            this.connectedAccountIds = Optional.of(connectedAccountIds);
            return this;
        }

        @JsonSetter(value = "connect_webview_ids", nulls = Nulls.SKIP)
        public Builder connectWebviewIds(Optional<List<String>> connectWebviewIds) {
            this.connectWebviewIds = connectWebviewIds;
            return this;
        }

        public Builder connectWebviewIds(List<String> connectWebviewIds) {
            this.connectWebviewIds = Optional.of(connectWebviewIds);
            return this;
        }

        @JsonSetter(value = "user_identity_ids", nulls = Nulls.SKIP)
        public Builder userIdentityIds(Optional<List<String>> userIdentityIds) {
            this.userIdentityIds = userIdentityIds;
            return this;
        }

        public Builder userIdentityIds(List<String> userIdentityIds) {
            this.userIdentityIds = Optional.of(userIdentityIds);
            return this;
        }

        public ClientSessionsGrantAccessRequest build() {
            return new ClientSessionsGrantAccessRequest(
                    clientSessionId,
                    userIdentifierKey,
                    connectedAccountIds,
                    connectWebviewIds,
                    userIdentityIds,
                    additionalProperties);
        }
    }
}
