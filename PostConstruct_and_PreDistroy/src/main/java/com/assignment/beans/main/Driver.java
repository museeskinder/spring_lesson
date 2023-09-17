package com.assignment.beans.main;

import com.assignment.beans.Student;
import com.assignment.beans.config.StudentConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student contextStud = context.getBean(Student.class);
        System.out.println("Student name: " + contextStud.getName());
        System.out.println("Student department: " + contextStud.getDept());
        System.out.println("Student date of birth: " + contextStud.getDob());
        context.close();
    }
}
