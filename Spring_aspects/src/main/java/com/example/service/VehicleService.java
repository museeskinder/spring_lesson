package com.example.service;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import com.example.util.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleService {
    @Autowired
    private Speaker speaker;
    private Tyre tyre;

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }

    @Autowired
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    Logger logger = Logger.getLogger(VehicleService.class.getName());
    public String playMusic(boolean vehicleStarted, Song song) {
        Instant start = Instant.now();
        logger.info("method execution started");
        String music = null;
        if(vehicleStarted)
           music = speaker.makeSound(song);
        else
            logger.log(Level.SEVERE, "vehicle is not started to perform the operation");
        Instant end = Instant.now();
        Long duration = Duration.between(start, end).toMillis();
        logger.info(duration + " took to perform execution");
        return music;
    }

    public String moveVehicle(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("method execution started");
        String status = null;
        if(vehicleStarted)
            status = tyre.rotate();
        else
            logger.log(Level.SEVERE, "method couldn't execute");
        Instant end = Instant.now();
        Long duration = Duration.between(start, end).toMillis();
        logger.info(duration + " took to execute the method");
        return status;
    }

    public String applyBrake(boolean vehicleStarted) {
        Instant start = Instant.now();
        logger.info("method execution started");
        String status = null;
        if(vehicleStarted)
            status = tyre.stop();
        else
            logger.log(Level.SEVERE, "method execution couldn't start");
        Instant end = Instant.now();
        logger.info("Method execution is finished");
        Long duration = Duration.between(start, end).toMillis();
        logger.info(duration + " took to execute the method");
        return status;
    }
}
