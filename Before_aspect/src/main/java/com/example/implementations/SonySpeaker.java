package com.example.implementations;

import com.example.interfaces.Speaker;
import com.example.util.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speaker {
    @Override
    public String makeSound(Song song){
        return "Playing " + song.getSongName() + " by " + song.getSongArtist() + " with Sony speakers";
    }
}
