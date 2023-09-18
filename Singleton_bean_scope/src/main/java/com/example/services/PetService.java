package com.example.services;

import com.example.implementations.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class PetService {
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
        System.out.println("PetService bean is created");
    }

    public void bark() {
        String bark = dog.makeNoise();
        System.out.println(bark);
    }
}
