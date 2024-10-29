package net.engineeringdigest.journalApp.Service;

import net.engineeringdigest.journalApp.apiiResponse.WeatherResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {
    private static final String apiKey="8def4e759baed220a9e815572699a476";
    private static final String API="http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public WeatherResponse getWeather(String city){
        String finalAPI = API.replace("CITY",city).replace("API_KEY",apiKey);
        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }
}
