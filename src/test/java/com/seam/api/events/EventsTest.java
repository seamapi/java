package com.seam.api.events;

import com.seam.api.Seam;
import com.seam.api.TestUtils;
import com.seam.api.resources.events.requests.EventsGetRequest;
import com.seam.api.resources.events.requests.EventsListRequest;
import com.seam.api.types.Event;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public final class EventsTest {

    private static final String SINCE = "2021-01-01T00:00:00.000Z";
    private static final String FAKE_UUID = "00000000-0000-0000-0000-000000000000";

    private static Seam seam;

    @BeforeAll
    public static void beforeAll() {
        seam = TestUtils.startFakeSeam(8080);
    }

    // Fake Seam does not serve events endpoints
    // @Test
    public void test_events() {
        List<Event> events = seam.events().list(EventsListRequest.builder()
                .since(SINCE)
                .build());
        Event connectedEvent = events.stream()
                .filter(event -> event.getEventType().equals("device.connected"))
                .findFirst()
                .get();

        Event eventById = seam.events().get(EventsGetRequest.builder()
                .eventId(connectedEvent.getEventId())
                .build())
                .get();
        Assertions.assertThat(eventById.getEventId()).isEqualTo(connectedEvent.getEventId());

        Event eventByType = seam.events().get(EventsGetRequest.builder()
                        .eventType(connectedEvent.getEventType())
                        .build())
                .get();
        Assertions.assertThat(eventByType.getEventType()).isEqualTo(connectedEvent.getEventType());

        Event eventByDeviceId = seam.events().get(EventsGetRequest.builder()
                        .deviceId(connectedEvent.getDeviceId())
                        .build())
                .get();
        Assertions.assertThat(eventByDeviceId.getDeviceId()).isEqualTo(connectedEvent.getDeviceId());

        Optional<Event> emptyEvent = seam.events().get(EventsGetRequest.builder()
                .eventId(FAKE_UUID)
                .build());
        Assertions.assertThat(emptyEvent).isEmpty();
    }
}
