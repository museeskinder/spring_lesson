package com.example.implementations;

import com.example.interfaces.Speaker;
import com.example.util.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {
    @Override
    public String makeSound(Song song) {
        return "Bose speaker is playing " + song.getName() + " by " + song.getArtist();
    }
}
