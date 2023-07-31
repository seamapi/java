package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = EventsGetResponse.Builder.class)
public final class EventsGetResponse {
    private final Optional<Event> event;

    private final Optional<String> message;

    private final boolean ok;

    private EventsGetResponse(Optional<Event> event, Optional<String> message, boolean ok) {
        this.event = event;
        this.message = message;
        this.ok = ok;
    }

    @JsonProperty("event")
    public Optional<Event> getEvent() {
        return event;
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
        return other instanceof EventsGetResponse && equalTo((EventsGetResponse) other);
    }

    private boolean equalTo(EventsGetResponse other) {
        return event.equals(other.event) && message.equals(other.message) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.event, this.message, this.ok);
    }

    @Override
    public String toString() {
        return "EventsGetResponse{" + "event: " + event + ", message: " + message + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(EventsGetResponse other);
    }

    public interface _FinalStage {
        EventsGetResponse build();

        _FinalStage event(Optional<Event> event);

        _FinalStage event(Event event);

        _FinalStage message(Optional<String> message);

        _FinalStage message(String message);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Optional<String> message = Optional.empty();

        private Optional<Event> event = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(EventsGetResponse other) {
            event(other.getEvent());
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
        public _FinalStage event(Event event) {
            this.event = Optional.of(event);
            return this;
        }

        @Override
        @JsonSetter(value = "event", nulls = Nulls.SKIP)
        public _FinalStage event(Optional<Event> event) {
            this.event = event;
            return this;
        }

        @Override
        public EventsGetResponse build() {
            return new EventsGetResponse(event, message, ok);
        }
    }
}
