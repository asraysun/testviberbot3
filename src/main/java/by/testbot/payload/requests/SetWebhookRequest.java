package by.testbot.payload.requests;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import by.testbot.models.enums.EventType;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
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
