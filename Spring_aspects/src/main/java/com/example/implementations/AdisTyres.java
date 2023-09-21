package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class AdisTyres implements Tyre {
    @Override
    public String rotate() {
        return "Vehicle is moving with adis tyres";
    }
    @Override
    public String stop() {
        return "Vehicle is stopped with adis tyres";
    }
}
