package com.example.implementations;

import com.example.interfaces.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    public String makeNoise() {
        return "The dog is barking";
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }
}
