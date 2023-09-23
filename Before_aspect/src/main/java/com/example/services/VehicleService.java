package com.example.services;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import com.example.util.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        throw new NullPointerException("Couldn't get the song");
    }
    public String moveVehicle(boolean vehicleStarted) {
        return tyre.rotate();
    }
    public String stopVehicle(boolean vehicleStarted) {
        return tyre.stop();
    }
}
