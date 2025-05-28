package Consumer.open.Wather.API.ApiResponses;

import java.util.Objects;

public class Base {

    private String stations;

    public Base(String stations) {
        this.stations = stations;
    }

    public Base() {
    }

    public String getStations() {
        return stations;
    }

    public void setStations(String stations) {
        this.stations = stations;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Base base = (Base) o;
        return Objects.equals(stations, base.stations);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(stations);
    }
}
