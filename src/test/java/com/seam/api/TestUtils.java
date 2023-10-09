package com.seam.api;

import java.io.IOException;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public final class TestUtils {

    public static final String SEAM_TEST_API_KEY = "seam_apikey1_token";

    public static final Queue<Integer> PORTS = new ArrayBlockingQueue<>(100);

    static {
        PORTS.add(8080);
        PORTS.add(8081);
        PORTS.add(8082);
        PORTS.add(8083);
        PORTS.add(8084);
        PORTS.add(8085);
        PORTS.add(8086);
        PORTS.add(8087);
        PORTS.add(8088);
        PORTS.add(8089);
    }

    private TestUtils() {}

    public static Seam startFakeSeam() {
        try {
            int port = PORTS.poll();
            ProcessBuilder process = new ProcessBuilder("npx", "@seamapi/fake-seam-connect", "--seed");
            process.environment().put("PORT", Integer.toString(port));
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
