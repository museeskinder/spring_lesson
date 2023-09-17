package com.assignment.beans;

public class Person {
    private String name;
    private Pet pet;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Pet getPet() {
        return pet;
    }

    public Person() {
        System.out.println("Person bean is created.");
    }
}
