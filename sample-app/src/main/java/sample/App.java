package sample;

import com.seam.api.resources.devices.requests.DevicesListRequest;
import java.lang.String;
import com.seam.api.SeamApiClient;

public final class App {
  public static void main(String[] args) {
    SeamApiClient seam = SeamApiClient.builder()
            .apiKey("YOUR_TOKEN")
            .build();

    var response = seam.devices().list(DevicesListRequest.builder().build());
    System.out.println(response);
  }
}
