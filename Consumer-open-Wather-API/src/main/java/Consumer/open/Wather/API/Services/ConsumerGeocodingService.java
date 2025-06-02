package Consumer.open.Wather.API.Services;

import Consumer.open.Wather.API.ApiConfig.ApiConfig;
import Consumer.open.Wather.API.DTOs.Requests.RequestGeocoding.GeocodingRequest;
import Consumer.open.Wather.API.DTOs.Responses.ResponseGeocoding.GeocodingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ConsumerGeocodingService {

    @Autowired
    private RestTemplate restTemplate;

    public List<GeocodingResponse> convertCoord(GeocodingRequest request) {
        String url = "http://api.openweathermap.org/geo/1.0/direct?q="
                +request.getName()+","+request.getState()+","+request.getCountry()+
                "&limit=2&appid=286e71ebe6577b0735e65f5e043aa80c";
        GeocodingResponse[] citys = restTemplate.getForObject(url,GeocodingResponse[].class);
        List<GeocodingResponse> result = List.of(citys);
        return result;

    }
    public List<GeocodingResponse> parseGeocodingResponse(List<GeocodingRequest> lista){
        return lista.stream()
                .map(l -> new GeocodingResponse(
                l.getName(),
                l.getLat(),
                l.getLon(),
                l.getState(),
                l.getCountry()
        ))
                .toList();
    }
}
