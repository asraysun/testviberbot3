package by.testbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class Contact {
    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty(value = "phone_number", required = true)
    private String phoneNumber;

    @JsonProperty("avatar")
    private String avatarUrl;
}
