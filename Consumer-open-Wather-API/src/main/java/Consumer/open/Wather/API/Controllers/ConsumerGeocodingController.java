package Consumer.open.Wather.API.Controllers;

import Consumer.open.Wather.API.DTOs.ResponseWeather.ResponseDTO;
import Consumer.open.Wather.API.Services.ConsumerGeocodingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/weatherConsumer")
public class ConsumerGeocodingController {

    @Autowired
    public ConsumerGeocodingService service;

    @Operation(
            summary = "Busca informações climaticas a partir de climaticas a partir das entradas dos campos de cidade, estado e pais"
    )@ApiResponse(responseCode = "200", description = "Informações climaticas retornadas com sucesso!")
    @GetMapping("/{cidade}/{estado}/{pais}")
    public ResponseDTO geocoding(@PathVariable @NotBlank  String cidade, @PathVariable @NotBlank String estado, @PathVariable @NotBlank String pais){

        return service.convertCoord(cidade,estado,pais);
    }
}
