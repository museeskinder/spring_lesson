package com.example.beans;

import com.example.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pet {
    private String name;
    private final PetService petService;

    @Autowired
    public Pet(PetService petService) {
        name = "german_shepherd";
        this.petService = petService;
        System.out.println("Pet bean is created");
    }
    public PetService getPetService() {
        return petService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
