package com.example.main;

import com.example.beans.Student;
import com.example.config.StudentConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Driver {
    public static void main(String[] args) {
        // generating random num
        Random randNum = new Random();
        int num = randNum.nextInt(10);
        System.out.println("Random number generated: " + num);

        Student firstStudent = new Student();
        firstStudent.setName("Muse");
        Supplier<Student> firstStudSupplier = () -> firstStudent;

        Supplier<Student> secondStudSupplier = () -> {
            Student secondStudent = new Student();
            secondStudent.setName("chala");
            return secondStudent;
        };

        var context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student first, second;
        first = second = null;
        if(num % 2 == 0)
            context.registerBean("first_student", Student.class, firstStudSupplier);
        else
            context.registerBean("second_student", Student.class, secondStudSupplier);

        try {
            first = context.getBean("first_stedent", Student.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("error fetching first student bean");
        }

        try {
            second = context.getBean("second_student", Student.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("error fetching second student bean");
        }

        if(first != null) {
            System.out.println("first student name created: " + first.getName());
        }

        if(second != null) {
            System.out.println("second student name created: " + second.getName());
        }
    }
}

