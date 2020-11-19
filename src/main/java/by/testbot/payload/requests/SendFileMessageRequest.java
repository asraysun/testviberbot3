package by.testbot.payload.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import by.testbot.models.Keyboard;
import by.testbot.models.Sender;
import by.testbot.models.enums.MessageType;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class SendFileMessageRequest {
    @JsonProperty(value = "receiver", required = true)
    private String userId;

    @JsonProperty("min_api_version")
    private Integer minApiVersion;

    @JsonProperty("sender")
    private Sender sender;

    @JsonProperty("tracking_data")
    private String trackingData;

    @JsonProperty(value = "type", required = true)
    private final MessageType messageType = MessageType.FILE;

    @JsonProperty(value = "media", required = true)
    private String mediaUrl;

    @JsonProperty(value = "size", required = true)
    private Long size;

    @JsonProperty(value = "file_name", required = true)
    private String fileName;

    @JsonProperty("keyboard")
    private Keyboard keyboard;
}

