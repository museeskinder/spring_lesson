package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MicrophoneConfig.class);
        Microphone callingDefault = context.getBean(Microphone.class);
        System.out.println("Calling default bean: " + callingDefault.getMicColor());
        //calling red microphone passing name
        Microphone redMic = context.getBean("red_mic", Microphone.class);
        System.out.println("Calling red bean: " + redMic.getMicColor());
    }
}
