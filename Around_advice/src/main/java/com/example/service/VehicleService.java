package com.example.service;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import com.example.util.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleService {
    Logger logger = Logger.getLogger(VehicleService.class.getName());
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

    public VehicleService() {
        System.out.println("VehicleService bean is created");
    }

    public String playMusic(boolean vehicleStarted, Song song) {
        String music = null;
        if(vehicleStarted)
            music = speaker.makeSound(song);
        else
            logger.log(Level.SEVERE, "couldn't start method execution");
        return music;
    }
    public String moveVehicle(boolean vehicleStarted) {
        String status = null;
        if(vehicleStarted)
            status = tyre.rotate();
        else
            logger.log(Level.SEVERE, "couldn't start method execution");
        return status;
    }
    public String stopVehicle(boolean vehicleStarted) {
        String status = null;
        if(vehicleStarted)
            status = tyre.stop();
        else
            logger.log(Level.SEVERE, "couldn't start method execution");
        return status;
    }
}
