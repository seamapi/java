/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.noisesensors;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.Suppliers;
import com.seam.api.resources.noisesensors.noisethresholds.NoiseThresholdsClient;
import com.seam.api.resources.noisesensors.simulate.SimulateClient;
import java.util.function.Supplier;

public class NoiseSensorsClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<NoiseThresholdsClient> noiseThresholdsClient;

    protected final Supplier<SimulateClient> simulateClient;

    public NoiseSensorsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.noiseThresholdsClient = Suppliers.memoize(() -> new NoiseThresholdsClient(clientOptions));
        this.simulateClient = Suppliers.memoize(() -> new SimulateClient(clientOptions));
    }

    public NoiseThresholdsClient noiseThresholds() {
        return this.noiseThresholdsClient.get();
    }

    public SimulateClient simulate() {
        return this.simulateClient.get();
    }
}
