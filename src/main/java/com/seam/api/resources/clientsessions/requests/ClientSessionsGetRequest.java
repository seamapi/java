package com.seam.api.resources.clientsessions.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientSessionsGetRequest.Builder.class)
public final class ClientSessionsGetRequest {
    private final Optional<String> clientSessionId;

    private final Optional<String> userIdentifierKey;

    private ClientSessionsGetRequest(Optional<String> clientSessionId, Optional<String> userIdentifierKey) {
        this.clientSessionId = clientSessionId;
        this.userIdentifierKey = userIdentifierKey;
    }

    @JsonProperty("client_session_id")
    public Optional<String> getClientSessionId() {
        return clientSessionId;
    }

    @JsonProperty("user_identifier_key")
    public Optional<String> getUserIdentifierKey() {
        return userIdentifierKey;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSessionsGetRequest && equalTo((ClientSessionsGetRequest) other);
    }

    private boolean equalTo(ClientSessionsGetRequest other) {
        return clientSessionId.equals(other.clientSessionId) && userIdentifierKey.equals(other.userIdentifierKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.clientSessionId, this.userIdentifierKey);
    }

    @Override
    public String toString() {
        return "ClientSessionsGetRequest{" + "clientSessionId: " + clientSessionId + ", userIdentifierKey: "
                + userIdentifierKey + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> clientSessionId = Optional.empty();

        private Optional<String> userIdentifierKey = Optional.empty();

        private Builder() {}

        public Builder from(ClientSessionsGetRequest other) {
            clientSessionId(other.getClientSessionId());
            userIdentifierKey(other.getUserIdentifierKey());
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

        public ClientSessionsGetRequest build() {
            return new ClientSessionsGetRequest(clientSessionId, userIdentifierKey);
        }
    }
}
