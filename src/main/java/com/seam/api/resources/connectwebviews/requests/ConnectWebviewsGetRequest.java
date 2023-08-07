package com.seam.api.resources.connectwebviews.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectWebviewsGetRequest.Builder.class)
public final class ConnectWebviewsGetRequest {
    private final String connectWebviewId;

    private ConnectWebviewsGetRequest(String connectWebviewId) {
        this.connectWebviewId = connectWebviewId;
    }

    @JsonProperty("connect_webview_id")
    public String getConnectWebviewId() {
        return connectWebviewId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectWebviewsGetRequest && equalTo((ConnectWebviewsGetRequest) other);
    }

    private boolean equalTo(ConnectWebviewsGetRequest other) {
        return connectWebviewId.equals(other.connectWebviewId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.connectWebviewId);
    }

    @Override
    public String toString() {
        return "ConnectWebviewsGetRequest{" + "connectWebviewId: " + connectWebviewId + "}";
    }

    public static ConnectWebviewIdStage builder() {
        return new Builder();
    }

    public interface ConnectWebviewIdStage {
        _FinalStage connectWebviewId(String connectWebviewId);

        Builder from(ConnectWebviewsGetRequest other);
    }

    public interface _FinalStage {
        ConnectWebviewsGetRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConnectWebviewIdStage, _FinalStage {
        private String connectWebviewId;

        private Builder() {}

        @Override
        public Builder from(ConnectWebviewsGetRequest other) {
            connectWebviewId(other.getConnectWebviewId());
            return this;
        }

        @Override
        @JsonSetter("connect_webview_id")
        public _FinalStage connectWebviewId(String connectWebviewId) {
            this.connectWebviewId = connectWebviewId;
            return this;
        }

        @Override
        public ConnectWebviewsGetRequest build() {
            return new ConnectWebviewsGetRequest(connectWebviewId);
        }
    }
}
