package Consumer.open.Wather.API.DTOs.Request;

import java.util.Objects;

public class ResquestDTO {
    private String lat;
    private String lon;

    public ResquestDTO(String lat, String lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public ResquestDTO() {
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ResquestDTO that = (ResquestDTO) o;
        return Objects.equals(lat, that.lat) && Objects.equals(lon, that.lon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lon);
    }

}
