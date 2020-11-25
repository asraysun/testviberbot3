package by.testbot.payload.requests;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import by.testbot.models.enums.EventType;
import lombok.Data;

@Data
public class SetWebhookRequest {
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("event_types")
    private List<EventType> eventTypes;
    
    @JsonProperty("send_name")
    private Boolean sendName;

    @JsonProperty("send_photo")
    private Boolean sendPhoto;
}
