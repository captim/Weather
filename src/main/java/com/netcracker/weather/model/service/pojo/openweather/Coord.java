package com.netcracker.weather.model.service.pojo.openweather;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lon",
        "lat"
})
public class Coord {

    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("lat")
    private Double lat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coord coord = (Coord) o;
        return Objects.equals(lon, coord.lon) &&
                Objects.equals(lat, coord.lat) &&
                Objects.equals(additionalProperties, coord.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lon, lat, additionalProperties);
    }

    @Override
    public String toString() {
        return "Coord{" +
                "lon=" + lon +
                ", lat=" + lat +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
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
