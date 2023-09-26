package com.example.main;

import com.example.config.ProjectConfig;
import com.example.service.PetService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        PetService petService = context.getBean(PetService.class);
        System.out.println(petService.getClass());
        boolean animalWake = false;
        String petStatus = petService.feed(animalWake);
    }
}