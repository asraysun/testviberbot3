package by.testbot.models.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum InputFieldState {
    @JsonProperty("regular")
    REGULAR,

    @JsonProperty("minimized")
    MINIMIZED,

    @JsonProperty("hidden")
    HIDDEN;
}
