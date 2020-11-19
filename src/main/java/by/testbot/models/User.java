package by.testbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class User {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("avatar")
    private String avatar;

    @JsonProperty("country")
    private String country;

    @JsonProperty("language")
    private String language;

    @JsonProperty("primary_device_os")
    private String primaryDeviceOs;

    @JsonProperty("api_version")
    private Integer apiVersion;

    @JsonProperty("mcc")
    private Integer mcc;

    @JsonProperty("mnc")
    private Integer mnc;

    @JsonProperty("device_type")
    private String deviceType;
}
