package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private IndieMusic indieMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, IndieMusic indieMusic) {
        this.classicalMusic = classicalMusic;
        this.indieMusic = indieMusic;
    }
    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    } 

}
