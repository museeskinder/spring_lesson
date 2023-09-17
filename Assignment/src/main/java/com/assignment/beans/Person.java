package com.assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;
    private final Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Person bean is created");
        name = "Muse";
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
