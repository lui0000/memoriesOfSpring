package com.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    // private List<Music> music = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;


    public MusicPlayer() {}
    //Ioc
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    } 

    // public void playMusicList() {
    //     for (Music item: music) {
    //         System.out.println("Plaing: " + item.getSong());
    //     }
    // }

}
