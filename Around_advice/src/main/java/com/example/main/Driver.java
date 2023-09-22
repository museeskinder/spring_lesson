package com.example.main;

import com.example.service.VehicleService;
import com.example.util.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleService.class);
        VehicleService vehicleService = context.getBean(VehicleService.class);
        Song song = new Song();
        song.setName("eleven");
        song.setArtist("khalid");
        String music = vehicleService.playMusic(true, song);
        String start = vehicleService.moveVehicle(true);
        String stop = vehicleService.stopVehicle(true);
    }
}
