/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.core;

import java.util.HashMap;
import java.util.Map;

public final class RequestOptions {
    private final String apiKey;

    private final String seamWorkspace;

    private RequestOptions(String apiKey, String seamWorkspace) {
        this.apiKey = apiKey;
        this.seamWorkspace = seamWorkspace;
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        if (this.apiKey != null) {
            headers.put("Authorization", "Bearer " + this.apiKey);
        }
        if (this.seamWorkspace != null) {
            headers.put("Seam-Workspace", this.seamWorkspace);
        }
        return headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String apiKey = null;

        private String seamWorkspace = null;

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder seamWorkspace(String seamWorkspace) {
            this.seamWorkspace = seamWorkspace;
            return this;
        }

        public RequestOptions build() {
            return new RequestOptions(apiKey, seamWorkspace);
        }
    }
}
