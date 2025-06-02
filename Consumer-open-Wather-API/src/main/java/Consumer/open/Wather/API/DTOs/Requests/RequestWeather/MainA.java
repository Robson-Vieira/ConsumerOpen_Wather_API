package Consumer.open.Wather.API.DTOs.Requests.RequestWeather;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class MainA {


    private Double temp;
    private Double feels_like;
    private Double temp_min;
    private Double temp_max;
    private Integer pressure;
    private Integer humidity;




}
