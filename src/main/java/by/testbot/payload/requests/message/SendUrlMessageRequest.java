package by.testbot.payload.requests.message;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import by.testbot.models.Keyboard;
import by.testbot.models.Sender;
import by.testbot.models.enums.MessageType;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class SendUrlMessageRequest {
    @JsonProperty("receiver")
    private String userId;

    @JsonProperty("min_api_version")
    private Integer minApiVersion;

    @JsonProperty("sernder")
    private Sender sender;

    @JsonProperty("tracking_data")
    private String trackingData;

    @JsonProperty(value = "type", required = true)
    private final MessageType messageType = MessageType.URL;

    @JsonProperty(value = "media", required = true)
    private String mediaUrl;

    @JsonProperty("keyboard")
    private Keyboard keyboard;

    @JsonProperty("broadcast_list")
    private List<String> broadcastList;
}
