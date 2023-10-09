package com.seam.api.connectedaccounts;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.types.ConnectedAccount;
import com.seam.api.types.ConnectedAccountsGetRequest;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public final class ConnectedAccountsTest {

    private static Seam seam;

    @BeforeAll
    public static void beforeAll() {
        seam = TestUtils.startFakeSeam(8080);
    }

    private static final String EMAIL = "user-4@example.com";

    @Test
    public void test_connected_accounts() {
        List<ConnectedAccount> connectedAccounts = seam.connectedAccounts().list();
        Assertions.assertThat(connectedAccounts).hasSizeGreaterThan(0);

        String connectedAccountId =
                connectedAccounts.get(0).getConnectedAccountId().get();

        ConnectedAccount connectedAccount =
                seam.connectedAccounts().get(ConnectedAccountsGetRequest.id(connectedAccountId));
        Assertions.assertThat(connectedAccount.getConnectedAccountId()).hasValue(connectedAccountId);

        // Fake Seam does not like email creation
        // ConnectedAccount emailAccount = seam.connectedAccounts().get(
        //         ConnectedAccountsGetRequest.email(EMAIL));
        // Assertions.assertThat(emailAccount.getConnectedAccountId()).hasValue(connectedAccountId);

        // Fake Seam does serve account deletion
        // seam.connectedAccounts().delete(ConnectedAccountsDeleteRequest.builder()
        //         .connectedAccountId(connectedAccountId)
        //         .build());
        // Assertions.assertThat(seam.connectedAccounts().list()).hasSize(0);
    }
}
