package com.netcracker.weather.model.service.pojo.weatherstack;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "query",
        "language",
        "unit"
})
public class Request {

    @JsonProperty("type")
    private String type;
    @JsonProperty("query")
    private String query;
    @JsonProperty("language")
    private String language;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
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
        return "Request{" +
                "type='" + type + '\'' +
                ", query='" + query + '\'' +
                ", language='" + language + '\'' +
                ", unit='" + unit + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(type, request.type) &&
                Objects.equals(query, request.query) &&
                Objects.equals(language, request.language) &&
                Objects.equals(unit, request.unit) &&
                Objects.equals(additionalProperties, request.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, query, language, unit, additionalProperties);
    }
}
