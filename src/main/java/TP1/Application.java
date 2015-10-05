package TP1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;



/*
http://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-using-springbootapplication-annotation.html
Many Spring Boot developers always have their main class annotated with @Configuration,
@EnableAutoConfiguration and @ComponentScan. Since these annotations are so frequently
used together (especially if you follow the best practices above), Spring Boot provides a
convenient @SpringBootApplication alternative.

The @SpringBootApplication annotation is equivalent to using @Configuration,
@EnableAutoConfiguration and @ComponentScan with their default attributes
 */


/*
http://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/CommandLineRunner.html
public interface CommandLineRunner
Interface used to indicate that a bean should run when it is contained within a SpringApplication.
Multiple CommandLineRunner beans can be defined within the same application context and
can be ordered using the Ordered interface or @Order annotation.

https://mhdevelopment.wordpress.com/2014/02/09/bootstrap-an-application-with-spring-boot-part1-command-line/

 */

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final String URI = "http://api.openweathermap.org/data/2.5/weather?q=%s,%s";

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        // http://alvinalexander.com/java/edu/pj/pj010005
        Scanner scanner = new Scanner(System.in);

        // code pays
        System.out.println("Code pays ?");
        String codePays = scanner.next();
        // ville
        System.out.println("Ville ?");
        String ville = scanner.next();

        /*
        RestTemplate
        Spring's central class for synchronous client-side HTTP access. It simplifies communication
        with HTTP servers, and enforces RESTful principles. It handles HTTP connections, leaving
        application code to provide URLs (with possible template variables) and extract results.
         */
        RestTemplate restTemplate = new RestTemplate();

        // http://docs.spring.io/autorepo/docs/spring-android/1.0.x/reference/html/rest-template.html
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        String url = String.format(URI, ville, codePays);
        WeatherForecast weatherForecast = restTemplate.getForObject(url, WeatherForecast.class);
        System.out.println("Vous avez demandé la météo pour la ville de " + ville + "\nCode pays " + codePays);
        System.out.println(weatherForecast.toString());

    }
}
