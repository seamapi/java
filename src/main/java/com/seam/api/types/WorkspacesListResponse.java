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
@JsonDeserialize(builder = WorkspacesListResponse.Builder.class)
public final class WorkspacesListResponse {
    private final List<Workspace> workspaces;

    private final boolean ok;

    private WorkspacesListResponse(List<Workspace> workspaces, boolean ok) {
        this.workspaces = workspaces;
        this.ok = ok;
    }

    @JsonProperty("workspaces")
    public List<Workspace> getWorkspaces() {
        return workspaces;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WorkspacesListResponse && equalTo((WorkspacesListResponse) other);
    }

    private boolean equalTo(WorkspacesListResponse other) {
        return workspaces.equals(other.workspaces) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.workspaces, this.ok);
    }

    @Override
    public String toString() {
        return "WorkspacesListResponse{" + "workspaces: " + workspaces + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(WorkspacesListResponse other);
    }

    public interface _FinalStage {
        WorkspacesListResponse build();

        _FinalStage workspaces(List<Workspace> workspaces);

        _FinalStage addWorkspaces(Workspace workspaces);

        _FinalStage addAllWorkspaces(List<Workspace> workspaces);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<Workspace> workspaces = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(WorkspacesListResponse other) {
            workspaces(other.getWorkspaces());
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
        public _FinalStage addAllWorkspaces(List<Workspace> workspaces) {
            this.workspaces.addAll(workspaces);
            return this;
        }

        @Override
        public _FinalStage addWorkspaces(Workspace workspaces) {
            this.workspaces.add(workspaces);
            return this;
        }

        @Override
        @JsonSetter(value = "workspaces", nulls = Nulls.SKIP)
        public _FinalStage workspaces(List<Workspace> workspaces) {
            this.workspaces.clear();
            this.workspaces.addAll(workspaces);
            return this;
        }

        @Override
        public WorkspacesListResponse build() {
            return new WorkspacesListResponse(workspaces, ok);
        }
    }
}
