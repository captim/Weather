package com.netcracker.weather.model.service.pojo.weatherstack;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "country",
        "region",
        "lat",
        "lon",
        "timezone_id",
        "localtime",
        "localtime_epoch",
        "utc_offset"
})
public class Location {

    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
    @JsonProperty("region")
    private String region;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("timezone_id")
    private String timezoneId;
    @JsonProperty("localtime")
    private String localtime;
    @JsonProperty("localtime_epoch")
    private Integer localtimeEpoch;
    @JsonProperty("utc_offset")
    private String utcOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public String getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(String lon) {
        this.lon = lon;
    }

    @JsonProperty("timezone_id")
    public String getTimezoneId() {
        return timezoneId;
    }

    @JsonProperty("timezone_id")
    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    @JsonProperty("localtime")
    public String getLocaltime() {
        return localtime;
    }

    @JsonProperty("localtime")
    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    @JsonProperty("localtime_epoch")
    public Integer getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    @JsonProperty("localtime_epoch")
    public void setLocaltimeEpoch(Integer localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }

    @JsonProperty("utc_offset")
    public String getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utc_offset")
    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", timezoneId='" + timezoneId + '\'' +
                ", localtime='" + localtime + '\'' +
                ", localtimeEpoch=" + localtimeEpoch +
                ", utcOffset='" + utcOffset + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(name, location.name) &&
                Objects.equals(country, location.country) &&
                Objects.equals(region, location.region) &&
                Objects.equals(lat, location.lat) &&
                Objects.equals(lon, location.lon) &&
                Objects.equals(timezoneId, location.timezoneId) &&
                Objects.equals(localtime, location.localtime) &&
                Objects.equals(localtimeEpoch, location.localtimeEpoch) &&
                Objects.equals(utcOffset, location.utcOffset) &&
                Objects.equals(additionalProperties, location.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, region, lat, lon, timezoneId, localtime, localtimeEpoch, utcOffset, additionalProperties);
    }
}
