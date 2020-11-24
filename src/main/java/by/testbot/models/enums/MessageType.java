package by.testbot.models.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MessageType {
    @JsonProperty("text")
    TEXT,

    @JsonProperty("picture")
    PICTURE,

    @JsonProperty("video")
    VIDEO,

    @JsonProperty("file")
    FILE,

    @JsonProperty("sticker")
    STICKER,

    @JsonProperty("contact")
    CONTACT,

    @JsonProperty("url")
    URL,

    @JsonProperty("location")
    LOCATION,

    @JsonProperty("rich_media")
    RICH_MEDIA,

    @JsonProperty("keyboard")
    KEYBOARD;
}
