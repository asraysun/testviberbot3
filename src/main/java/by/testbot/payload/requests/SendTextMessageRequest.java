package by.testbot.payload.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import by.testbot.models.Sender;
import by.testbot.models.enums.MessageType;
import lombok.Data;

@Data
public class SendTextMessageRequest {
    @JsonProperty("receiver")
    private String receiverId;

    @JsonProperty("min_api_version")
    private String minApiVersion;

    @JsonProperty("sender")
    private Sender sender;

    @JsonProperty("tracking_data")
    private String trackingData;

    @JsonProperty("type")
    private MessageType messageType = MessageType.TEXT;

    @JsonProperty("text")
    private String text;
}
