package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class VehicleStartStopCheck {
    Logger logger = Logger.getLogger(VehicleStartStopCheck.class.getName());
    @Before("execution(* com.example.services.*.*(..))")
    public void vehicleStartStopCheck(boolean vehicleStarted, JoinPoint joinPoint) throws Throwable {
       if(!vehicleStarted)
           throw new RuntimeException("Vehicle is not started");
    }

    @AfterThrowing(value = "* com.example.*.*(..)", throwing = "err")
    public void errorExecution(JoinPoint joinPoint, Exception ex) {
        logger.log(Level.SEVERE, joinPoint.getSignature().toString() + " found exception: " + ex.getMessage());
    }
}
