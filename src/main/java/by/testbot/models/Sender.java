package by.testbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class Sender {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("avatar")
    private String avatarUrl;

    @JsonProperty("country")
    private String country;

    @JsonProperty("language")
    private String language;

    @JsonProperty("api_version")
    private Integer apiVersion;
}
