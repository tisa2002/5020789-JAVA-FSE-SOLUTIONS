package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library.service.*.*(..))")
    public void logBefore() {
        System.out.println("LoggingAspect: Before method execution");
    }

    @After("execution(* com.library.service.*.*(..))")
    public void logAfter() {
        System.out.println("LoggingAspect: After method execution");
    }
}
