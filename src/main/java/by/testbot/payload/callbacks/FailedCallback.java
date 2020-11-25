package by.testbot.payload.callbacks;

import com.fasterxml.jackson.annotation.JsonProperty;

import by.testbot.models.enums.EventType;
import lombok.Data;

@Data
public class FailedCallback {
    @JsonProperty("event")
    private EventType eventType;

    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonProperty("message_token")
    private Long messageToken;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("desc")
    private String description;

    @JsonProperty("chat_hostname")
    private String chatHostname;
}
