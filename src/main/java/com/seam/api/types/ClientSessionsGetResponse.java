package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = ClientSessionsGetResponse.Builder.class)
public final class ClientSessionsGetResponse {
    private final ClientSession clientSession;

    private final boolean ok;

    private ClientSessionsGetResponse(ClientSession clientSession, boolean ok) {
        this.clientSession = clientSession;
        this.ok = ok;
    }

    @JsonProperty("client_session")
    public ClientSession getClientSession() {
        return clientSession;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSessionsGetResponse && equalTo((ClientSessionsGetResponse) other);
    }

    private boolean equalTo(ClientSessionsGetResponse other) {
        return clientSession.equals(other.clientSession) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.clientSession, this.ok);
    }

    @Override
    public String toString() {
        return "ClientSessionsGetResponse{" + "clientSession: " + clientSession + ", ok: " + ok + "}";
    }

    public static ClientSessionStage builder() {
        return new Builder();
    }

    public interface ClientSessionStage {
        OkStage clientSession(ClientSession clientSession);

        Builder from(ClientSessionsGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        ClientSessionsGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ClientSessionStage, OkStage, _FinalStage {
        private ClientSession clientSession;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(ClientSessionsGetResponse other) {
            clientSession(other.getClientSession());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("client_session")
        public OkStage clientSession(ClientSession clientSession) {
            this.clientSession = clientSession;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public ClientSessionsGetResponse build() {
            return new ClientSessionsGetResponse(clientSession, ok);
        }
    }
}
