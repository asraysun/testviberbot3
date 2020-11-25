package by.testbot.models.enums.button;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BackgroundMediaType {
    @JsonProperty("picture")
    PICTURE,

    @JsonProperty("gif")
    GIF;    
}
