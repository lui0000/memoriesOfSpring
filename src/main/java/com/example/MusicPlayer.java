package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    
    @Autowired
    public MusicPlayer(@Qualifier("jazzMusic") Music music1, @Qualifier("classicalMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    } 

}
