package Consumer.open.Wather.API.Config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConfigurationProperties(prefix = "openweathermap")
@Getter
@Setter
public class ApiConfig {

    private String apikey;

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
