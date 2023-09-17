package com.assignment.beans.main;

import com.assignment.beans.config.ProjectConfig;
import com.assignment.beans.Person;
import com.assignment.beans.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Pet pet = context.getBean(Pet.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person bean created due to application context: " + person.getName());
        System.out.println("Pet bean created due to application context: " + pet.getName());
        System.out.println("Pet person owns: " + person.getPet());
    }
}
