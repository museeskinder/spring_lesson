package com.assignment.beans;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDate;
import java.time.Month;

@Component
public class Student {
    private String name;
    private String dept;
    private LocalDate dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @PostConstruct
    public void initialize() {
        name = "muse";
        dept = "computer science";
        dob = LocalDate.of(2002, Month.MAY, 02);
    }
    @PreDestroy
    public void message() {
        System.out.println("object instance destroyed");
    }

}
