package com.assignment.implementations;

import com.assignment.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    public String rotate() {
        return "Micheline tyres is rotating";
    }
}
