package com.assignment.beans.main;

import com.assignment.beans.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Student xmlBean = context.getBean(Student.class);
        System.out.println("Student bean crated based on xml config: " + xmlBean.getName());
    }
}
