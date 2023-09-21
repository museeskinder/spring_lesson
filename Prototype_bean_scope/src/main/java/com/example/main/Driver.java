package com.example.main;

import com.example.beans.Pet;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before fetching the bean");
        Pet pet = context.getBean(Pet.class);
        Pet pet1 = context.getBean(Pet.class);
        System.out.println("first bean: " + pet.hashCode());
        System.out.println("second bean: " + pet1.hashCode());

        if(pet != pet1)
            System.out.println("The two bean instances are not the same");
        /* since prototype bean instantiation is used on both beans the application
            will not create beans on the startup. */
    }
}
