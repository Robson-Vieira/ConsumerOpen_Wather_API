package Consumer.open.Wather.API.DTOs.ApiResponses;

import java.util.Objects;

public class MainA {
    private Double temp;
    private Float feels_like;
    private Float temp_min;
    private Float temp_max;
    private Integer pressure;
    private Integer humidity;
    private Integer sea_level;
    private  Integer grnd_leavel;

    public MainA(Double temp, Float feels_like, Float temp_min, Float temp_max, Integer pressure, Integer humidity, Integer sea_level, Integer grnd_leavel) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sea_level = sea_level;
        this.grnd_leavel = grnd_leavel;
    }

    public MainA() {
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Float getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(Float feels_like) {
        this.feels_like = feels_like;
    }

    public Float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(Float temp_min) {
        this.temp_min = temp_min;
    }

    public Float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(Float temp_max) {
        this.temp_max = temp_max;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getSea_level() {
        return sea_level;
    }

    public void setSea_level(Integer sea_level) {
        this.sea_level = sea_level;
    }

    public Integer getGrnd_leavel() {
        return grnd_leavel;
    }

    public void setGrnd_leavel(Integer grnd_leavel) {
        this.grnd_leavel = grnd_leavel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MainA mainA = (MainA) o;
        return Objects.equals(temp, mainA.temp) && Objects.equals(feels_like, mainA.feels_like) && Objects.equals(temp_min, mainA.temp_min) && Objects.equals(temp_max, mainA.temp_max) && Objects.equals(pressure, mainA.pressure) && Objects.equals(humidity, mainA.humidity) && Objects.equals(sea_level, mainA.sea_level) && Objects.equals(grnd_leavel, mainA.grnd_leavel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temp, feels_like, temp_min, temp_max, pressure, humidity, sea_level, grnd_leavel);
    }
}
