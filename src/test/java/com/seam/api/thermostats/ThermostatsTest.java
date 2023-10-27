package com.seam.api.thermostats;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.resources.thermostats.requests.ThermostatsGetRequest;
import com.seam.api.types.Device;
import com.seam.api.types.DeviceType;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ThermostatsTest {

    private static Seam seam;
    private static Process p;

    @BeforeAll
    public static void beforeAll() {
        var response = TestUtils.startFakeSeam();
        seam = response.seam;
        p = response.process;
    }

    @AfterAll
    public static void afterAll() throws InterruptedException {
        p.destroyForcibly().waitFor();
    }

    @Test
    public void test_thermostats() {
        List<Device> thermostats = seam.thermostats().list();
        Assertions.assertThat(thermostats).hasSize(1);

        Device thermostat = thermostats.get(0);
        Assertions.assertThat(thermostat.getDeviceType()).isEqualTo(DeviceType.ECOBEE_THERMOSTAT);

        thermostat = seam.thermostats()
                .get(ThermostatsGetRequest.builder()
                        .deviceId(thermostat.getDeviceId())
                        .build());
        Assertions.assertThat(thermostat.getDeviceType()).isEqualTo(DeviceType.ECOBEE_THERMOSTAT);

        // Update endpoint not served by fake seam
        // seam.thermostats().update(ThermostatsUpdateRequest.builder()
        //         .deviceId(thermostat.getDeviceId())
        //         .defaultClimateSetting(ThermostatsUpdateRequestDefaultClimateSetting.builder()
        //                 .hvacModeSetting(HvacModeSetting.COOL)
        //                 .coolingSetPointCelsius(20.0)
        //                 .manualOverrideAllowed(true)
        //                 .build())
        //         .build());
        // thermostat = seam.thermostats().get(ThermostatsGetRequest.builder()
        //         .deviceId(thermostat.getDeviceId())
        //         .build());
        // Assertions.assertThat(thermostat.getDeviceType()).isEqualTo(DeviceType.ECOBEE_THERMOSTAT);

        // Heat endpoint not served by fake seam
        // seam.thermostats().heat(ThermostatsHeatRequest.builder()
        //         .deviceId(thermostat.getDeviceId())
        //         .heatingSetPointCelsius(18.0)
        //         .build());
        // thermostat = seam.thermostats().get(ThermostatsGetRequest.builder()
        //         .deviceId(thermostat.getDeviceId())
        //         .build());
        // Assertions.assertThat(thermostat.getProperties().getCurrentClimateSetting().get().getHvacModeSetting())
        //         .hasValue("heat_cool");
    }
}
