package by.testbot.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Location {
    @JsonProperty("lat")    
    private Double latitude;

    @JsonProperty("lon")
    private Double longitude;
}
