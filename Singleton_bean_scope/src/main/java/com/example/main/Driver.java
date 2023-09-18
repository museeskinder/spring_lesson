package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import com.example.services.PetService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        person.getPet().getPetService().bark();
        PetService petService = context.getBean(PetService.class);
        PetService petService1 = context.getBean("petService", PetService.class);
        System.out.println("Bean hashcode for petService: " + petService.hashCode());
        System.out.println("Bean hashcode for petService1: " + petService1.hashCode());

        if(petService1.hashCode() == petService.hashCode())
            System.out.println("Both references hold one bean instance and they are singleton");
    }
}
