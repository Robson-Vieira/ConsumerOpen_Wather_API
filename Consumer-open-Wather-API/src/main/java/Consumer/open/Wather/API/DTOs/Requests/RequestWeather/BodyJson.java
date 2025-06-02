package Consumer.open.Wather.API.DTOs.Requests.RequestWeather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class BodyJson {


    private Coord coord;

    private List<Weather> weather;

    private String base;

    @JsonProperty("main")
    private MainA mainA;

    private Integer visibility;

    private Wind wind;


    }