package com.seam.api.noiseThresholds;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsCreateRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsDeleteRequest;
import com.seam.api.resources.noisesensors.noisethresholds.requests.NoiseThresholdsListRequest;
import com.seam.api.types.Device;
import com.seam.api.types.NoiseThreshold;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public final class NoiseThresholdsTest {

    private static Seam seam;

    @BeforeAll
    public static void beforeAll() {
        seam = TestUtils.startFakeSeam(8080);
    }

    // Fake Seam does not serve noise threshold endpoints
    // @Test
    public void test_noiseThresholds() {
        Device device = seam.devices().list().get(0);

        List<NoiseThreshold> noiseThresholds = getMinutDeviceNoiseThresholds(device.getDeviceId());
        Assertions.assertThat(noiseThresholds).hasSize(2);

        NoiseThreshold quietHoursThreshold = noiseThresholds.stream()
                .filter(threshold -> threshold.getName().equals("builtin_quiet_hours"))
                .findFirst()
                .get();

        seam.noiseSensors().noiseThresholds().delete(NoiseThresholdsDeleteRequest.builder()
                .noiseThresholdId(quietHoursThreshold.getNoiseThresholdId())
                .deviceId(device.getDeviceId())
                .build());
        noiseThresholds = getMinutDeviceNoiseThresholds(device.getDeviceId());
        Assertions.assertThat(noiseThresholds).hasSize(1);

        seam.noiseSensors().noiseThresholds().create(NoiseThresholdsCreateRequest.builder()
                .deviceId(device.getDeviceId())
                .startsDailyAt("20:00:00[America/Los_Angeles]")
                .endsDailyAt("08:00:00[America/Los_Angeles]")
                .noiseThresholdDecibels(75.0)
                .build());
        noiseThresholds = getMinutDeviceNoiseThresholds(device.getDeviceId());
        Assertions.assertThat(noiseThresholds).hasSize(2);
    }

    public List<NoiseThreshold> getMinutDeviceNoiseThresholds(String deviceId) {
        return seam.noiseSensors().noiseThresholds().list(NoiseThresholdsListRequest.builder()
                .deviceId(deviceId)
                .build());
    }
}
