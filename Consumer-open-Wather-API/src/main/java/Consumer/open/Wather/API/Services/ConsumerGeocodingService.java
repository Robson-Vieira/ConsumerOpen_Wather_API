package Consumer.open.Wather.API.Services;

import Consumer.open.Wather.API.Config.ApiConfig;
import Consumer.open.Wather.API.DTOs.Requests.RequestGeocoding.GeocodingRequest;
import Consumer.open.Wather.API.DTOs.Requests.RequestWeather.WeatherResquestDTO;

import Consumer.open.Wather.API.DTOs.ResponseWeather.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ConsumerGeocodingService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConsumerWeatherService service;

    @Autowired
    private ApiConfig config;

    public ResponseDTO convertCoord(String cidade, String estado, String pais) {
        String url = "http://api.openweathermap.org/geo/1.0/direct?q="
                +cidade+","
                +estado+","
                +pais +
                "&limit=1"
                + "&appid=" +config.getApikey();
        GeocodingRequest[] result = restTemplate.getForObject(url, GeocodingRequest[].class);
        List<GeocodingRequest> list = List.of(result);
        WeatherResquestDTO weatherResquest = new WeatherResquestDTO(list.get(0).getLat(), list.get(0).getLon());
        ResponseDTO response = service.findInfO( weatherResquest);

        return response;

    }

}
