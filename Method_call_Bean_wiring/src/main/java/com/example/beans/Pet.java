package com.example.beans;

public class Pet {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Pet() {
        System.out.println("Pet bean is created.");
    }
}
