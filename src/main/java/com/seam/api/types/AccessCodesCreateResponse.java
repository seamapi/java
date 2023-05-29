package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = AccessCodesCreateResponse.Builder.class)
public final class AccessCodesCreateResponse {
    private final AccessCodesCreateResponseActionAttempt actionAttempt;

    private final AccessCodesCreateResponseAccessCode accessCode;

    private final boolean ok;

    private int _cachedHashCode;

    AccessCodesCreateResponse(
            AccessCodesCreateResponseActionAttempt actionAttempt,
            AccessCodesCreateResponseAccessCode accessCode,
            boolean ok) {
        this.actionAttempt = actionAttempt;
        this.accessCode = accessCode;
        this.ok = ok;
    }

    @JsonProperty("action_attempt")
    public AccessCodesCreateResponseActionAttempt getActionAttempt() {
        return actionAttempt;
    }

    @JsonProperty("access_code")
    public AccessCodesCreateResponseAccessCode getAccessCode() {
        return accessCode;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesCreateResponse && equalTo((AccessCodesCreateResponse) other);
    }

    private boolean equalTo(AccessCodesCreateResponse other) {
        return actionAttempt.equals(other.actionAttempt) && accessCode.equals(other.accessCode) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        if (_cachedHashCode == 0) {
            _cachedHashCode = Objects.hash(this.actionAttempt, this.accessCode, this.ok);
        }
        return _cachedHashCode;
    }

    @Override
    public String toString() {
        return "AccessCodesCreateResponse{" + "actionAttempt: " + actionAttempt + ", accessCode: " + accessCode
                + ", ok: " + ok + "}";
    }

    public static ActionAttemptStage builder() {
        return new Builder();
    }

    public interface ActionAttemptStage {
        AccessCodeStage actionAttempt(AccessCodesCreateResponseActionAttempt actionAttempt);

        Builder from(AccessCodesCreateResponse other);
    }

    public interface AccessCodeStage {
        OkStage accessCode(AccessCodesCreateResponseAccessCode accessCode);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        AccessCodesCreateResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptStage, AccessCodeStage, OkStage, _FinalStage {
        private AccessCodesCreateResponseActionAttempt actionAttempt;

        private AccessCodesCreateResponseAccessCode accessCode;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(AccessCodesCreateResponse other) {
            actionAttempt(other.getActionAttempt());
            accessCode(other.getAccessCode());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("action_attempt")
        public AccessCodeStage actionAttempt(AccessCodesCreateResponseActionAttempt actionAttempt) {
            this.actionAttempt = actionAttempt;
            return this;
        }

        @Override
        @JsonSetter("access_code")
        public OkStage accessCode(AccessCodesCreateResponseAccessCode accessCode) {
            this.accessCode = accessCode;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public AccessCodesCreateResponse build() {
            return new AccessCodesCreateResponse(actionAttempt, accessCode, ok);
        }
    }
}
