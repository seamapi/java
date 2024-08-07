/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.connectwebviews.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.ConnectWebview;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectWebviewsGetResponse.Builder.class)
public final class ConnectWebviewsGetResponse {
    private final ConnectWebview connectWebview;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private ConnectWebviewsGetResponse(
            ConnectWebview connectWebview, boolean ok, Map<String, Object> additionalProperties) {
        this.connectWebview = connectWebview;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("connect_webview")
    public ConnectWebview getConnectWebview() {
        return connectWebview;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectWebviewsGetResponse && equalTo((ConnectWebviewsGetResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConnectWebviewsGetResponse other) {
        return connectWebview.equals(other.connectWebview) && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.connectWebview, this.ok);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ConnectWebviewStage builder() {
        return new Builder();
    }

    public interface ConnectWebviewStage {
        OkStage connectWebview(ConnectWebview connectWebview);

        Builder from(ConnectWebviewsGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        ConnectWebviewsGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConnectWebviewStage, OkStage, _FinalStage {
        private ConnectWebview connectWebview;

        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ConnectWebviewsGetResponse other) {
            connectWebview(other.getConnectWebview());
            ok(other.getOk());
            return this;
        }

        @java.lang.Override
        @JsonSetter("connect_webview")
        public OkStage connectWebview(ConnectWebview connectWebview) {
            this.connectWebview = connectWebview;
            return this;
        }

        @java.lang.Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @java.lang.Override
        public ConnectWebviewsGetResponse build() {
            return new ConnectWebviewsGetResponse(connectWebview, ok, additionalProperties);
        }
    }
}
