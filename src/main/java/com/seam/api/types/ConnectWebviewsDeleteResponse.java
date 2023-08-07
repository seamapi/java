package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectWebviewsDeleteResponse.Builder.class)
public final class ConnectWebviewsDeleteResponse {
    private final boolean ok;

    private ConnectWebviewsDeleteResponse(boolean ok) {
        this.ok = ok;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectWebviewsDeleteResponse && equalTo((ConnectWebviewsDeleteResponse) other);
    }

    private boolean equalTo(ConnectWebviewsDeleteResponse other) {
        return ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ok);
    }

    @Override
    public String toString() {
        return "ConnectWebviewsDeleteResponse{" + "ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(ConnectWebviewsDeleteResponse other);
    }

    public interface _FinalStage {
        ConnectWebviewsDeleteResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(ConnectWebviewsDeleteResponse other) {
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
        public ConnectWebviewsDeleteResponse build() {
            return new ConnectWebviewsDeleteResponse(ok);
        }
    }
}
