package TP1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by mdautrey on 13/10/15.
 */
@Configuration
@EnableAspectJAutoProxy public class WeatherConfig {
    @Bean
    WeatherInterface weatherInterface() {
        return new WeatherInterfaceImpl();
    }
}
