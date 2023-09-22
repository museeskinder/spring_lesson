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
        String music = vehicleService.playMusic(true, song);
        String move = vehicleService.moveVehicle(true);
        String stop = vehicleService.applyBrake(true);
    }
}
