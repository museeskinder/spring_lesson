package com.example.service;

import com.example.interfaces.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetService {
    @Autowired
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public PetService() {
        System.out.println("PetService bean has been created");
    }

    public String feed(boolean animalWakeU) {
        return animal.eat();
    }
}
