package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UnmanagedConvertToManagedResponse.Builder.class)
public final class UnmanagedConvertToManagedResponse {
    private final boolean ok;

    private UnmanagedConvertToManagedResponse(boolean ok) {
        this.ok = ok;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedConvertToManagedResponse && equalTo((UnmanagedConvertToManagedResponse) other);
    }

    private boolean equalTo(UnmanagedConvertToManagedResponse other) {
        return ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ok);
    }

    @Override
    public String toString() {
        return "UnmanagedConvertToManagedResponse{" + "ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(UnmanagedConvertToManagedResponse other);
    }

    public interface _FinalStage {
        UnmanagedConvertToManagedResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(UnmanagedConvertToManagedResponse other) {
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
        public UnmanagedConvertToManagedResponse build() {
            return new UnmanagedConvertToManagedResponse(ok);
        }
    }
}
