package com.netcracker.weather.model.service.pojo.darksky;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "time",
        "summary",
        "icon",
        "precipIntensity",
        "precipProbability",
        "temperature",
        "apparentTemperature",
        "dewPoint",
        "humidity",
        "pressure",
        "windSpeed",
        "windGust",
        "windBearing",
        "cloudCover",
        "uvIndex",
        "visibility",
        "ozone"
})
public class Currently {

    @JsonProperty("time")
    private Integer time;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("precipIntensity")
    private Integer precipIntensity;
    @JsonProperty("precipProbability")
    private Integer precipProbability;
    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("apparentTemperature")
    private Double apparentTemperature;
    @JsonProperty("dewPoint")
    private Double dewPoint;
    @JsonProperty("humidity")
    private Double humidity;
    @JsonProperty("pressure")
    private Double pressure;
    @JsonProperty("windSpeed")
    private Double windSpeed;
    @JsonProperty("windGust")
    private Double windGust;
    @JsonProperty("windBearing")
    private Integer windBearing;
    @JsonProperty("cloudCover")
    private Double cloudCover;
    @JsonProperty("uvIndex")
    private Integer uvIndex;
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("ozone")
    private Integer ozone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

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

    @JsonProperty("precipIntensity")
    public Integer getPrecipIntensity() {
        return precipIntensity;
    }

    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(Integer precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    @JsonProperty("precipProbability")
    public Integer getPrecipProbability() {
        return precipProbability;
    }

    @JsonProperty("precipProbability")
    public void setPrecipProbability(Integer precipProbability) {
        this.precipProbability = precipProbability;
    }

    @JsonProperty("temperature")
    public Double getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("apparentTemperature")
    public Double getApparentTemperature() {
        return apparentTemperature;
    }

    @JsonProperty("apparentTemperature")
    public void setApparentTemperature(Double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    @JsonProperty("dewPoint")
    public Double getDewPoint() {
        return dewPoint;
    }

    @JsonProperty("dewPoint")
    public void setDewPoint(Double dewPoint) {
        this.dewPoint = dewPoint;
    }

    @JsonProperty("humidity")
    public Double getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("pressure")
    public Double getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("windSpeed")
    public Double getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("windSpeed")
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("windGust")
    public Double getWindGust() {
        return windGust;
    }

    @JsonProperty("windGust")
    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }

    @JsonProperty("windBearing")
    public Integer getWindBearing() {
        return windBearing;
    }

    @JsonProperty("windBearing")
    public void setWindBearing(Integer windBearing) {
        this.windBearing = windBearing;
    }

    @JsonProperty("cloudCover")
    public Double getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("cloudCover")
    public void setCloudCover(Double cloudCover) {
        this.cloudCover = cloudCover;
    }

    @JsonProperty("uvIndex")
    public Integer getUvIndex() {
        return uvIndex;
    }

    @JsonProperty("uvIndex")
    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("ozone")
    public Integer getOzone() {
        return ozone;
    }

    @JsonProperty("ozone")
    public void setOzone(Integer ozone) {
        this.ozone = ozone;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currently currently = (Currently) o;
        return Objects.equals(time, currently.time) &&
                Objects.equals(summary, currently.summary) &&
                Objects.equals(icon, currently.icon) &&
                Objects.equals(precipIntensity, currently.precipIntensity) &&
                Objects.equals(precipProbability, currently.precipProbability) &&
                Objects.equals(temperature, currently.temperature) &&
                Objects.equals(apparentTemperature, currently.apparentTemperature) &&
                Objects.equals(dewPoint, currently.dewPoint) &&
                Objects.equals(humidity, currently.humidity) &&
                Objects.equals(pressure, currently.pressure) &&
                Objects.equals(windSpeed, currently.windSpeed) &&
                Objects.equals(windGust, currently.windGust) &&
                Objects.equals(windBearing, currently.windBearing) &&
                Objects.equals(cloudCover, currently.cloudCover) &&
                Objects.equals(uvIndex, currently.uvIndex) &&
                Objects.equals(visibility, currently.visibility) &&
                Objects.equals(ozone, currently.ozone) &&
                Objects.equals(additionalProperties, currently.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, summary, icon, precipIntensity, precipProbability, temperature, apparentTemperature, dewPoint, humidity, pressure, windSpeed, windGust, windBearing, cloudCover, uvIndex, visibility, ozone, additionalProperties);
    }

    @Override
    public String toString() {
        return "Currently{" +
                "time=" + time +
                ", summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", precipIntensity=" + precipIntensity +
                ", precipProbability=" + precipProbability +
                ", temperature=" + temperature +
                ", apparentTemperature=" + apparentTemperature +
                ", dewPoint=" + dewPoint +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", windSpeed=" + windSpeed +
                ", windGust=" + windGust +
                ", windBearing=" + windBearing +
                ", cloudCover=" + cloudCover +
                ", uvIndex=" + uvIndex +
                ", visibility=" + visibility +
                ", ozone=" + ozone +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
