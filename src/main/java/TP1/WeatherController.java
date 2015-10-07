package TP1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mdautrey on 07/10/15.
 */
@Controller
public class WeatherController {

    @RequestMapping(value="/requestweather", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("localisation", new Localisation());
        return "requestweather";
    }
}