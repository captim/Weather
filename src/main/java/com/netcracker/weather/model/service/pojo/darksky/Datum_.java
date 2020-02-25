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
        "sunriseTime",
        "sunsetTime",
        "moonPhase",
        "precipIntensity",
        "precipIntensityMax",
        "precipIntensityMaxTime",
        "precipProbability",
        "precipType",
        "precipAccumulation",
        "temperatureHigh",
        "temperatureHighTime",
        "temperatureLow",
        "temperatureLowTime",
        "apparentTemperatureHigh",
        "apparentTemperatureHighTime",
        "apparentTemperatureLow",
        "apparentTemperatureLowTime",
        "dewPoint",
        "humidity",
        "pressure",
        "windSpeed",
        "windGust",
        "windGustTime",
        "windBearing",
        "cloudCover",
        "uvIndex",
        "uvIndexTime",
        "visibility",
        "ozone",
        "temperatureMin",
        "temperatureMinTime",
        "temperatureMax",
        "temperatureMaxTime",
        "apparentTemperatureMin",
        "apparentTemperatureMinTime",
        "apparentTemperatureMax",
        "apparentTemperatureMaxTime"
})
public class Datum_ {

    @JsonProperty("time")
    private Integer time;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("sunriseTime")
    private Integer sunriseTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Datum_ datum_ = (Datum_) o;
        return Objects.equals(time, datum_.time) &&
                Objects.equals(summary, datum_.summary) &&
                Objects.equals(icon, datum_.icon) &&
                Objects.equals(sunriseTime, datum_.sunriseTime) &&
                Objects.equals(sunsetTime, datum_.sunsetTime) &&
                Objects.equals(moonPhase, datum_.moonPhase) &&
                Objects.equals(precipIntensity, datum_.precipIntensity) &&
                Objects.equals(precipIntensityMax, datum_.precipIntensityMax) &&
                Objects.equals(precipIntensityMaxTime, datum_.precipIntensityMaxTime) &&
                Objects.equals(precipProbability, datum_.precipProbability) &&
                Objects.equals(precipType, datum_.precipType) &&
                Objects.equals(precipAccumulation, datum_.precipAccumulation) &&
                Objects.equals(temperatureHigh, datum_.temperatureHigh) &&
                Objects.equals(temperatureHighTime, datum_.temperatureHighTime) &&
                Objects.equals(temperatureLow, datum_.temperatureLow) &&
                Objects.equals(temperatureLowTime, datum_.temperatureLowTime) &&
                Objects.equals(apparentTemperatureHigh, datum_.apparentTemperatureHigh) &&
                Objects.equals(apparentTemperatureHighTime, datum_.apparentTemperatureHighTime) &&
                Objects.equals(apparentTemperatureLow, datum_.apparentTemperatureLow) &&
                Objects.equals(apparentTemperatureLowTime, datum_.apparentTemperatureLowTime) &&
                Objects.equals(dewPoint, datum_.dewPoint) &&
                Objects.equals(humidity, datum_.humidity) &&
                Objects.equals(pressure, datum_.pressure) &&
                Objects.equals(windSpeed, datum_.windSpeed) &&
                Objects.equals(windGust, datum_.windGust) &&
                Objects.equals(windGustTime, datum_.windGustTime) &&
                Objects.equals(windBearing, datum_.windBearing) &&
                Objects.equals(cloudCover, datum_.cloudCover) &&
                Objects.equals(uvIndex, datum_.uvIndex) &&
                Objects.equals(uvIndexTime, datum_.uvIndexTime) &&
                Objects.equals(visibility, datum_.visibility) &&
                Objects.equals(ozone, datum_.ozone) &&
                Objects.equals(temperatureMin, datum_.temperatureMin) &&
                Objects.equals(temperatureMinTime, datum_.temperatureMinTime) &&
                Objects.equals(temperatureMax, datum_.temperatureMax) &&
                Objects.equals(temperatureMaxTime, datum_.temperatureMaxTime) &&
                Objects.equals(apparentTemperatureMin, datum_.apparentTemperatureMin) &&
                Objects.equals(apparentTemperatureMinTime, datum_.apparentTemperatureMinTime) &&
                Objects.equals(apparentTemperatureMax, datum_.apparentTemperatureMax) &&
                Objects.equals(apparentTemperatureMaxTime, datum_.apparentTemperatureMaxTime) &&
                Objects.equals(additionalProperties, datum_.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, summary, icon, sunriseTime, sunsetTime, moonPhase, precipIntensity, precipIntensityMax, precipIntensityMaxTime, precipProbability, precipType, precipAccumulation, temperatureHigh, temperatureHighTime, temperatureLow, temperatureLowTime, apparentTemperatureHigh, apparentTemperatureHighTime, apparentTemperatureLow, apparentTemperatureLowTime, dewPoint, humidity, pressure, windSpeed, windGust, windGustTime, windBearing, cloudCover, uvIndex, uvIndexTime, visibility, ozone, temperatureMin, temperatureMinTime, temperatureMax, temperatureMaxTime, apparentTemperatureMin, apparentTemperatureMinTime, apparentTemperatureMax, apparentTemperatureMaxTime, additionalProperties);
    }

    @Override
    public String toString() {
        return "Datum_{" +
                "time=" + time +
                ", summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", sunriseTime=" + sunriseTime +
                ", sunsetTime=" + sunsetTime +
                ", moonPhase=" + moonPhase +
                ", precipIntensity=" + precipIntensity +
                ", precipIntensityMax=" + precipIntensityMax +
                ", precipIntensityMaxTime=" + precipIntensityMaxTime +
                ", precipProbability=" + precipProbability +
                ", precipType='" + precipType + '\'' +
                ", precipAccumulation=" + precipAccumulation +
                ", temperatureHigh=" + temperatureHigh +
                ", temperatureHighTime=" + temperatureHighTime +
                ", temperatureLow=" + temperatureLow +
                ", temperatureLowTime=" + temperatureLowTime +
                ", apparentTemperatureHigh=" + apparentTemperatureHigh +
                ", apparentTemperatureHighTime=" + apparentTemperatureHighTime +
                ", apparentTemperatureLow=" + apparentTemperatureLow +
                ", apparentTemperatureLowTime=" + apparentTemperatureLowTime +
                ", dewPoint=" + dewPoint +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", windSpeed=" + windSpeed +
                ", windGust=" + windGust +
                ", windGustTime=" + windGustTime +
                ", windBearing=" + windBearing +
                ", cloudCover=" + cloudCover +
                ", uvIndex=" + uvIndex +
                ", uvIndexTime=" + uvIndexTime +
                ", visibility=" + visibility +
                ", ozone=" + ozone +
                ", temperatureMin=" + temperatureMin +
                ", temperatureMinTime=" + temperatureMinTime +
                ", temperatureMax=" + temperatureMax +
                ", temperatureMaxTime=" + temperatureMaxTime +
                ", apparentTemperatureMin=" + apparentTemperatureMin +
                ", apparentTemperatureMinTime=" + apparentTemperatureMinTime +
                ", apparentTemperatureMax=" + apparentTemperatureMax +
                ", apparentTemperatureMaxTime=" + apparentTemperatureMaxTime +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @JsonProperty("sunsetTime")
    private Integer sunsetTime;
    @JsonProperty("moonPhase")
    private Integer moonPhase;
    @JsonProperty("precipIntensity")
    private Double precipIntensity;
    @JsonProperty("precipIntensityMax")
    private Double precipIntensityMax;
    @JsonProperty("precipIntensityMaxTime")
    private Integer precipIntensityMaxTime;
    @JsonProperty("precipProbability")
    private Double precipProbability;
    @JsonProperty("precipType")
    private String precipType;
    @JsonProperty("precipAccumulation")
    private Double precipAccumulation;
    @JsonProperty("temperatureHigh")
    private Double temperatureHigh;
    @JsonProperty("temperatureHighTime")
    private Integer temperatureHighTime;
    @JsonProperty("temperatureLow")
    private Double temperatureLow;
    @JsonProperty("temperatureLowTime")
    private Integer temperatureLowTime;
    @JsonProperty("apparentTemperatureHigh")
    private Double apparentTemperatureHigh;
    @JsonProperty("apparentTemperatureHighTime")
    private Integer apparentTemperatureHighTime;
    @JsonProperty("apparentTemperatureLow")
    private Double apparentTemperatureLow;
    @JsonProperty("apparentTemperatureLowTime")
    private Integer apparentTemperatureLowTime;
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
    @JsonProperty("windGustTime")
    private Integer windGustTime;
    @JsonProperty("windBearing")
    private Integer windBearing;
    @JsonProperty("cloudCover")
    private Double cloudCover;
    @JsonProperty("uvIndex")
    private Integer uvIndex;
    @JsonProperty("uvIndexTime")
    private Integer uvIndexTime;
    @JsonProperty("visibility")
    private Double visibility;
    @JsonProperty("ozone")
    private Double ozone;
    @JsonProperty("temperatureMin")
    private Double temperatureMin;
    @JsonProperty("temperatureMinTime")
    private Integer temperatureMinTime;
    @JsonProperty("temperatureMax")
    private Double temperatureMax;
    @JsonProperty("temperatureMaxTime")
    private Integer temperatureMaxTime;
    @JsonProperty("apparentTemperatureMin")
    private Double apparentTemperatureMin;
    @JsonProperty("apparentTemperatureMinTime")
    private Integer apparentTemperatureMinTime;
    @JsonProperty("apparentTemperatureMax")
    private Double apparentTemperatureMax;
    @JsonProperty("apparentTemperatureMaxTime")
    private Integer apparentTemperatureMaxTime;
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

    @JsonProperty("sunriseTime")
    public Integer getSunriseTime() {
        return sunriseTime;
    }

    @JsonProperty("sunriseTime")
    public void setSunriseTime(Integer sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    @JsonProperty("sunsetTime")
    public Integer getSunsetTime() {
        return sunsetTime;
    }

    @JsonProperty("sunsetTime")
    public void setSunsetTime(Integer sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    @JsonProperty("moonPhase")
    public Integer getMoonPhase() {
        return moonPhase;
    }

    @JsonProperty("moonPhase")
    public void setMoonPhase(Integer moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonProperty("precipIntensity")
    public Double getPrecipIntensity() {
        return precipIntensity;
    }

    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(Double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    @JsonProperty("precipIntensityMax")
    public Double getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    @JsonProperty("precipIntensityMax")
    public void setPrecipIntensityMax(Double precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    @JsonProperty("precipIntensityMaxTime")
    public Integer getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    @JsonProperty("precipIntensityMaxTime")
    public void setPrecipIntensityMaxTime(Integer precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    @JsonProperty("precipProbability")
    public Double getPrecipProbability() {
        return precipProbability;
    }

    @JsonProperty("precipProbability")
    public void setPrecipProbability(Double precipProbability) {
        this.precipProbability = precipProbability;
    }

    @JsonProperty("precipType")
    public String getPrecipType() {
        return precipType;
    }

    @JsonProperty("precipType")
    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    @JsonProperty("precipAccumulation")
    public Double getPrecipAccumulation() {
        return precipAccumulation;
    }

    @JsonProperty("precipAccumulation")
    public void setPrecipAccumulation(Double precipAccumulation) {
        this.precipAccumulation = precipAccumulation;
    }

    @JsonProperty("temperatureHigh")
    public Double getTemperatureHigh() {
        return temperatureHigh;
    }

    @JsonProperty("temperatureHigh")
    public void setTemperatureHigh(Double temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    @JsonProperty("temperatureHighTime")
    public Integer getTemperatureHighTime() {
        return temperatureHighTime;
    }

    @JsonProperty("temperatureHighTime")
    public void setTemperatureHighTime(Integer temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    @JsonProperty("temperatureLow")
    public Double getTemperatureLow() {
        return temperatureLow;
    }

    @JsonProperty("temperatureLow")
    public void setTemperatureLow(Double temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    @JsonProperty("temperatureLowTime")
    public Integer getTemperatureLowTime() {
        return temperatureLowTime;
    }

    @JsonProperty("temperatureLowTime")
    public void setTemperatureLowTime(Integer temperatureLowTime) {
        this.temperatureLowTime = temperatureLowTime;
    }

    @JsonProperty("apparentTemperatureHigh")
    public Double getApparentTemperatureHigh() {
        return apparentTemperatureHigh;
    }

    @JsonProperty("apparentTemperatureHigh")
    public void setApparentTemperatureHigh(Double apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }

    @JsonProperty("apparentTemperatureHighTime")
    public Integer getApparentTemperatureHighTime() {
        return apparentTemperatureHighTime;
    }

    @JsonProperty("apparentTemperatureHighTime")
    public void setApparentTemperatureHighTime(Integer apparentTemperatureHighTime) {
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    @JsonProperty("apparentTemperatureLow")
    public Double getApparentTemperatureLow() {
        return apparentTemperatureLow;
    }

    @JsonProperty("apparentTemperatureLow")
    public void setApparentTemperatureLow(Double apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    @JsonProperty("apparentTemperatureLowTime")
    public Integer getApparentTemperatureLowTime() {
        return apparentTemperatureLowTime;
    }

    @JsonProperty("apparentTemperatureLowTime")
    public void setApparentTemperatureLowTime(Integer apparentTemperatureLowTime) {
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
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

    @JsonProperty("windGustTime")
    public Integer getWindGustTime() {
        return windGustTime;
    }

    @JsonProperty("windGustTime")
    public void setWindGustTime(Integer windGustTime) {
        this.windGustTime = windGustTime;
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

    @JsonProperty("uvIndexTime")
    public Integer getUvIndexTime() {
        return uvIndexTime;
    }

    @JsonProperty("uvIndexTime")
    public void setUvIndexTime(Integer uvIndexTime) {
        this.uvIndexTime = uvIndexTime;
    }

    @JsonProperty("visibility")
    public Double getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("ozone")
    public Double getOzone() {
        return ozone;
    }

    @JsonProperty("ozone")
    public void setOzone(Double ozone) {
        this.ozone = ozone;
    }

    @JsonProperty("temperatureMin")
    public Double getTemperatureMin() {
        return temperatureMin;
    }

    @JsonProperty("temperatureMin")
    public void setTemperatureMin(Double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    @JsonProperty("temperatureMinTime")
    public Integer getTemperatureMinTime() {
        return temperatureMinTime;
    }

    @JsonProperty("temperatureMinTime")
    public void setTemperatureMinTime(Integer temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    @JsonProperty("temperatureMax")
    public Double getTemperatureMax() {
        return temperatureMax;
    }

    @JsonProperty("temperatureMax")
    public void setTemperatureMax(Double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    @JsonProperty("temperatureMaxTime")
    public Integer getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    @JsonProperty("temperatureMaxTime")
    public void setTemperatureMaxTime(Integer temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    @JsonProperty("apparentTemperatureMin")
    public Double getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    @JsonProperty("apparentTemperatureMin")
    public void setApparentTemperatureMin(Double apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    @JsonProperty("apparentTemperatureMinTime")
    public Integer getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    @JsonProperty("apparentTemperatureMinTime")
    public void setApparentTemperatureMinTime(Integer apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    @JsonProperty("apparentTemperatureMax")
    public Double getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    @JsonProperty("apparentTemperatureMax")
    public void setApparentTemperatureMax(Double apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    @JsonProperty("apparentTemperatureMaxTime")
    public Integer getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    @JsonProperty("apparentTemperatureMaxTime")
    public void setApparentTemperatureMaxTime(Integer apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
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
