package com.example.implementations;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AdisTyre implements Tyre {
    @Override
    public String rotate(){
        return "Vehicle moving with Michelin tyres";
    }
    @Override
    public String stop() {return "Vehicle moving with Michelin tyres";}
}
