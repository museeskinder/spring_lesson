package com.example.main;

import com.example.beans.Student;
import com.example.config.StudentConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.xml.StaxUtils;

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
