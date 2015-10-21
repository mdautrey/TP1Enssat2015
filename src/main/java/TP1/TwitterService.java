package TP1;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by mdautrey on 21/10/15.
 */

// http://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop.html

@Aspect
@Component
public class TwitterService {
    @AfterReturning(pointcut = "TP1.SystemArchitecture.inGetWeather()", returning = "retVal")
    public void sendTweet(Object retVal){
        System.out.println("Aspect !");
    }
}
