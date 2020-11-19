package by.testbot.models.enums.button;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TextSize {
    @JsonProperty("small")
    SMALL,

    @JsonProperty("regular")
    REGULAR,

    @JsonProperty("large")
    LARGE;
}
