package Consumer.open.Wather.API.DTOs.ApiResponses;

import java.util.Objects;

public class Wind {
    private Double speed;
    private Integer deg;
    private Double gust;

    public Wind(Double speed, Integer deg, Double gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    public Wind() {
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    public Double getGust() {
        return gust;
    }

    public void setGust(Double gust) {
        this.gust = gust;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Wind wind = (Wind) o;
        return Objects.equals(speed, wind.speed) && Objects.equals(deg, wind.deg) && Objects.equals(gust, wind.gust);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, deg, gust);
    }
}
