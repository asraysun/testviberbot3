package by.testbot.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
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
    private String apiVersion;

    @JsonProperty("mcc")
    private Integer mcc;

    @JsonProperty("mnc")
    private Integer mnc;

    @JsonProperty("device_type")
    private String deviceType;
}
