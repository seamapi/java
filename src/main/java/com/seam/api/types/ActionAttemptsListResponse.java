package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ActionAttemptsListResponse.Builder.class)
public final class ActionAttemptsListResponse {
    private final List<ActionAttempt> actionAttempts;

    private final boolean ok;

    private ActionAttemptsListResponse(List<ActionAttempt> actionAttempts, boolean ok) {
        this.actionAttempts = actionAttempts;
        this.ok = ok;
    }

    @JsonProperty("action_attempts")
    public List<ActionAttempt> getActionAttempts() {
        return actionAttempts;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptsListResponse && equalTo((ActionAttemptsListResponse) other);
    }

    private boolean equalTo(ActionAttemptsListResponse other) {
        return actionAttempts.equals(other.actionAttempts) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.actionAttempts, this.ok);
    }

    @Override
    public String toString() {
        return "ActionAttemptsListResponse{" + "actionAttempts: " + actionAttempts + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(ActionAttemptsListResponse other);
    }

    public interface _FinalStage {
        ActionAttemptsListResponse build();

        _FinalStage actionAttempts(List<ActionAttempt> actionAttempts);

        _FinalStage addActionAttempts(ActionAttempt actionAttempts);

        _FinalStage addAllActionAttempts(List<ActionAttempt> actionAttempts);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<ActionAttempt> actionAttempts = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ActionAttemptsListResponse other) {
            actionAttempts(other.getActionAttempts());
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
        public _FinalStage addAllActionAttempts(List<ActionAttempt> actionAttempts) {
            this.actionAttempts.addAll(actionAttempts);
            return this;
        }

        @Override
        public _FinalStage addActionAttempts(ActionAttempt actionAttempts) {
            this.actionAttempts.add(actionAttempts);
            return this;
        }

        @Override
        @JsonSetter(value = "action_attempts", nulls = Nulls.SKIP)
        public _FinalStage actionAttempts(List<ActionAttempt> actionAttempts) {
            this.actionAttempts.clear();
            this.actionAttempts.addAll(actionAttempts);
            return this;
        }

        @Override
        public ActionAttemptsListResponse build() {
            return new ActionAttemptsListResponse(actionAttempts, ok);
        }
    }
}