package by.testbot.models.enums.button;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ActionType {
    @JsonProperty("reply")
    REPLY,

    @JsonProperty("open-url")
    OPEN_URL,

    @JsonProperty("location-picker")
    LOCATION_PICKER,

    @JsonProperty("share-phone")
    SHARE_PHONE,

    @JsonProperty("none")
    NONE;
}
