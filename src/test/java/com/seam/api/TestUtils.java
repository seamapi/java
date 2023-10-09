package com.seam.api;

import java.io.IOException;

public final class TestUtils {

    public static final String SEAM_TEST_API_KEY = "seam_apikey1_token";

    private TestUtils() {}

    public static Seam startFakeSeam(int port) {
        try {
            ProcessBuilder process = new ProcessBuilder("npx", "@seamapi/fake-seam-connect", "--seed");
            process.environment().put("PORT", "8080");
            process.start();
            Thread.sleep(5000);
            return Seam.builder()
                    .url("http://localhost:" + Integer.toString(port))
                    .apiKey(TestUtils.SEAM_TEST_API_KEY)
                    .build();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Failed to start fake seam", e);
        }
    }
}
