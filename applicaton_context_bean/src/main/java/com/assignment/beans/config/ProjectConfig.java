package com.assignment.beans.config;

import com.assignment.beans.Microphone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("firstMic")
    Microphone firstMic() {
        Microphone firstMic = new Microphone();
        firstMic.setMicColor("black");
        firstMic.setMicOwner("muse");
        firstMic.setMicSize(3.5);
        return firstMic;
    }

    @Bean("secondMic")
    Microphone secondMic() {
        Microphone secondeMic = new Microphone();
        secondeMic.setMicSize(5.2);
        secondeMic.setMicOwner("lucy");
        secondeMic.setMicColor("red");
        return secondeMic;
    }
}
