package com.assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    private final Tyres tyres;
    private final Speaker speaker;

    @Autowired
    public VehicleService(Tyres tyres, Speaker speaker) {
        System.out.println("VehicleService bean is created");
        this.tyres = tyres;
        this.speaker = speaker;
    }

    public void getTyres() {
        tyres.rotate();
    }

    public void getSpeaker() {
        speaker.makeSound();
    }
}
