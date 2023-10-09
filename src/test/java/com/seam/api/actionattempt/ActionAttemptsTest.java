package com.seam.api.actionattempt;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesDeleteRequest;
import com.seam.api.types.AccessCode;
import com.seam.api.types.ActionAttempt;
import com.seam.api.types.Device;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public final class ActionAttemptsTest {

    private static Seam seam;

    @BeforeAll
    public static void beforeAll() {
        seam = TestUtils.startFakeSeam(8080);
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

        ActionAttempt deleteActionAttempt = seam.accessCodes()
                .delete(AccessCodesDeleteRequest.builder()
                        .accessCodeId(createdAccessCode.getAccessCodeId())
                        .build());
        Assertions.assertThat(deleteActionAttempt).isNotNull();
    }
}
