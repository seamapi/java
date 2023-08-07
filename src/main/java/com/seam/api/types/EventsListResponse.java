package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EventsListResponse.Builder.class)
public final class EventsListResponse {
    private final Optional<List<Event>> events;

    private final Optional<String> message;

    private final boolean ok;

    private EventsListResponse(Optional<List<Event>> events, Optional<String> message, boolean ok) {
        this.events = events;
        this.message = message;
        this.ok = ok;
    }

    @JsonProperty("events")
    public Optional<List<Event>> getEvents() {
        return events;
    }

    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EventsListResponse && equalTo((EventsListResponse) other);
    }

    private boolean equalTo(EventsListResponse other) {
        return events.equals(other.events) && message.equals(other.message) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.events, this.message, this.ok);
    }

    @Override
    public String toString() {
        return "EventsListResponse{" + "events: " + events + ", message: " + message + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(EventsListResponse other);
    }

    public interface _FinalStage {
        EventsListResponse build();

        _FinalStage events(Optional<List<Event>> events);

        _FinalStage events(List<Event> events);

        _FinalStage message(Optional<String> message);

        _FinalStage message(String message);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Optional<String> message = Optional.empty();

        private Optional<List<Event>> events = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(EventsListResponse other) {
            events(other.getEvents());
            message(other.getMessage());
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
        public _FinalStage message(String message) {
            this.message = Optional.of(message);
            return this;
        }

        @Override
        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public _FinalStage message(Optional<String> message) {
            this.message = message;
            return this;
        }

        @Override
        public _FinalStage events(List<Event> events) {
            this.events = Optional.of(events);
            return this;
        }

        @Override
        @JsonSetter(value = "events", nulls = Nulls.SKIP)
        public _FinalStage events(Optional<List<Event>> events) {
            this.events = events;
            return this;
        }

        @Override
        public EventsListResponse build() {
            return new EventsListResponse(events, message, ok);
        }
    }
}
