package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class CheckPetAlive {
    @Before("execution(* com.example.service.*.*(..)) && args(animalWake, ..)")
    public void checkPetAliveFunc(boolean animalWake, JoinPoint joinPoint) throws Throwable {
        if(!animalWake)
            throw new RuntimeException("Animal is not alive");
    }
}
