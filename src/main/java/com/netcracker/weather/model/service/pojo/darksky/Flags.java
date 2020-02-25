package com.netcracker.weather.model.service.pojo.darksky;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sources",
        "nearest-station",
        "units"
})
public class Flags {

    @JsonProperty("sources")
    private List<String> sources = null;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flags flags = (Flags) o;
        return Objects.equals(sources, flags.sources) &&
                Objects.equals(nearestStation, flags.nearestStation) &&
                Objects.equals(units, flags.units) &&
                Objects.equals(additionalProperties, flags.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sources, nearestStation, units, additionalProperties);
    }

    @Override
    public String toString() {
        return "Flags{" +
                "sources=" + sources +
                ", nearestStation=" + nearestStation +
                ", units='" + units + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @JsonProperty("nearest-station")
    private Double nearestStation;
    @JsonProperty("units")
    private String units;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sources")
    public List<String> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    @JsonProperty("nearest-station")
    public Double getNearestStation() {
        return nearestStation;
    }

    @JsonProperty("nearest-station")
    public void setNearestStation(Double nearestStation) {
        this.nearestStation = nearestStation;
    }

    @JsonProperty("units")
    public String getUnits() {
        return units;
    }

    @JsonProperty("units")
    public void setUnits(String units) {
        this.units = units;
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
