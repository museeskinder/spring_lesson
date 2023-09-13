package com.example.config;

import com.example.beans.Person;
import com.example.beans.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Pet pet() {
        Pet pet = new Pet();
        pet.setName("max_dogi");
        return pet;
    }
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Muse");
        person.setPet(pet());
        return person;
    }
}
