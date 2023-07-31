package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = ConnectedAccountsGetRequestConnectedAccountsGetRequest.Builder.class)
public final class ConnectedAccountsGetRequestConnectedAccountsGetRequest {
    private final String email;

    private ConnectedAccountsGetRequestConnectedAccountsGetRequest(String email) {
        this.email = email;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsGetRequestConnectedAccountsGetRequest
                && equalTo((ConnectedAccountsGetRequestConnectedAccountsGetRequest) other);
    }

    private boolean equalTo(ConnectedAccountsGetRequestConnectedAccountsGetRequest other) {
        return email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email);
    }

    @Override
    public String toString() {
        return "ConnectedAccountsGetRequestConnectedAccountsGetRequest{" + "email: " + email + "}";
    }

    public static EmailStage builder() {
        return new Builder();
    }

    public interface EmailStage {
        _FinalStage email(String email);

        Builder from(ConnectedAccountsGetRequestConnectedAccountsGetRequest other);
    }

    public interface _FinalStage {
        ConnectedAccountsGetRequestConnectedAccountsGetRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EmailStage, _FinalStage {
        private String email;

        private Builder() {}

        @Override
        public Builder from(ConnectedAccountsGetRequestConnectedAccountsGetRequest other) {
            email(other.getEmail());
            return this;
        }

        @Override
        @JsonSetter("email")
        public _FinalStage email(String email) {
            this.email = email;
            return this;
        }

        @Override
        public ConnectedAccountsGetRequestConnectedAccountsGetRequest build() {
            return new ConnectedAccountsGetRequestConnectedAccountsGetRequest(email);
        }
    }
}
