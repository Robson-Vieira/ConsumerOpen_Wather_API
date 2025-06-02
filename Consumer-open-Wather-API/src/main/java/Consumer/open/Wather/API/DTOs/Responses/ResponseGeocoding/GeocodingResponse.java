package Consumer.open.Wather.API.DTOs.Responses.ResponseGeocoding;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class GeocodingResponse {

    private String name;
    private Double lat;
    private Double lon;
    private String state;
    private String country;

}
