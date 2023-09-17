package com.assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private final Pet pet;

    @Autowired
    public Person(@Qualifier("firstPet") Pet pet) {
        System.out.println("Person bean has been created");
        name = "Muse";
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPet() {
        return pet.getName();
    }
}
