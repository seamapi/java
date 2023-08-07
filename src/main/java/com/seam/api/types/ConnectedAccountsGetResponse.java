package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectedAccountsGetResponse.Builder.class)
public final class ConnectedAccountsGetResponse {
    private final ConnectedAccount connectedAccount;

    private final boolean ok;

    private ConnectedAccountsGetResponse(ConnectedAccount connectedAccount, boolean ok) {
        this.connectedAccount = connectedAccount;
        this.ok = ok;
    }

    @JsonProperty("connected_account")
    public ConnectedAccount getConnectedAccount() {
        return connectedAccount;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsGetResponse && equalTo((ConnectedAccountsGetResponse) other);
    }

    private boolean equalTo(ConnectedAccountsGetResponse other) {
        return connectedAccount.equals(other.connectedAccount) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.connectedAccount, this.ok);
    }

    @Override
    public String toString() {
        return "ConnectedAccountsGetResponse{" + "connectedAccount: " + connectedAccount + ", ok: " + ok + "}";
    }

    public static ConnectedAccountStage builder() {
        return new Builder();
    }

    public interface ConnectedAccountStage {
        OkStage connectedAccount(ConnectedAccount connectedAccount);

        Builder from(ConnectedAccountsGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        ConnectedAccountsGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConnectedAccountStage, OkStage, _FinalStage {
        private ConnectedAccount connectedAccount;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(ConnectedAccountsGetResponse other) {
            connectedAccount(other.getConnectedAccount());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("connected_account")
        public OkStage connectedAccount(ConnectedAccount connectedAccount) {
            this.connectedAccount = connectedAccount;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public ConnectedAccountsGetResponse build() {
            return new ConnectedAccountsGetResponse(connectedAccount, ok);
        }
    }
}