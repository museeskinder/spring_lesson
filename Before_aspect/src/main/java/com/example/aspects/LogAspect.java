package com.example.aspects;

import com.example.services.VehicleService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Component
@Aspect
public class LogAspect {
    Logger logger = Logger.getLogger(LogAspect.class.getName());
    @Around("execute(* com.example.*.*(..)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " Method execution started");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant end = Instant.now();
        logger.info(joinPoint.getSignature().toString() + " Method execution ended");
        var duration = Duration.between(start,end).toMillis();
        logger.info(joinPoint.getSignature().toString() + "Time took to perform method execution: " + duration) ;
    }
}
