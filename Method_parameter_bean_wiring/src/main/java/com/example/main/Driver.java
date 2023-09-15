package com.example.main;

import com.example.beans.Person;
import com.example.beans.Pet;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Pet pet = context.getBean(Pet.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person according to spring-context: " + person.getName());
        System.out.println("Pet according to spring-context: " + pet.getName());
        System.out.println("Pet person is owning: " + person.getPet());
    }
}
