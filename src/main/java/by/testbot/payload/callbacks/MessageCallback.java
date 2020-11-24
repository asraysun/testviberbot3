package by.testbot.payload.callbacks;

import com.fasterxml.jackson.annotation.JsonProperty;

import by.testbot.models.Message;
import by.testbot.models.Sender;
import by.testbot.models.enums.EventType;
import lombok.Data;

@Data
public class MessageCallback {
    @JsonProperty("event")
    private EventType eventType;

    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonProperty("message_token")
    private Long messageToken;

    @JsonProperty("sender")
    private Sender sender;

    @JsonProperty("message")
    private Message message;

    @JsonProperty("chat_hostname")
    private String chatHostname;

    @JsonProperty("silent")
    private Boolean silent;
}
