package Consumer.open.Wather.API.Controllers;

import Consumer.open.Wather.API.DTOs.Requests.RequestGeocoding.GeocodingRequest;
import Consumer.open.Wather.API.DTOs.Responses.ResponseGeocoding.GeocodingResponse;
import Consumer.open.Wather.API.Services.ConsumerGeocodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/geocodificador")
public class ConsumerGeocodingController {

    @Autowired
    public ConsumerGeocodingService service;

    @GetMapping("/{cidade},{estado},{pais}")
    public List<GeocodingResponse> geocoding(@PathVariable String cidade, @PathVariable String estado, @PathVariable String pais){

        return service.convertCoord(new GeocodingRequest(cidade,estado,pais));
    }
}
