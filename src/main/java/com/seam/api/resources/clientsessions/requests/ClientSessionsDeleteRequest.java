package com.seam.api.resources.clientsessions.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientSessionsDeleteRequest.Builder.class)
public final class ClientSessionsDeleteRequest {
    private final String clientSessionId;

    private ClientSessionsDeleteRequest(String clientSessionId) {
        this.clientSessionId = clientSessionId;
    }

    @JsonProperty("client_session_id")
    public String getClientSessionId() {
        return clientSessionId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSessionsDeleteRequest && equalTo((ClientSessionsDeleteRequest) other);
    }

    private boolean equalTo(ClientSessionsDeleteRequest other) {
        return clientSessionId.equals(other.clientSessionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.clientSessionId);
    }

    @Override
    public String toString() {
        return "ClientSessionsDeleteRequest{" + "clientSessionId: " + clientSessionId + "}";
    }

    public static ClientSessionIdStage builder() {
        return new Builder();
    }

    public interface ClientSessionIdStage {
        _FinalStage clientSessionId(String clientSessionId);

        Builder from(ClientSessionsDeleteRequest other);
    }

    public interface _FinalStage {
        ClientSessionsDeleteRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ClientSessionIdStage, _FinalStage {
        private String clientSessionId;

        private Builder() {}

        @Override
        public Builder from(ClientSessionsDeleteRequest other) {
            clientSessionId(other.getClientSessionId());
            return this;
        }

        @Override
        @JsonSetter("client_session_id")
        public _FinalStage clientSessionId(String clientSessionId) {
            this.clientSessionId = clientSessionId;
            return this;
        }

        @Override
        public ClientSessionsDeleteRequest build() {
            return new ClientSessionsDeleteRequest(clientSessionId);
        }
    }
}
