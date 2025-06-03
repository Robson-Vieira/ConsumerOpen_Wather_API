package Consumer.open.Wather.API.DTOs.ResponseWeather;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Vento {
    private Double velocidade;
    private Integer direcao;
    private Double rajada;
}
