package by.testbot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
@JsonInclude(Include.NON_NULL)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    @JsonIgnore
    private Long id;

    @Column(name = "ViberId", nullable = false)
    @JsonProperty("id")
    private String viberId;

    @JsonProperty("name")
    @Column(name = "Name", nullable = false)
    private String name;

    @JsonProperty("avatar")
    @Column(name = "Avatar", nullable = false)
    private String avatar;

    @JsonProperty("country")
    @Column(name = "Country", nullable = false)
    private String country;

    @JsonProperty("language")
    @Column(name = "Language", nullable = false)
    private String language;

    @JsonProperty("primary_device_os")
    @Transient
    private String primaryDeviceOs;

    @JsonProperty("api_version")
    @Transient
    private Integer apiVersion;

    @JsonProperty("mcc")
    @Transient
    private Integer mcc;

    @JsonProperty("mnc")
    @Transient
    private Integer mnc;

    @JsonProperty("device_type")
    @Transient
    private String deviceType;
}
