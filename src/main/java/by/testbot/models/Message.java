package by.testbot.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import by.testbot.models.enums.MessageType;
import lombok.Data;

@Data
public class Message {
    @JsonProperty("type")
    private MessageType messageType;

    @JsonProperty("text")
    private String text;

    @JsonProperty("media")
    private String media;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("contact")
    private Contact contact;

    @JsonProperty("tracking_data")
    private String trackingData;

    @JsonProperty("file_name")
    private String fileName;

    @JsonProperty("file_size")
    private Long fileSize;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("sticker_id")
    private Integer stickerId;
}
