package com.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggerAspect {
    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());
    @Around("execution(* com.example.service.*.*(..))")
    public  void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + "Method execution is started");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant end = Instant.now();
        var duration = Duration.between(start, end).toMillis();
        logger.info(joinPoint.getSignature().toString() + "Method execution is ended");
        logger.info(duration + " took to execute the method");
    }
}
