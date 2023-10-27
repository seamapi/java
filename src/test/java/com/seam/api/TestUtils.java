package com.seam.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class TestUtils {

    public static final String SEAM_TEST_API_KEY = "seam_apikey1_token";

    public static final Queue<Integer> PORTS = new ArrayBlockingQueue<>(100);

    private static final ExecutorService STDOUT_EXECUTOR_SERVICE = Executors.newSingleThreadExecutor();

    static {
        PORTS.add(9090);
        PORTS.add(9091);
        PORTS.add(9092);
        PORTS.add(9093);
        PORTS.add(9094);
        PORTS.add(9095);
        PORTS.add(9096);
        PORTS.add(9097);
        PORTS.add(9098);
        PORTS.add(9099);
    }

    private TestUtils() {}

    public static FakeSeamStartedResponse startFakeSeam() {
        try {
            int port = PORTS.poll();
            ProcessBuilder process = new ProcessBuilder("fake-seam-connect", "--seed");
            process.environment().put("PORT", Integer.toString(port));
            Process p = process.start();
            STDOUT_EXECUTOR_SERVICE.submit(() -> print(p));
            Thread.sleep(5000);
            Seam seam = Seam.builder()
                    .url("http://localhost:" + port)
                    .apiKey(TestUtils.SEAM_TEST_API_KEY)
                    .build();
            return new FakeSeamStartedResponse(seam, p);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Failed to start fake seam", e);
        }
    }

    public static class FakeSeamStartedResponse {
        public final Seam seam;
        public final Process process;

        public FakeSeamStartedResponse(Seam seam, Process process) {
            this.seam = seam;
            this.process = process;
        }
    }

    private static void print(Process p) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream(), StandardCharsets.UTF_8));
        String line = "";
        try {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
