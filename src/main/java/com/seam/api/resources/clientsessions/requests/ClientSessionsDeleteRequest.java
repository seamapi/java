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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientSessionsDeleteRequest.Builder.class)
public final class ClientSessionsDeleteRequest {
    private final String clientSessionId;

    private final Map<String, Object> additionalProperties;

    private ClientSessionsDeleteRequest(String clientSessionId, Map<String, Object> additionalProperties) {
        this.clientSessionId = clientSessionId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("client_session_id")
    public String getClientSessionId() {
        return clientSessionId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSessionsDeleteRequest && equalTo((ClientSessionsDeleteRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientSessionsDeleteRequest other) {
        return clientSessionId.equals(other.clientSessionId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.clientSessionId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
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

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientSessionsDeleteRequest other) {
            clientSessionId(other.getClientSessionId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("client_session_id")
        public _FinalStage clientSessionId(String clientSessionId) {
            this.clientSessionId = clientSessionId;
            return this;
        }

        @java.lang.Override
        public ClientSessionsDeleteRequest build() {
            return new ClientSessionsDeleteRequest(clientSessionId, additionalProperties);
        }
    }
}
