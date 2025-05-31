package Consumer.open.Wather.API.DTOs.ApiResponses;

import java.util.Objects;

public class Weather {
    private Integer id;
    private String main;
    private String description;
    private Double icon;

    public Weather() {
    }

    public Weather(Integer id, String main, String description, Double icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getIcon() {
        return icon;
    }

    public void setIcon(Double icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Objects.equals(id, weather.id) && Objects.equals(main, weather.main) && Objects.equals(description, weather.description) && Objects.equals(icon, weather.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, main, description, icon);
    }
}
