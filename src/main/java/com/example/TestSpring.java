package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music1 = context.getBean("indieMusic", Music.class);
        MusicPlayer indieMusicPlayer = new MusicPlayer(music1);
        indieMusicPlayer.playMusic();

        context.close();
    }
}
