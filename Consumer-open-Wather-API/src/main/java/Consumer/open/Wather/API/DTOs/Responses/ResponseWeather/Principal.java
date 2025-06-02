package Consumer.open.Wather.API.DTOs.Responses.ResponseWeather;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Principal {

    private Double temperatura;
    private Double sensacao_termica;
    private Double temp_maxima;
    private Double temp_minima;
    private Integer pressao;
    private Integer humidade;

}
