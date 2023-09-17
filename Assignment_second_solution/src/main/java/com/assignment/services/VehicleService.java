package com.assignment.services;

import com.assignment.interfaces.Speaker;
import com.assignment.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VehicleService {
    @Autowired
    private Speaker speaker;
    private Tyres tyres;

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyres getTyres(Tyres tyres) {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public VehicleService() {
        System.out.println("VehicleService bean is created");
    }

    public void playMusic() {
        String music = speaker.makeSound();
        System.out.println(music);
    }

    public void moveVehicle() {
        String move = tyres.rotate();
        System.out.println(move);
    }
}
