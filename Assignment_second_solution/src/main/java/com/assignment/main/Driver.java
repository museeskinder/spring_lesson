package com.assignment.main;

import com.assignment.beans.Person;
import com.assignment.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            String[] persons = context.getBeanNamesForType(Person.class);
            Person person = context.getBean(Person.class);
            person.getVehicle().getVehicleService().playMusic();
            person.getVehicle().getVehicleService().moveVehicle();
            System.out.println(persons[0]);
    }
}
