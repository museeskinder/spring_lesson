package com.example.main;

import com.example.ProjectConfig.ProjectConfig;
import com.example.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before fetching bean from the context");
        Person person = context.getBean(Person.class);
        System.out.println("after fetching bean from the context");
    }

}
