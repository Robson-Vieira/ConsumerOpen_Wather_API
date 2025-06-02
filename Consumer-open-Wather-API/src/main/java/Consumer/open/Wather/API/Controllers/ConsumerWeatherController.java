package Consumer.open.Wather.API.Controllers;

import Consumer.open.Wather.API.DTOs.Requests.RequestWeather.WeatherResquestDTO;
import Consumer.open.Wather.API.DTOs.Responses.ResponseWeather.ResponseDTO;
import Consumer.open.Wather.API.Services.ConsumerWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/consumer")
public class ConsumerWeatherController {

    @Autowired
    private ConsumerWeatherService service;

    @GetMapping("/{lat}/{lon}")
    public ResponseDTO getInformations(@PathVariable  String lat, @PathVariable String lon){
        WeatherResquestDTO request = new WeatherResquestDTO(lat, lon);
        return service.findInfO(request);
    }
}
