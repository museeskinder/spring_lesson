package com.assignment.implementations;

import com.assignment.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speaker {
    public String makeSound() {
        return "Sony speaker is making sound";
    }
}
