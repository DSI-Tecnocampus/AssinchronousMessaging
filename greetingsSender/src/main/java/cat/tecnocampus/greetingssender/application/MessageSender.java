package cat.tecnocampus.greetingssender.application;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {
    private StreamBridge streamBridge;

    public MessageSender(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void sendGreetings(String message) {
        streamBridge.send("greetingChannel", message);
    }
}
