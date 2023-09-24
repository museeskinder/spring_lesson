package com.example.implementation;

import com.example.interfaces.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public String makeNoise() {
        return "The Dog is barking";
    }

    @Override
    public String eat() {
        return "The Dog is eating";
    }
}
