package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private final Pet pet;

    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is creatd");
        name = "muse";
        this.pet = pet;
    }
    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
