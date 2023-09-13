package com.example.main;

import com.example.beans.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Student xmlBean = context.getBean(Student.class);
        System.out.println("Student bean crated based on xml config: " + xmlBean.getName());
    }
}
