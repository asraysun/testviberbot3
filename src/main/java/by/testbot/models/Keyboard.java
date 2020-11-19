package by.testbot.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import by.testbot.models.enums.InputFieldState;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class Keyboard {
    @JsonProperty(value = "Buttons", required = true)
    private List<Button> buttons;

    @JsonProperty("BgColor")
    private String color;

    @JsonProperty("DefaultHeight")
    private Boolean defaultHeight;

    @JsonProperty("CustomDefaultHeight")
    private Integer customDefaultHeight;

    @JsonProperty("HeightScale")
    private Integer heightScale;

    @JsonProperty("ButtonGroupColumns")
    private Integer buttonGroupColumns;

    @JsonProperty("ButtonGroupRows")
    private Integer buttonGroupRows;

    @JsonProperty("InputFieldState")
    private InputFieldState inputFieldState;
}
