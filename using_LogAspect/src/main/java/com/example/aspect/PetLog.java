package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class PetLog {
    Logger logger = Logger.getLogger(PetLog.class.getName());

    @Around("execution(* com.example.service.*.*(..))")
    public void logPet(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + "Method execution started");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant end = Instant.now();
        logger.info(joinPoint.getSignature().toString() + "Method execution ended");
        Long duration = Duration.between(start, end).toMillis();
        logger.info(duration + " took to execute the method");
    }
}
