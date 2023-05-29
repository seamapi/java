package com.seam.api;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.Suppliers;
import com.seam.api.resources.accesscodes.AccessCodesClient;
import com.seam.api.resources.accesscodes.AccessCodesClientImpl;
import com.seam.api.resources.actionattempts.ActionAttemptsClient;
import com.seam.api.resources.actionattempts.ActionAttemptsClientImpl;
import java.util.function.Supplier;

public final class SeamApiClientImpl implements SeamApiClient {
    private final ClientOptions clientOptions;

    private final Supplier<AccessCodesClient> accessCodesClient;

    private final Supplier<ActionAttemptsClient> actionAttemptsClient;

    public SeamApiClientImpl(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.accessCodesClient = Suppliers.memoize(() -> new AccessCodesClientImpl(clientOptions));
        this.actionAttemptsClient = Suppliers.memoize(() -> new ActionAttemptsClientImpl(clientOptions));
    }

    @Override
    public AccessCodesClient accessCodes() {
        return this.accessCodesClient.get();
    }

    @Override
    public ActionAttemptsClient actionAttempts() {
        return this.actionAttemptsClient.get();
    }
}
