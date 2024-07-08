package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean 
    public IndieMusic indieMusic() {
         return new IndieMusic();
    }
    @Bean
    public JazzMusic jazz() {
        return new JazzMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), indieMusic(),jazz());
    }
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
