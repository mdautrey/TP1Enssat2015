package TP1;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mdautrey on 07/10/15.
 */
@Controller
public class WeatherController {
    private static final String URI = "http://api.openweathermap.org/data/2.5/weather?q=%s,%s&APPID=%s";
    private static final String APIKey = "752d34ff4a7f1cd4ed111512b0c6276a";

    @RequestMapping(value="/requestweather", method=RequestMethod.GET)
    public String requestWeather(Model model) {
        model.addAttribute("location", new Location());
        return "requestweather";
    }
    @RequestMapping(value="/viewweather", method=RequestMethod.POST)
    public String viewWeather(@ModelAttribute Location location, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        String url = String.format(URI, location.getCodeVille(), location.getCodePays(), APIKey);
        WeatherForecast weatherForecast = restTemplate.getForObject(url, WeatherForecast.class);
        model.addAttribute("weatherforecast", weatherForecast);
        model.addAttribute("location", location);
        return "viewweather";
    }

}