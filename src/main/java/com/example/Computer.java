package com.example;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.Genre;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";


    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

   @Override
    public String toString() {
    Genre genre = Genre.values()[new Random().nextInt(Genre.values().length)];
    musicPlayer.playMusic(genre);
    return ANSI_GREEN + "Computer " + id + " " + ANSI_RESET;
}

}