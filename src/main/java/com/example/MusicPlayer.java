package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.example.Genre;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private final Music classicalMusic;
    private final Music jazzMusic;
    private final Music indieMusic;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    @Value("${musicPlayer.volume}")
    private int volume;
    @Value("${musicPlayer.name}")
    private String name;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
            @Qualifier("jazzMusic") Music jazzMusic,
            @Qualifier("indieMusic") Music indieMusic) {
        this.classicalMusic = classicalMusic;
        this.jazzMusic = jazzMusic;
        this.indieMusic = indieMusic;
    }
    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void playMusic(Genre genre) {
        List<String> songs;
        switch (genre) {
            case CLASSICAL:
                songs = (List<String>) classicalMusic.getSong();
                break;
            case JAZZ:
                songs = (List<String>) jazzMusic.getSong();
                break;
            case INDIE:
                songs = (List<String>) indieMusic.getSong();
                break;
            default:
                throw new IllegalArgumentException("Invalid genre: " + genre);
        }

        Random random = new Random();
        int randomIndex = random.nextInt(songs.size());
        String randomSong = songs.get(randomIndex);
        System.out.println(ANSI_GREEN + "Playing random song: " + randomSong + ANSI_RESET);
    }
}