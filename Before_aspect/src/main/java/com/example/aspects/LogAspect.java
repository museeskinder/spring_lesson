package com.example.aspects;

import com.example.services.VehicleService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Order(2)
@Aspect
public class LogAspect {
    Logger logger = Logger.getLogger(LogAspect.class.getName());
    @Around("execution(* com.example.services.*.*(..)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " Method execution started");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant end = Instant.now();
        logger.info(joinPoint.getSignature().toString() + " Method execution ended");
        var duration = Duration.between(start,end).toMillis();
        logger.info(joinPoint.getSignature().toString() + "Time took to perform method execution: " + duration) ;
    }
    @AfterThrowing(value = "* com.example.services.*.*(..)", throwing = "err")
    public void errorExecution(JoinPoint joinPoint, Exception err) {
        logger.log(Level.SEVERE, joinPoint.getSignature().toString() + " found exception: " + err.getMessage());
    }
}
