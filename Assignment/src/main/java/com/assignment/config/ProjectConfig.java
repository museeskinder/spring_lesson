package com.assignment.config;

import com.assignment.beans.Speaker;
import com.assignment.beans.Tyres;
import com.assignment.beans.Vehicle;
import com.assignment.beans.VehicleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {
    @Bean
    Speaker SonySpeakers() {
        Speaker speaker = new Speaker() {
            @Override
            public void makeSound() {
                System.out.println("Sony Speaker is making sound");
            }
        };
        return speaker;
    }
    @Bean
    @Primary
    Speaker BoseSpeaker() {
        Speaker speaker = new Speaker() {
            @Override
            public void makeSound() {
                System.out.println("Bose Speaker is making sound");
            }
        };
        return speaker;
    }
    @Bean
    Tyres BridgeStoneTyres() {
       Tyres tyres = new Tyres() {
           @Override
           public void rotate() {
               System.out.println("Bridgestonestyres is roatating");
           }
       };
       return tyres;
    }
    @Bean
    @Primary
    Tyres MichelinTyres() {
        Tyres tyres = new Tyres() {
            @Override
            public void rotate() {
                System.out.println("MichelinTyres is roatating");
            }
        };
        return tyres;
    }
    @Bean
    VehicleService vehicleService(Tyres tyres, Speaker speaker) {
        VehicleService vehicleService = new VehicleService(tyres, speaker);
        return vehicleService;
    }
    @Bean
    Vehicle vehicle(VehicleService vehicleService) {
        Vehicle vehicle = new Vehicle(vehicleService);
        return vehicle;
    }
}
