package com.example.implementations;

import com.example.interfaces.Speaker;
import com.example.util.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {
    public String makeSound(Song song) {
        return "Bose speaker is playing " + song.getSongTitle() + " by " + song.getSongArtist();
    }
}
