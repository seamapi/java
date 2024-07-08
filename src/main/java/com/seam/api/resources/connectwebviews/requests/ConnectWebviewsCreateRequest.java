/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.connectwebviews.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.resources.connectwebviews.types.AcceptedProvider;
import com.seam.api.resources.connectwebviews.types.ConnectWebviewsCreateRequestCustomMetadataValue;
import com.seam.api.types.ProviderCategory;
import com.seam.api.types.SelectionMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectWebviewsCreateRequest.Builder.class)
public final class ConnectWebviewsCreateRequest {
    private final Optional<SelectionMode> deviceSelectionMode;

    private final Optional<String> customRedirectUrl;

    private final Optional<String> customRedirectFailureUrl;

    private final Optional<List<AcceptedProvider>> acceptedProviders;

    private final Optional<ProviderCategory> providerCategory;

    private final Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> customMetadata;

    private final Optional<Boolean> automaticallyManageNewDevices;

    private final Optional<Boolean> waitForDeviceCreation;

    private final Map<String, Object> additionalProperties;

    private ConnectWebviewsCreateRequest(
            Optional<SelectionMode> deviceSelectionMode,
            Optional<String> customRedirectUrl,
            Optional<String> customRedirectFailureUrl,
            Optional<List<AcceptedProvider>> acceptedProviders,
            Optional<ProviderCategory> providerCategory,
            Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> customMetadata,
            Optional<Boolean> automaticallyManageNewDevices,
            Optional<Boolean> waitForDeviceCreation,
            Map<String, Object> additionalProperties) {
        this.deviceSelectionMode = deviceSelectionMode;
        this.customRedirectUrl = customRedirectUrl;
        this.customRedirectFailureUrl = customRedirectFailureUrl;
        this.acceptedProviders = acceptedProviders;
        this.providerCategory = providerCategory;
        this.customMetadata = customMetadata;
        this.automaticallyManageNewDevices = automaticallyManageNewDevices;
        this.waitForDeviceCreation = waitForDeviceCreation;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("device_selection_mode")
    public Optional<SelectionMode> getDeviceSelectionMode() {
        return deviceSelectionMode;
    }

    @JsonProperty("custom_redirect_url")
    public Optional<String> getCustomRedirectUrl() {
        return customRedirectUrl;
    }

    @JsonProperty("custom_redirect_failure_url")
    public Optional<String> getCustomRedirectFailureUrl() {
        return customRedirectFailureUrl;
    }

    @JsonProperty("accepted_providers")
    public Optional<List<AcceptedProvider>> getAcceptedProviders() {
        return acceptedProviders;
    }

    @JsonProperty("provider_category")
    public Optional<ProviderCategory> getProviderCategory() {
        return providerCategory;
    }

    @JsonProperty("custom_metadata")
    public Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> getCustomMetadata() {
        return customMetadata;
    }

    @JsonProperty("automatically_manage_new_devices")
    public Optional<Boolean> getAutomaticallyManageNewDevices() {
        return automaticallyManageNewDevices;
    }

    @JsonProperty("wait_for_device_creation")
    public Optional<Boolean> getWaitForDeviceCreation() {
        return waitForDeviceCreation;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectWebviewsCreateRequest && equalTo((ConnectWebviewsCreateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConnectWebviewsCreateRequest other) {
        return deviceSelectionMode.equals(other.deviceSelectionMode)
                && customRedirectUrl.equals(other.customRedirectUrl)
                && customRedirectFailureUrl.equals(other.customRedirectFailureUrl)
                && acceptedProviders.equals(other.acceptedProviders)
                && providerCategory.equals(other.providerCategory)
                && customMetadata.equals(other.customMetadata)
                && automaticallyManageNewDevices.equals(other.automaticallyManageNewDevices)
                && waitForDeviceCreation.equals(other.waitForDeviceCreation);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.deviceSelectionMode,
                this.customRedirectUrl,
                this.customRedirectFailureUrl,
                this.acceptedProviders,
                this.providerCategory,
                this.customMetadata,
                this.automaticallyManageNewDevices,
                this.waitForDeviceCreation);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<SelectionMode> deviceSelectionMode = Optional.empty();

        private Optional<String> customRedirectUrl = Optional.empty();

        private Optional<String> customRedirectFailureUrl = Optional.empty();

        private Optional<List<AcceptedProvider>> acceptedProviders = Optional.empty();

        private Optional<ProviderCategory> providerCategory = Optional.empty();

        private Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> customMetadata =
                Optional.empty();

        private Optional<Boolean> automaticallyManageNewDevices = Optional.empty();

        private Optional<Boolean> waitForDeviceCreation = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ConnectWebviewsCreateRequest other) {
            deviceSelectionMode(other.getDeviceSelectionMode());
            customRedirectUrl(other.getCustomRedirectUrl());
            customRedirectFailureUrl(other.getCustomRedirectFailureUrl());
            acceptedProviders(other.getAcceptedProviders());
            providerCategory(other.getProviderCategory());
            customMetadata(other.getCustomMetadata());
            automaticallyManageNewDevices(other.getAutomaticallyManageNewDevices());
            waitForDeviceCreation(other.getWaitForDeviceCreation());
            return this;
        }

        @JsonSetter(value = "device_selection_mode", nulls = Nulls.SKIP)
        public Builder deviceSelectionMode(Optional<SelectionMode> deviceSelectionMode) {
            this.deviceSelectionMode = deviceSelectionMode;
            return this;
        }

        public Builder deviceSelectionMode(SelectionMode deviceSelectionMode) {
            this.deviceSelectionMode = Optional.of(deviceSelectionMode);
            return this;
        }

        @JsonSetter(value = "custom_redirect_url", nulls = Nulls.SKIP)
        public Builder customRedirectUrl(Optional<String> customRedirectUrl) {
            this.customRedirectUrl = customRedirectUrl;
            return this;
        }

        public Builder customRedirectUrl(String customRedirectUrl) {
            this.customRedirectUrl = Optional.of(customRedirectUrl);
            return this;
        }

        @JsonSetter(value = "custom_redirect_failure_url", nulls = Nulls.SKIP)
        public Builder customRedirectFailureUrl(Optional<String> customRedirectFailureUrl) {
            this.customRedirectFailureUrl = customRedirectFailureUrl;
            return this;
        }

        public Builder customRedirectFailureUrl(String customRedirectFailureUrl) {
            this.customRedirectFailureUrl = Optional.of(customRedirectFailureUrl);
            return this;
        }

        @JsonSetter(value = "accepted_providers", nulls = Nulls.SKIP)
        public Builder acceptedProviders(Optional<List<AcceptedProvider>> acceptedProviders) {
            this.acceptedProviders = acceptedProviders;
            return this;
        }

        public Builder acceptedProviders(List<AcceptedProvider> acceptedProviders) {
            this.acceptedProviders = Optional.of(acceptedProviders);
            return this;
        }

        @JsonSetter(value = "provider_category", nulls = Nulls.SKIP)
        public Builder providerCategory(Optional<ProviderCategory> providerCategory) {
            this.providerCategory = providerCategory;
            return this;
        }

        public Builder providerCategory(ProviderCategory providerCategory) {
            this.providerCategory = Optional.of(providerCategory);
            return this;
        }

        @JsonSetter(value = "custom_metadata", nulls = Nulls.SKIP)
        public Builder customMetadata(
                Optional<Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>>> customMetadata) {
            this.customMetadata = customMetadata;
            return this;
        }

        public Builder customMetadata(
                Map<String, Optional<ConnectWebviewsCreateRequestCustomMetadataValue>> customMetadata) {
            this.customMetadata = Optional.of(customMetadata);
            return this;
        }

        @JsonSetter(value = "automatically_manage_new_devices", nulls = Nulls.SKIP)
        public Builder automaticallyManageNewDevices(Optional<Boolean> automaticallyManageNewDevices) {
            this.automaticallyManageNewDevices = automaticallyManageNewDevices;
            return this;
        }

        public Builder automaticallyManageNewDevices(Boolean automaticallyManageNewDevices) {
            this.automaticallyManageNewDevices = Optional.of(automaticallyManageNewDevices);
            return this;
        }

        @JsonSetter(value = "wait_for_device_creation", nulls = Nulls.SKIP)
        public Builder waitForDeviceCreation(Optional<Boolean> waitForDeviceCreation) {
            this.waitForDeviceCreation = waitForDeviceCreation;
            return this;
        }

        public Builder waitForDeviceCreation(Boolean waitForDeviceCreation) {
            this.waitForDeviceCreation = Optional.of(waitForDeviceCreation);
            return this;
        }

        public ConnectWebviewsCreateRequest build() {
            return new ConnectWebviewsCreateRequest(
                    deviceSelectionMode,
                    customRedirectUrl,
                    customRedirectFailureUrl,
                    acceptedProviders,
                    providerCategory,
                    customMetadata,
                    automaticallyManageNewDevices,
                    waitForDeviceCreation,
                    additionalProperties);
        }
    }
}
