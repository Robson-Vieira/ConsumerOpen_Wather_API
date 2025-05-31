package Consumer.open.Wather.API.Services;

import Consumer.open.Wather.API.ApiConfig.ApiConfig;
import Consumer.open.Wather.API.DTOs.ApiResponses.ApiResponse;
import Consumer.open.Wather.API.DTOs.Request.ResquestDTO;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {


    @Autowired
    public RestTemplate restTemplate;

    public ApiResponse findInfO(ResquestDTO request){
        String url= "https://api.openweathermap.org/data/2.5/weather?lat="
                +request.getLat()+
                "&lon="
                +request.getLon()+
                "&appid=286e71ebe6577b0735e65f5e043aa80c";

        return restTemplate.getForObject(url, ApiResponse.class);
    }

}

