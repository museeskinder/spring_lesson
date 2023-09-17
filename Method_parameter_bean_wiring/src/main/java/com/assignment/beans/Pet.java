package com.assignment.beans;

public class Pet {
    private String name;
    public Pet() {
        System.out.println("Pet bean is created!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
