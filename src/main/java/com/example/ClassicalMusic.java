package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalSongs = new ArrayList<>();

    public ClassicalMusic() {
        classicalSongs.add("Hungarian Rhapsody");
        classicalSongs.add("Moonlight Sonata");
        classicalSongs.add("Fur Elise");
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public List<String> getSong() {
        return classicalSongs;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing destruction");
    }

}
