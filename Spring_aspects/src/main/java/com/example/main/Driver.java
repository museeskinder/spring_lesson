package com.example.main;

import com.example.service.VehicleService;
import com.example.util.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleService.class);
        Song song = new Song();
        song.setSongArtist("Khalid");
        song.setSongTitle("eleven");
        VehicleService vehicleService = context.getBean(VehicleService.class);
        vehicleService.playMusic(true, song);
        vehicleService.moveVehicle(true);
        vehicleService.applyBrake(true);
    }
}
