package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyre implements Tyre {
    @Override
    public String rotate() {
        return "Vehicle is moving by michelin tyre";
    }

    @Override
    public String stop() {
        return "Vehicle is stopping by michelin tyre";
    }
}
