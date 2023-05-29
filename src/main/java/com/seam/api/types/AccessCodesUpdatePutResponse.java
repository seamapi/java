package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = AccessCodesUpdatePutResponse.Builder.class)
public final class AccessCodesUpdatePutResponse {
    private final AccessCodesUpdatePutResponseActionAttempt actionAttempt;

    private final boolean ok;

    private int _cachedHashCode;

    AccessCodesUpdatePutResponse(AccessCodesUpdatePutResponseActionAttempt actionAttempt, boolean ok) {
        this.actionAttempt = actionAttempt;
        this.ok = ok;
    }

    @JsonProperty("action_attempt")
    public AccessCodesUpdatePutResponseActionAttempt getActionAttempt() {
        return actionAttempt;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesUpdatePutResponse && equalTo((AccessCodesUpdatePutResponse) other);
    }

    private boolean equalTo(AccessCodesUpdatePutResponse other) {
        return actionAttempt.equals(other.actionAttempt) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        if (_cachedHashCode == 0) {
            _cachedHashCode = Objects.hash(this.actionAttempt, this.ok);
        }
        return _cachedHashCode;
    }

    @Override
    public String toString() {
        return "AccessCodesUpdatePutResponse{" + "actionAttempt: " + actionAttempt + ", ok: " + ok + "}";
    }

    public static ActionAttemptStage builder() {
        return new Builder();
    }

    public interface ActionAttemptStage {
        OkStage actionAttempt(AccessCodesUpdatePutResponseActionAttempt actionAttempt);

        Builder from(AccessCodesUpdatePutResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        AccessCodesUpdatePutResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptStage, OkStage, _FinalStage {
        private AccessCodesUpdatePutResponseActionAttempt actionAttempt;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(AccessCodesUpdatePutResponse other) {
            actionAttempt(other.getActionAttempt());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("action_attempt")
        public OkStage actionAttempt(AccessCodesUpdatePutResponseActionAttempt actionAttempt) {
            this.actionAttempt = actionAttempt;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public AccessCodesUpdatePutResponse build() {
            return new AccessCodesUpdatePutResponse(actionAttempt, ok);
        }
    }
}
