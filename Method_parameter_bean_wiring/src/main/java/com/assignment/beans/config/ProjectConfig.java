package com.assignment.beans.config;

import com.assignment.beans.Person;
import com.assignment.beans.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
   @Bean
   Pet pet() {
       Pet pet = new Pet();
       pet.setName("doggi");
       return pet;
   }

   @Bean
   Person person(Pet pet) {
     Person person = new Person();
     person.setPet(pet);
     return person;
   }
}
