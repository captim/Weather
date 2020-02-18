package com.netcracker.weather.model.service.pojo.weatherbit;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rh",
        "pod",
        "lon",
        "pres",
        "timezone",
        "ob_time",
        "country_code",
        "clouds",
        "ts",
        "solar_rad",
        "state_code",
        "city_name",
        "wind_spd",
        "last_ob_time",
        "wind_cdir_full",
        "wind_cdir",
        "slp",
        "vis",
        "h_angle",
        "sunset",
        "dni",
        "dewpt",
        "snow",
        "uv",
        "precip",
        "wind_dir",
        "sunrise",
        "ghi",
        "dhi",
        "aqi",
        "lat",
        "weather",
        "datetime",
        "temp",
        "station",
        "elev_angle",
        "app_temp"
})
public class Datum {

    @JsonProperty("rh")
    private Integer rh;
    @JsonProperty("pod")
    private String pod;
    @JsonProperty("lon")
    private Double lon;
    @JsonProperty("pres")
    private Double pres;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("ob_time")
    private String obTime;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("clouds")
    private Integer clouds;
    @JsonProperty("ts")
    private Integer ts;
    @JsonProperty("solar_rad")
    private Integer solarRad;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("wind_spd")
    private Double windSpd;
    @JsonProperty("last_ob_time")
    private String lastObTime;
    @JsonProperty("wind_cdir_full")
    private String windCdirFull;
    @JsonProperty("wind_cdir")
    private String windCdir;
    @JsonProperty("slp")
    private Double slp;
    @JsonProperty("vis")
    private Double vis;
    @JsonProperty("h_angle")
    private Integer hAngle;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("dni")
    private Integer dni;
    @JsonProperty("dewpt")
    private Double dewpt;
    @JsonProperty("snow")
    private Integer snow;
    @JsonProperty("uv")
    private Integer uv;
    @JsonProperty("precip")
    private Integer precip;
    @JsonProperty("wind_dir")
    private Integer windDir;
    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("ghi")
    private Integer ghi;
    @JsonProperty("dhi")
    private Integer dhi;
    @JsonProperty("aqi")
    private Integer aqi;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("weather")
    private Weather weather;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("temp")
    private Double temp;
    @JsonProperty("station")
    private String station;
    @JsonProperty("elev_angle")
    private Double elevAngle;
    @JsonProperty("app_temp")
    private Double appTemp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rh")
    public Integer getRh() {
        return rh;
    }

    @JsonProperty("rh")
    public void setRh(Integer rh) {
        this.rh = rh;
    }

    @JsonProperty("pod")
    public String getPod() {
        return pod;
    }

    @JsonProperty("pod")
    public void setPod(String pod) {
        this.pod = pod;
    }

    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    @JsonProperty("pres")
    public Double getPres() {
        return pres;
    }

    @JsonProperty("pres")
    public void setPres(Double pres) {
        this.pres = pres;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("ob_time")
    public String getObTime() {
        return obTime;
    }

    @JsonProperty("ob_time")
    public void setObTime(String obTime) {
        this.obTime = obTime;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("clouds")
    public Integer getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("ts")
    public Integer getTs() {
        return ts;
    }

    @JsonProperty("ts")
    public void setTs(Integer ts) {
        this.ts = ts;
    }

    @JsonProperty("solar_rad")
    public Integer getSolarRad() {
        return solarRad;
    }

    @JsonProperty("solar_rad")
    public void setSolarRad(Integer solarRad) {
        this.solarRad = solarRad;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("wind_spd")
    public Double getWindSpd() {
        return windSpd;
    }

    @JsonProperty("wind_spd")
    public void setWindSpd(Double windSpd) {
        this.windSpd = windSpd;
    }

    @JsonProperty("last_ob_time")
    public String getLastObTime() {
        return lastObTime;
    }

    @JsonProperty("last_ob_time")
    public void setLastObTime(String lastObTime) {
        this.lastObTime = lastObTime;
    }

    @JsonProperty("wind_cdir_full")
    public String getWindCdirFull() {
        return windCdirFull;
    }

    @JsonProperty("wind_cdir_full")
    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    @JsonProperty("wind_cdir")
    public String getWindCdir() {
        return windCdir;
    }

    @JsonProperty("wind_cdir")
    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    @JsonProperty("slp")
    public Double getSlp() {
        return slp;
    }

    @JsonProperty("slp")
    public void setSlp(Double slp) {
        this.slp = slp;
    }

    @JsonProperty("vis")
    public Double getVis() {
        return vis;
    }

    @JsonProperty("vis")
    public void setVis(Double vis) {
        this.vis = vis;
    }

    @JsonProperty("h_angle")
    public Integer getHAngle() {
        return hAngle;
    }

    @JsonProperty("h_angle")
    public void setHAngle(Integer hAngle) {
        this.hAngle = hAngle;
    }

    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @JsonProperty("dni")
    public Integer getDni() {
        return dni;
    }

    @JsonProperty("dni")
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @JsonProperty("dewpt")
    public Double getDewpt() {
        return dewpt;
    }

    @JsonProperty("dewpt")
    public void setDewpt(Double dewpt) {
        this.dewpt = dewpt;
    }

    @JsonProperty("snow")
    public Integer getSnow() {
        return snow;
    }

    @JsonProperty("snow")
    public void setSnow(Integer snow) {
        this.snow = snow;
    }

    @JsonProperty("uv")
    public Integer getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(Integer uv) {
        this.uv = uv;
    }

    @JsonProperty("precip")
    public Integer getPrecip() {
        return precip;
    }

    @JsonProperty("precip")
    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    @JsonProperty("wind_dir")
    public Integer getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(Integer windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("ghi")
    public Integer getGhi() {
        return ghi;
    }

    @JsonProperty("ghi")
    public void setGhi(Integer ghi) {
        this.ghi = ghi;
    }

    @JsonProperty("dhi")
    public Integer getDhi() {
        return dhi;
    }

    @JsonProperty("dhi")
    public void setDhi(Integer dhi) {
        this.dhi = dhi;
    }

    @JsonProperty("aqi")
    public Integer getAqi() {
        return aqi;
    }

    @JsonProperty("aqi")
    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("weather")
    public Weather getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("temp")
    public Double getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @JsonProperty("station")
    public String getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(String station) {
        this.station = station;
    }

    @JsonProperty("elev_angle")
    public Double getElevAngle() {
        return elevAngle;
    }

    @JsonProperty("elev_angle")
    public void setElevAngle(Double elevAngle) {
        this.elevAngle = elevAngle;
    }

    @JsonProperty("app_temp")
    public Double getAppTemp() {
        return appTemp;
    }

    @JsonProperty("app_temp")
    public void setAppTemp(Double appTemp) {
        this.appTemp = appTemp;
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
