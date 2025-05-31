package Consumer.open.Wather.API.DTOs.ApiResponses;

import java.util.Objects;

public class ApiResponse {

    private Cord cord;
    private Weather weather;
    private String stations;
    private MainA mainA;
    private Integer visibility;
    private Wind wind;

    public ApiResponse() {
    }

    public ApiResponse(Cord cord, Weather weather, String stations, MainA mainA, Integer visibility, Wind wind) {
        this.cord = cord;
        this.weather = weather;
        this.stations = stations;
        this.mainA = mainA;
        this.visibility = visibility;
        this.wind = wind;
    }

    public Cord getCord() {
        return cord;
    }

    public void setCord(Cord cord) {
        this.cord = cord;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getStations() {
        return stations;
    }

    public void setStations(String stations) {
        this.stations = stations;
    }

    public MainA getMainA() {
        return mainA;
    }

    public void setMainA(MainA mainA) {
        this.mainA = mainA;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ApiResponse that = (ApiResponse) o;
        return Objects.equals(cord, that.cord) && Objects.equals(weather, that.weather) && Objects.equals(stations, that.stations) && Objects.equals(mainA, that.mainA) && Objects.equals(visibility, that.visibility) && Objects.equals(wind, that.wind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cord, weather, stations, mainA, visibility, wind);
    }
}

