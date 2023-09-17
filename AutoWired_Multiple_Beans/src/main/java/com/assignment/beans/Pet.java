package com.assignment.beans;

public class Pet {
    private String name;
    public Pet() {
        System.out.println("Pet bean has been created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
