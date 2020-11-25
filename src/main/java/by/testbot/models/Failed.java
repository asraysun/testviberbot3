package by.testbot.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import by.testbot.models.enums.Status;
import lombok.Data;

@Data
public class Failed {
    @JsonProperty("receiver")
    private String userId;

    @JsonProperty("status")
    private Status status;

    @JsonProperty("status_message")
    private String statusMessage;
}
