package Consumer.open.Wather.API.DTOs.Responses.ResponseWeather;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ResponseDTO
{
    private Coordenadas coordenadas;
    private List<Clima> clima;
    private String base;
    private Principal principal;
    private Integer visibilidade;
    private Vento vento;

}
