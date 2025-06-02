package Consumer.open.Wather.API.DTOs.Requests.RequestWeather;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Weather {

    private String id;
    private String main;
    private String description;
    private String icon;

   }
