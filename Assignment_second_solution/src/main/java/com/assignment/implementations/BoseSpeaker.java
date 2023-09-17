package com.assignment.implementations;

import com.assignment.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {
    public String makeSound() {
       return "Bose speaker is making sound";
    }
}
