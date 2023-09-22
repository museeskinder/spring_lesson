package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AdisTyre implements Tyre {
    @Override
    public String rotate() {
        return "Vehicle is moving by adis tyre";
    }

    @Override
    public String stop() {
        return "Vehicle is stopping by adis tyre";
    }
}
