package Consumer.open.Wather.API.DTOs.ApiResponses;

import java.util.Objects;

public class Cord {

    private Integer lon;
    private Integer lat;

    public Cord() {}

    public Cord(Integer lon, Integer lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Integer getLon() {
        return lon;
    }

    public void setLon(Integer lon) {
        this.lon = lon;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cord cord = (Cord) o;
        return Objects.equals(lon, cord.lon) && Objects.equals(lat, cord.lat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lon, lat);
    }
}
