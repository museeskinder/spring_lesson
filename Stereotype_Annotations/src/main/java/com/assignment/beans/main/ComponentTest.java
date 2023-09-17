package com.assignment.beans.main;

import com.assignment.beans.Student;
import com.assignment.beans.config.StudentConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    public static void main(String args[]) {
        var context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student contextStudent = context.getBean(Student.class);
        System.out.println("Object instance from component");
        System.out.println("Student name: " + contextStudent.getName());
        System.out.println("Student department: " + contextStudent.getDepartment());
        System.out.println("Student department: " + contextStudent.getDepartment());
        System.out.println("Student date of birth: " + contextStudent.getDob());
    }
}
