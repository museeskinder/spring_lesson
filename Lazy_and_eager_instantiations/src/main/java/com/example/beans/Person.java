package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person {
    private String name;
    private final Pet pet;

    @Autowired
    public Person(Pet pet) {
        System.out.println("pet bean is created");
        this.pet = pet;
        name = "Muse";
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
