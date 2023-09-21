package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyre {
    @Override
    public String rotate() {
        return "Vehicle is moving with michelin tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped moving with michelin tyres";
    }
}
