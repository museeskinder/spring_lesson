package com.assignment.beans.main;

import com.assignment.beans.Course;
import com.assignment.beans.Student;
import com.assignment.beans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Student student = context.getBean(Student.class);
        Course course = context.getBean(Course.class);
        System.out.println("Course according to spring-context: " + course.getCourse());
        System.out.println("Student according to spring-context: " + student.getName());
        System.out.println("Course value wired with student is " + student.getCourse());
    }
}
