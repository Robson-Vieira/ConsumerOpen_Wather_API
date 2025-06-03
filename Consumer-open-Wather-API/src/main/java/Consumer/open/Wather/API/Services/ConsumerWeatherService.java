package Consumer.open.Wather.API.Services;

import Consumer.open.Wather.API.DTOs.Requests.RequestWeather.BodyJson;
import Consumer.open.Wather.API.DTOs.Requests.RequestWeather.WeatherResquestDTO;
import Consumer.open.Wather.API.DTOs.ResponseWeather.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerWeatherService {


    @Autowired
    public RestTemplate restTemplate;

    public ResponseDTO findInfO(WeatherResquestDTO request){
        String url= "https://api.openweathermap.org/data/2.5/weather?lat="
                +request.getLat()+
                "&lon="
                +request.getLon()+
                "&appid=286e71ebe6577b0735e65f5e043aa80c";
        BodyJson json = restTemplate.getForObject(url, BodyJson.class);
        return mapToResponse(json);
    }

    public ResponseDTO mapToResponse(BodyJson json){
        return new ResponseDTO(
                new Coordenadas(
                        json.getCoord().getLat(),
                        json.getCoord().getLon()
                ),
                json.getWeather().stream().
                        map(w -> new Clima(
                                w.getId(),
                                w.getMain(),
                                w.getDescription(),
                                w.getIcon()
                        ))
                        .toList(),
                json.getBase(),
                new Principal(
                        json.getMainA().getTemp(),
                        json.getMainA().getFeels_like(),
                        json.getMainA().getTemp_min(),
                        json.getMainA().getTemp_max(),
                        json.getMainA().getPressure(),
                        json.getMainA().getHumidity()
                ),
                json.getVisibility(),
                new Vento(
                        json.getWind().getSpeed(),
                        json.getWind().getDeg(),
                        json.getWind().getGust()
                )
        );
    }
}

