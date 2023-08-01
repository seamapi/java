package com.seam.api;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.Suppliers;
import com.seam.api.resources.accesscodes.AccessCodesClient;
import com.seam.api.resources.actionattempts.ActionAttemptsClient;
import com.seam.api.resources.clientsessions.ClientSessionsClient;
import com.seam.api.resources.connectedaccounts.ConnectedAccountsClient;
import com.seam.api.resources.connectwebviews.ConnectWebviewsClient;
import com.seam.api.resources.devices.DevicesClient;
import com.seam.api.resources.events.EventsClient;
import com.seam.api.resources.health.HealthClient;
import com.seam.api.resources.locks.LocksClient;
import com.seam.api.resources.noisesensors.NoiseSensorsClient;
import com.seam.api.resources.thermostats.ThermostatsClient;
import com.seam.api.resources.webhooks.WebhooksClient;
import com.seam.api.resources.workspaces.WorkspacesClient;
import java.util.function.Supplier;

public class SeamApiClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<AccessCodesClient> accessCodesClient;

    protected final Supplier<ActionAttemptsClient> actionAttemptsClient;

    protected final Supplier<ConnectedAccountsClient> connectedAccountsClient;

    protected final Supplier<DevicesClient> devicesClient;

    protected final Supplier<ClientSessionsClient> clientSessionsClient;

    protected final Supplier<EventsClient> eventsClient;

    protected final Supplier<HealthClient> healthClient;

    protected final Supplier<ConnectWebviewsClient> connectWebviewsClient;

    protected final Supplier<LocksClient> locksClient;

    protected final Supplier<ThermostatsClient> thermostatsClient;

    protected final Supplier<WebhooksClient> webhooksClient;

    protected final Supplier<WorkspacesClient> workspacesClient;

    protected final Supplier<NoiseSensorsClient> noiseSensorsClient;

    public SeamApiClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.accessCodesClient = Suppliers.memoize(() -> new AccessCodesClient(clientOptions));
        this.actionAttemptsClient = Suppliers.memoize(() -> new ActionAttemptsClient(clientOptions));
        this.connectedAccountsClient = Suppliers.memoize(() -> new ConnectedAccountsClient(clientOptions));
        this.devicesClient = Suppliers.memoize(() -> new DevicesClient(clientOptions));
        this.clientSessionsClient = Suppliers.memoize(() -> new ClientSessionsClient(clientOptions));
        this.eventsClient = Suppliers.memoize(() -> new EventsClient(clientOptions));
        this.healthClient = Suppliers.memoize(() -> new HealthClient(clientOptions));
        this.connectWebviewsClient = Suppliers.memoize(() -> new ConnectWebviewsClient(clientOptions));
        this.locksClient = Suppliers.memoize(() -> new LocksClient(clientOptions));
        this.thermostatsClient = Suppliers.memoize(() -> new ThermostatsClient(clientOptions));
        this.webhooksClient = Suppliers.memoize(() -> new WebhooksClient(clientOptions));
        this.workspacesClient = Suppliers.memoize(() -> new WorkspacesClient(clientOptions));
        this.noiseSensorsClient = Suppliers.memoize(() -> new NoiseSensorsClient(clientOptions));
    }

    public AccessCodesClient accessCodes() {
        return this.accessCodesClient.get();
    }

    public ActionAttemptsClient actionAttempts() {
        return this.actionAttemptsClient.get();
    }

    public ConnectedAccountsClient connectedAccounts() {
        return this.connectedAccountsClient.get();
    }

    public DevicesClient devices() {
        return this.devicesClient.get();
    }

    public ClientSessionsClient clientSessions() {
        return this.clientSessionsClient.get();
    }

    public EventsClient events() {
        return this.eventsClient.get();
    }

    public HealthClient health() {
        return this.healthClient.get();
    }

    public ConnectWebviewsClient connectWebviews() {
        return this.connectWebviewsClient.get();
    }

    public LocksClient locks() {
        return this.locksClient.get();
    }

    public ThermostatsClient thermostats() {
        return this.thermostatsClient.get();
    }

    public WebhooksClient webhooks() {
        return this.webhooksClient.get();
    }

    public WorkspacesClient workspaces() {
        return this.workspacesClient.get();
    }

    public NoiseSensorsClient noiseSensors() {
        return this.noiseSensorsClient.get();
    }

    public static SeamApiClientBuilder builder() {
        return new SeamApiClientBuilder();
    }
}
