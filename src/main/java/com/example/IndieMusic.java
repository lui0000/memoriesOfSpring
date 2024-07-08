package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


public class IndieMusic implements Music {
    private List<String> indieSongs = new ArrayList<>();

    public IndieMusic() {
        indieSongs.add("Nara");
        indieSongs.add("Cherry Wine");
        indieSongs.add("Holocene");
    }

    @Override
    public List<String> getSong() {
        return indieSongs;
    }
}
