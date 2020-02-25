package com.netcracker.weather.model.service.pojo.darksky;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "latitude",
        "longitude",
        "timezone",
        "currently",
        "hourly",
        "daily",
        "flags",
        "offset"
})
public class DarkSkyPOJO {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DarkSkyPOJO that = (DarkSkyPOJO) o;
        return Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(timezone, that.timezone) &&
                Objects.equals(currently, that.currently) &&
                Objects.equals(hourly, that.hourly) &&
                Objects.equals(daily, that.daily) &&
                Objects.equals(flags, that.flags) &&
                Objects.equals(offset, that.offset) &&
                Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, timezone, currently, hourly, daily, flags, offset, additionalProperties);
    }

    @Override
    public String toString() {
        return "DarkSkyPOJO{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", timezone='" + timezone + '\'' +
                ", currently=" + currently +
                ", hourly=" + hourly +
                ", daily=" + daily +
                ", flags=" + flags +
                ", offset=" + offset +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("currently")
    private Currently currently;
    @JsonProperty("hourly")
    private Hourly hourly;
    @JsonProperty("daily")
    private Daily daily;
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("offset")
    private Integer offset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("currently")
    public Currently getCurrently() {
        return currently;
    }

    @JsonProperty("currently")
    public void setCurrently(Currently currently) {
        this.currently = currently;
    }

    @JsonProperty("hourly")
    public Hourly getHourly() {
        return hourly;
    }

    @JsonProperty("hourly")
    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    @JsonProperty("daily")
    public Daily getDaily() {
        return daily;
    }

    @JsonProperty("daily")
    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

