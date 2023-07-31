package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = ConnectWebviewsListResponse.Builder.class)
public final class ConnectWebviewsListResponse {
    private final List<ConnectWebview> connectWebviews;

    private final boolean ok;

    private ConnectWebviewsListResponse(List<ConnectWebview> connectWebviews, boolean ok) {
        this.connectWebviews = connectWebviews;
        this.ok = ok;
    }

    @JsonProperty("connect_webviews")
    public List<ConnectWebview> getConnectWebviews() {
        return connectWebviews;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectWebviewsListResponse && equalTo((ConnectWebviewsListResponse) other);
    }

    private boolean equalTo(ConnectWebviewsListResponse other) {
        return connectWebviews.equals(other.connectWebviews) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.connectWebviews, this.ok);
    }

    @Override
    public String toString() {
        return "ConnectWebviewsListResponse{" + "connectWebviews: " + connectWebviews + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(ConnectWebviewsListResponse other);
    }

    public interface _FinalStage {
        ConnectWebviewsListResponse build();

        _FinalStage connectWebviews(List<ConnectWebview> connectWebviews);

        _FinalStage addConnectWebviews(ConnectWebview connectWebviews);

        _FinalStage addAllConnectWebviews(List<ConnectWebview> connectWebviews);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<ConnectWebview> connectWebviews = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ConnectWebviewsListResponse other) {
            connectWebviews(other.getConnectWebviews());
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
        public _FinalStage addAllConnectWebviews(List<ConnectWebview> connectWebviews) {
            this.connectWebviews.addAll(connectWebviews);
            return this;
        }

        @Override
        public _FinalStage addConnectWebviews(ConnectWebview connectWebviews) {
            this.connectWebviews.add(connectWebviews);
            return this;
        }

        @Override
        @JsonSetter(value = "connect_webviews", nulls = Nulls.SKIP)
        public _FinalStage connectWebviews(List<ConnectWebview> connectWebviews) {
            this.connectWebviews.clear();
            this.connectWebviews.addAll(connectWebviews);
            return this;
        }

        @Override
        public ConnectWebviewsListResponse build() {
            return new ConnectWebviewsListResponse(connectWebviews, ok);
        }
    }
}
