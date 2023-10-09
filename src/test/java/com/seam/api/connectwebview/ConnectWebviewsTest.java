package com.seam.api.connectwebview;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.resources.connectwebviews.requests.ConnectWebviewsCreateRequest;
import com.seam.api.resources.connectwebviews.requests.ConnectWebviewsGetRequest;
import com.seam.api.types.ConnectWebview;
import com.seam.api.types.ConnectWebviewsCreateRequestAcceptedProvidersItem;
import com.seam.api.types.ConnectWebviewsCreateRequestProviderCategory;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public final class ConnectWebviewsTest {

    private static Seam seam;

    @BeforeAll
    public static void beforeAll() {
        seam = TestUtils.startFakeSeam(8080);
    }

    @Test
    public void test_connect_webviews() throws InterruptedException {
        ConnectWebview createdWebView = seam.connectWebviews()
                .create(ConnectWebviewsCreateRequest.builder()
                        .acceptedProviders(List.of(ConnectWebviewsCreateRequestAcceptedProvidersItem.SCHLAGE))
                        .build());
        Assertions.assertThat(createdWebView.getConnectWebviewId()).isNotNull();

        ConnectWebview webview = seam.connectWebviews().getById(createdWebView.getConnectWebviewId());
        Assertions.assertThat(webview.getConnectWebviewId()).isEqualTo(createdWebView.getConnectWebviewId());

        // Fake Seam does not serve list webviews
        // List<ConnectWebview> webviews = seam.connectWebviews().list();
        // Assertions.assertThat(webviews).hasSizeGreaterThan(0);

        // Test with provider category
        ConnectWebview newWebview = seam.connectWebviews()
                .create(ConnectWebviewsCreateRequest.builder()
                        .providerCategory(ConnectWebviewsCreateRequestProviderCategory.STABLE)
                        .build());
        Assertions.assertThat(newWebview.getConnectWebviewId()).isNotNull();

        webview = seam.connectWebviews()
                .get(ConnectWebviewsGetRequest.builder()
                        .connectWebviewId(newWebview.getConnectWebviewId())
                        .build());
        Assertions.assertThat(webview.getAcceptedProviders()).hasSizeGreaterThan(0);
    }
}
