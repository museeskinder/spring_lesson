package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MicrophoneConfig {
    @Bean("red_mic")
    Microphone redMic() {
        Microphone redMic = new Microphone();
        redMic.setMicColor("red");
        return redMic;
    }

    @Primary
    @Bean(name = "blue_mic")
    Microphone blueMic() {
        Microphone blueMic= new Microphone();
        blueMic.setMicColor("blue");
        return blueMic;
    }
}
