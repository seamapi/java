package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = WebhooksCreateResponse.Builder.class)
public final class WebhooksCreateResponse {
    private final Webhook webhook;

    private final boolean ok;

    private WebhooksCreateResponse(Webhook webhook, boolean ok) {
        this.webhook = webhook;
        this.ok = ok;
    }

    @JsonProperty("webhook")
    public Webhook getWebhook() {
        return webhook;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhooksCreateResponse && equalTo((WebhooksCreateResponse) other);
    }

    private boolean equalTo(WebhooksCreateResponse other) {
        return webhook.equals(other.webhook) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.webhook, this.ok);
    }

    @Override
    public String toString() {
        return "WebhooksCreateResponse{" + "webhook: " + webhook + ", ok: " + ok + "}";
    }

    public static WebhookStage builder() {
        return new Builder();
    }

    public interface WebhookStage {
        OkStage webhook(Webhook webhook);

        Builder from(WebhooksCreateResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        WebhooksCreateResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WebhookStage, OkStage, _FinalStage {
        private Webhook webhook;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(WebhooksCreateResponse other) {
            webhook(other.getWebhook());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("webhook")
        public OkStage webhook(Webhook webhook) {
            this.webhook = webhook;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public WebhooksCreateResponse build() {
            return new WebhooksCreateResponse(webhook, ok);
        }
    }
}