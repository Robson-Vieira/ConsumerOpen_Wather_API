package Consumer.open.Wather.API.Controllers;

import Consumer.open.Wather.API.DTOs.ApiResponses.ApiResponse;
import Consumer.open.Wather.API.DTOs.Request.ResquestDTO;
import Consumer.open.Wather.API.Services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService service;

    @GetMapping("/consumer/{lat}/{lon}")
    public ApiResponse getInformations(@PathVariable  String lat,@PathVariable String lon){
        ResquestDTO request = new ResquestDTO(lat, lon);
        return service.findInfO(request);
    }
}
