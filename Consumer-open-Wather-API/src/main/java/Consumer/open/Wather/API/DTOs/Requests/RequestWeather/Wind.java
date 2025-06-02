package Consumer.open.Wather.API.DTOs.Requests.RequestWeather;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Wind {

    private Double speed;
    private Integer deg;
    private Double gust;

  }
