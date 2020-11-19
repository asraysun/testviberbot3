package by.testbot.payload.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import by.testbot.models.enums.Status;
import lombok.Data;

@Data
public class SendMessageResponse {
    @JsonProperty("status")
    private Status status;

    @JsonProperty("status_message")
    private String statusMessage;

    @JsonProperty("message_token")
    private Long messageToken;

    @JsonProperty("chat_hostname")
    private String chatHostname;
}
