/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.connectedaccounts.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.ConnectedAccount;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectedAccountsGetResponse.Builder.class)
public final class ConnectedAccountsGetResponse {
    private final ConnectedAccount connectedAccount;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private ConnectedAccountsGetResponse(
            ConnectedAccount connectedAccount, boolean ok, Map<String, Object> additionalProperties) {
        this.connectedAccount = connectedAccount;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("connected_account")
    public ConnectedAccount getConnectedAccount() {
        return connectedAccount;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsGetResponse && equalTo((ConnectedAccountsGetResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConnectedAccountsGetResponse other) {
        return connectedAccount.equals(other.connectedAccount) && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.connectedAccount, this.ok);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
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

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ConnectedAccountsGetResponse other) {
            connectedAccount(other.getConnectedAccount());
            ok(other.getOk());
            return this;
        }

        @java.lang.Override
        @JsonSetter("connected_account")
        public OkStage connectedAccount(ConnectedAccount connectedAccount) {
            this.connectedAccount = connectedAccount;
            return this;
        }

        @java.lang.Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @java.lang.Override
        public ConnectedAccountsGetResponse build() {
            return new ConnectedAccountsGetResponse(connectedAccount, ok, additionalProperties);
        }
    }
}