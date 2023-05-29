package com.seam.api;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.Suppliers;
import com.seam.api.resources.accesscodes.AccessCodesClient;
import com.seam.api.resources.actionattempts.ActionAttemptsClient;
import java.util.function.Supplier;

public class SeamApiClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<AccessCodesClient> accessCodesClient;

    protected final Supplier<ActionAttemptsClient> actionAttemptsClient;

    public SeamApiClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.accessCodesClient = Suppliers.memoize(() -> new AccessCodesClient(clientOptions));
        this.actionAttemptsClient = Suppliers.memoize(() -> new ActionAttemptsClient(clientOptions));
    }

    public AccessCodesClient accessCodes() {
        return this.accessCodesClient.get();
    }

    public ActionAttemptsClient actionAttempts() {
        return this.actionAttemptsClient.get();
    }

    public static SeamApiClientBuilder builder() {
        return new SeamApiClientBuilder();
    }
}
