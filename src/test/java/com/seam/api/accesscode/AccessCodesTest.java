package com.seam.api.accesscode;

import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.TestUtils.FakeSeamStartedResponse;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateMultipleRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesDeleteRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesGetRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesListRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesUpdateRequest;
import com.seam.api.types.AccessCode;
import com.seam.api.types.AccessCodeStatus;
import com.seam.api.types.ActionAttempt;
import com.seam.api.types.Device;

public final class AccessCodesTest {

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
    public void test_access_codes() {
        List<Device> allDevices = seam.devices().list();
        Device someDevice = allDevices.get(0);

        List<AccessCode> initialAccessCodes = seam.accessCodes()
                .list(AccessCodesListRequest.builder()
                        .deviceId(someDevice.getDeviceId())
                        .build());

        AccessCode createdAccessCode = seam.accessCodes()
                .create(AccessCodesCreateRequest.builder()
                        .deviceId(someDevice.getDeviceId())
                        .name("Test code")
                        .code("4444")
                        .build());
        Assertions.assertThat(createdAccessCode.getName()).hasValue("Test code");
        Assertions.assertThat(createdAccessCode.getStatus()).isEqualTo(AccessCodeStatus.SETTING);

        seam.accessCodes()
                .create(AccessCodesCreateRequest.builder()
                        .deviceId(someDevice.getDeviceId())
                        .name("Test code 2")
                        .code("5555")
                        .build());

        List<AccessCode> accessCodes = seam.accessCodes()
                .list(AccessCodesListRequest.builder()
                        .deviceId(someDevice.getDeviceId())
                        .build());
        Assertions.assertThat(accessCodes).hasSize(2 + initialAccessCodes.size());

        accessCodes = seam.accessCodes()
                .list(AccessCodesListRequest.builder()
                        .deviceId(someDevice.getDeviceId())
                        .accessCodeIds(List.of(createdAccessCode.getAccessCodeId()))
                        .build());
        Assertions.assertThat(accessCodes).hasSizeGreaterThan(0);

        AccessCode accessCode = seam.accessCodes()
                .get(AccessCodesGetRequest.builder()
                        .accessCodeId(createdAccessCode.getAccessCodeId())
                        .build());
        Assertions.assertThat(accessCode.getCode()).hasValue("4444");

        // Fake seam does not dedupe access codes
        // assertThatThrownBy(() -> {
        //     seam.accessCodes().create(AccessCodesCreateRequest.builder()
        //             .deviceId(someDevice.getDeviceId())
        //             .name("Duplicate Access Code")
        //             .code("4444")
        //             .build());
        // }).hasCauseInstanceOf(ApiError.class);

        seam.accessCodes()
                .update(AccessCodesUpdateRequest.builder()
                        .accessCodeId(createdAccessCode.getAccessCodeId())
                        .name("Updated Name")
                        .build());
        accessCode = seam.accessCodes()
                .get(AccessCodesGetRequest.builder()
                        .accessCodeId(createdAccessCode.getAccessCodeId())
                        .build());
        Assertions.assertThat(accessCode.getName()).hasValue("Updated Name");

        // fake seam does not like access code update
        // seam.accessCodes()
        //         .update(AccessCodesUpdateRequest.builder()
        //                 .accessCodeId(createdAccessCode.getAccessCodeId())
        //                 .type(AccessCodesUpdateRequestType.TIME_BOUND)
        //                 .startsAt("3001-01-01")
        //                 .endsAt("3001-01-03")
        //                 .build());
        // accessCode = seam.accessCodes()
        //         .get(AccessCodesGetRequest.builder()
        //                 .accessCodeId(createdAccessCode.getAccessCodeId())
        //                 .build());
        // Assertions.assertThat(accessCode.getType()).isEqualTo(AccessCodeType.TIME_BOUND);

        ActionAttempt deleteActionAttempt = seam.accessCodes()
                .delete(AccessCodesDeleteRequest.builder()
                        .accessCodeId(createdAccessCode.getAccessCodeId())
                        .build());
                        System.out.println(deleteActionAttempt);
        Assertions.assertThat(deleteActionAttempt.getSuccess()).isNotEmpty();

        accessCodes = seam.accessCodes()
                .createMultiple(AccessCodesCreateMultipleRequest.builder()
                        .addAllDeviceIds(accessCodes.stream()
                                .map(AccessCode::getDeviceId)
                                .collect(Collectors.toList()))
                        .build());
        Assertions.assertThat(accessCodes).hasSizeGreaterThan(0);
        Assertions.assertThat(
                        accessCodes.stream().map(AccessCode::getCommonCodeKey).collect(Collectors.toSet()))
                .hasSize(1);
    }
}
