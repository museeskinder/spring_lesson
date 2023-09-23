package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class VehicleStartStopCheck {
    @Before("execution(* com.example.*.*(..))")
    public void vehicleStartStopCheck(boolean vehicleStarted, JoinPoint joinPoint) throws Throwable {
       if(!vehicleStarted)
           throw new RuntimeException("Vehicle is not started");
    }
}
