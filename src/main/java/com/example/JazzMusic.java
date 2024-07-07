package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    private List<String> jazzSongs = new ArrayList<>();

    public JazzMusic() {
        jazzSongs.add("Hit the road jack");
        jazzSongs.add("Summertime");
        jazzSongs.add("Take Five");
    }

    @Override
    public List<String> getSong() {
        return jazzSongs; 
    }
}

