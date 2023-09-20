package com.snaacker.jpa.aop;

import java.util.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before(value="execution(* com.snaacker.jpa.*.*())")
    public void beforeAdvice(){
        System.out.println("Before advice");
    }

    @After(value="execution(* com.snaacker.jpa.*.*())")
    public void afterAdvice(){
        System.out.println("After advice");
    }

    @Around(value="execution(* com.snaacker.jpa..*(..))")
    public void aroundAdvice(){
        System.out.println("Around advice");
    }

}
