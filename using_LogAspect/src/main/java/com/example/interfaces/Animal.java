package com.example.interfaces;

import org.springframework.stereotype.Component;

@Component
public interface Animal {
    public String makeNoise();
    public String eat();
}
