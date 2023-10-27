package com.seam.api.devices;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.resources.devices.requests.DevicesGetRequest;
import com.seam.api.resources.devices.requests.DevicesListRequest;
import com.seam.api.resources.locks.requests.LocksGetRequest;
import com.seam.api.types.Device;
import com.seam.api.types.DeviceType;
import com.seam.api.types.Manufacturer;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DevicesTest {

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
    public void test_devices() {
        List<Device> devices = seam.devices().list();
        Assertions.assertThat(devices).hasSizeGreaterThan(0);

        devices = seam.devices()
                .list(DevicesListRequest.builder()
                        .connectedAccountId(devices.get(0).getConnectedAccountId())
                        .build());
        Assertions.assertThat(devices).hasSizeGreaterThan(0);

        devices = seam.devices()
                .list(DevicesListRequest.builder()
                        .connectedAccountIds(List.of(devices.get(0).getConnectedAccountId()))
                        .build());
        Assertions.assertThat(devices).hasSizeGreaterThan(0);

        devices = seam.devices()
                .list(DevicesListRequest.builder()
                        .deviceType(DeviceType.AUGUST_LOCK)
                        .build());
        Assertions.assertThat(devices).hasSizeGreaterThan(0);
        devices = seam.devices()
                .list(DevicesListRequest.builder()
                        .deviceTypes(List.of(DeviceType.AUGUST_LOCK))
                        .build());
        Assertions.assertThat(devices).hasSizeGreaterThan(0);

        devices = seam.devices()
                .list(DevicesListRequest.builder()
                        .manufacturer(Manufacturer.AUGUST)
                        .build());
        Assertions.assertThat(devices).hasSizeGreaterThan(0);

        List<String> deviceIds = List.of(devices.get(0).getDeviceId());
        devices = seam.devices()
                .list(DevicesListRequest.builder().deviceIds(deviceIds).build());
        Assertions.assertThat(devices).hasSizeGreaterThan(0);

        Device someDevice = seam.devices().list().get(0);
        Assertions.assertThat(someDevice.getProperties().getAugustMetadata()).isEmpty();
        Device deviceWithName = seam.devices()
                .get(DevicesGetRequest.builder()
                        .name(someDevice.getProperties().getName())
                        .deviceId(someDevice.getDeviceId())
                        .build());
        Assertions.assertThat(deviceWithName.getProperties().getName())
                .isEqualTo(someDevice.getProperties().getName());

        List<Device> locks = seam.locks().list();
        Assertions.assertThat(locks).hasSizeGreaterThan(0);

        Device someLock = seam.locks()
                .get(LocksGetRequest.builder()
                        .deviceId(someDevice.getDeviceId())
                        .build());
        Assertions.assertThat(someLock.getDeviceId()).isEqualTo(someDevice.getDeviceId());
    }
}
