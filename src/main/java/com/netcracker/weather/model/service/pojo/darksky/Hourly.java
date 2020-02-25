package com.netcracker.weather.model.service.pojo.darksky;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "summary",
        "icon",
        "data"
})
public class Hourly {
    @Override
    public String toString() {
        return "Hourly{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @JsonProperty("summary")
    private String summary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hourly hourly = (Hourly) o;
        return Objects.equals(summary, hourly.summary) &&
                Objects.equals(icon, hourly.icon) &&
                Objects.equals(data, hourly.data) &&
                Objects.equals(additionalProperties, hourly.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary, icon, data, additionalProperties);
    }

    @JsonProperty("icon")
    private String icon;
    @JsonProperty("data")
    private List<Datum> data = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
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
