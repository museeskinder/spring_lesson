package com.example.beans;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;

@Component
public class Student {
    private String name;
    private String department;
    private LocalDate dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    Student () {
        name = "muse";
        department = "computer science";
        dob = LocalDate.of(2002, Month.APRIL, 5);
    }
}
