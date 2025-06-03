package Consumer.open.Wather.API.DTOs.ResponseWeather;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Clima {
    private String id_clima;
    private String principal;
    private String descricao;
    private String id;
}
