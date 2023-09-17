package com.assignment.beans.driver;

import com.assignment.beans.Microphone;
import com.assignment.beans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {

        Microphone nonSpringMic = new Microphone();
        nonSpringMic.setMicColor("Yellow");
        nonSpringMic.setMicOwner("unknown");
        nonSpringMic.setMicSize(0.2);
        System.out.println("Microphone out of spring bean context is: " + nonSpringMic.getMicOwner());

        //getting mic from spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Microphone firstMic = context.getBean("firstMic", Microphone.class);
        Microphone secondMic = context.getBean("secondMic", Microphone.class);
        System.out.println("First Microphone color in spring bean context is: " + firstMic.getMicColor());
        System.out.println("Second Microphone color in spring bean context is: " + secondMic.getMicColor());
    }
}
