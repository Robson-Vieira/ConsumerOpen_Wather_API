package Consumer.open.Wather.API.DTOs.Requests.RequestGeocoding;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class GeocodingRequest {

    private String name;
    private Double lat;
    private Double lon;
    private String country;
    private String state;


}
