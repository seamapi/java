package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = ClientSessionsListResponse.Builder.class)
public final class ClientSessionsListResponse {
    private final List<ClientSession> clientSessions;

    private final boolean ok;

    private ClientSessionsListResponse(List<ClientSession> clientSessions, boolean ok) {
        this.clientSessions = clientSessions;
        this.ok = ok;
    }

    @JsonProperty("client_sessions")
    public List<ClientSession> getClientSessions() {
        return clientSessions;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSessionsListResponse && equalTo((ClientSessionsListResponse) other);
    }

    private boolean equalTo(ClientSessionsListResponse other) {
        return clientSessions.equals(other.clientSessions) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.clientSessions, this.ok);
    }

    @Override
    public String toString() {
        return "ClientSessionsListResponse{" + "clientSessions: " + clientSessions + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(ClientSessionsListResponse other);
    }

    public interface _FinalStage {
        ClientSessionsListResponse build();

        _FinalStage clientSessions(List<ClientSession> clientSessions);

        _FinalStage addClientSessions(ClientSession clientSessions);

        _FinalStage addAllClientSessions(List<ClientSession> clientSessions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<ClientSession> clientSessions = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ClientSessionsListResponse other) {
            clientSessions(other.getClientSessions());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public _FinalStage addAllClientSessions(List<ClientSession> clientSessions) {
            this.clientSessions.addAll(clientSessions);
            return this;
        }

        @Override
        public _FinalStage addClientSessions(ClientSession clientSessions) {
            this.clientSessions.add(clientSessions);
            return this;
        }

        @Override
        @JsonSetter(value = "client_sessions", nulls = Nulls.SKIP)
        public _FinalStage clientSessions(List<ClientSession> clientSessions) {
            this.clientSessions.clear();
            this.clientSessions.addAll(clientSessions);
            return this;
        }

        @Override
        public ClientSessionsListResponse build() {
            return new ClientSessionsListResponse(clientSessions, ok);
        }
    }
}
