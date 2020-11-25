package by.testbot.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class Location {
    @JsonProperty("lat")    
    private Double latitude;

    @JsonProperty("lon")
    private Double longitude;
}
