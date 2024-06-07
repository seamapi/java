package com.seam.api.actionattempt;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.TestUtils.FakeSeamStartedResponse;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesDeleteRequest;
import com.seam.api.resources.accesscodes.types.AccessCodesDeleteResponse;
import com.seam.api.types.AccessCode;
import com.seam.api.types.Device;

public final class ActionAttemptsTest {

    private static Seam seam;
    private static Process p;

    @BeforeAll
    public static void beforeAll() {
        FakeSeamStartedResponse response = TestUtils.startFakeSeam();
        seam = response.seam;
        p = response.process;
    }

    @AfterAll
    public static void afterAll() throws InterruptedException {
        p.destroyForcibly().waitFor();
    }

    @Test
    public void test_access_attempts() {
        Device someDevice = seam.devices().list().get(0);

        AccessCode createdAccessCode = seam.accessCodes()
                .create(AccessCodesCreateRequest.builder()
                        .deviceId(someDevice.getDeviceId())
                        .name("Test code")
                        .code("4444")
                        .build());

        AccessCodesDeleteResponse deleteActionAttempt = seam.accessCodes()
                .delete(AccessCodesDeleteRequest.builder()
                        .accessCodeId(createdAccessCode.getAccessCodeId())
                        .build());
        Assertions.assertThat(deleteActionAttempt).isNotNull();
    }
}
