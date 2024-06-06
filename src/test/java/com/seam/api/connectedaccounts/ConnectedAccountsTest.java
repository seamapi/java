package com.seam.api.connectedaccounts;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.TestUtils.FakeSeamStartedResponse;
import com.seam.api.types.ConnectedAccount;
import com.seam.api.types.ConnectedAccountsGetRequest;

public final class ConnectedAccountsTest {

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

    private static final String EMAIL = "user-4@example.com";

    @Test
    public void test_connected_accounts() {
        List<ConnectedAccount> connectedAccounts = seam.connectedAccounts().list();
        Assertions.assertThat(connectedAccounts).hasSizeGreaterThanOrEqualTo(2);

        String connectedAccountId =
                connectedAccounts.get(0).getConnectedAccountId().get();

        ConnectedAccount connectedAccount =
                seam.connectedAccounts().get(ConnectedAccountsGetRequest.id(connectedAccountId));
        Assertions.assertThat(connectedAccount.getConnectedAccountId()).hasValue(connectedAccountId);

        // Fake Seam does not like email creation
        // ConnectedAccount emailAccount = seam.connectedAccounts().get(
        //         ConnectedAccountsGetRequest.email(EMAIL));
        // Assertions.assertThat(emailAccount.getConnectedAccountId()).hasValue(connectedAccountId);

        // Fake Seam does not serve account deletion
        // seam.connectedAccounts().delete(ConnectedAccountsDeleteRequest.builder()
        //         .connectedAccountId(connectedAccountId)
        //         .build());
        // Assertions.assertThat(seam.connectedAccounts().list()).hasSize(0);
    }
}
