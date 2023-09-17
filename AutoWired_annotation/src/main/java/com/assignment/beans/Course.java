package com.assignment.beans;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private String course;

    public Course() {
        System.out.println("Course bean is created");
        course = "global trend";
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
