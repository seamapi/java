package com.seam.api.resources.connectedaccounts.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = ConnectedAccountsDeleteRequest.Builder.class)
public final class ConnectedAccountsDeleteRequest {
    private final String connectedAccountId;

    private ConnectedAccountsDeleteRequest(String connectedAccountId) {
        this.connectedAccountId = connectedAccountId;
    }

    @JsonProperty("connected_account_id")
    public String getConnectedAccountId() {
        return connectedAccountId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsDeleteRequest && equalTo((ConnectedAccountsDeleteRequest) other);
    }

    private boolean equalTo(ConnectedAccountsDeleteRequest other) {
        return connectedAccountId.equals(other.connectedAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.connectedAccountId);
    }

    @Override
    public String toString() {
        return "ConnectedAccountsDeleteRequest{" + "connectedAccountId: " + connectedAccountId + "}";
    }

    public static ConnectedAccountIdStage builder() {
        return new Builder();
    }

    public interface ConnectedAccountIdStage {
        _FinalStage connectedAccountId(String connectedAccountId);

        Builder from(ConnectedAccountsDeleteRequest other);
    }

    public interface _FinalStage {
        ConnectedAccountsDeleteRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConnectedAccountIdStage, _FinalStage {
        private String connectedAccountId;

        private Builder() {}

        @Override
        public Builder from(ConnectedAccountsDeleteRequest other) {
            connectedAccountId(other.getConnectedAccountId());
            return this;
        }

        @Override
        @JsonSetter("connected_account_id")
        public _FinalStage connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        @Override
        public ConnectedAccountsDeleteRequest build() {
            return new ConnectedAccountsDeleteRequest(connectedAccountId);
        }
    }
}
