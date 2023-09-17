package com.assignment.implementations;

import com.assignment.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    public String rotate() {
        return "BridgeStoneTyres is rotating";
    }
}
