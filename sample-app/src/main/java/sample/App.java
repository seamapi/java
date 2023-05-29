package sample;

import com.seam.api.resources.accesscodes.requests.AccessCodesCreateRequest;
import com.seam.api.resources.accesscodes.requests.AccessCodesUpdatePutRequest;
import com.seam.api.types.AccessCodesCreateResponse;
import java.lang.String;
import com.seam.api.SeamApiClient;

public final class App {
  public static void main(String[] args) throws InterruptedException {
    SeamApiClient seam = SeamApiClient.builder()
            .token("MY_API_KEY")
            .build();

    // create access code
    AccessCodesCreateResponse accessCodesCreateResponse = seam.accessCodes().create(AccessCodesCreateRequest.builder()
            .deviceId("123e4567-e89b-12d3-a456-426614174000")
            .commonCodeKey("My first code")
            .build());
    System.out.println(accessCodesCreateResponse.getAccessCode());

    Object accessCode = seam.accessCodes().updateAndWaitUntilReady(AccessCodesUpdatePutRequest.builder()
            .accessCodeId("my-access-code-id")
            .name("access-code-name")
            .code("access-code")
            .build());
    System.out.println(accessCode);
  }


}
