package com.example.main;

import com.example.aspects.VehicleStartStopCheck;
import com.example.config.ProjectConfig;
import com.example.services.VehicleService;
import com.example.util.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());

        Song song = new Song();
        song.setSongArtist("khalid");
        song.setSongName("eleven");
        boolean vehicleStarted = true;
        String music = vehicleService.playMusic(vehicleStarted, song);
    }
}
