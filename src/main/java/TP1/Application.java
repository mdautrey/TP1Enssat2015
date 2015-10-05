package TP1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;


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

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        System.out.println(quote.toString());
    }
}