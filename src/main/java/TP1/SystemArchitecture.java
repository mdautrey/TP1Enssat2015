package TP1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by mdautrey on 21/10/15.
 */
@Aspect
public class SystemArchitecture {
    /**
     * pointcut d interception call webservice
     */
    @Pointcut("execution(* getWeather(..))")
    public void inGetWeather(){}
}
