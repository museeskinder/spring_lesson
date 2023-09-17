package com.assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("person_bean")
public class Person {
    private String name;
    private final Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle) {
       System.out.println("Person bean is created");
       this.vehicle = vehicle;
       name = "Muse";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
