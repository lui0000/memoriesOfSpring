package com.example;

import org.springframework.stereotype.Component;

@Component
public class IndieMusic implements Music{

    @Override
    public String getSong() {
        return "Nara";
    }
    
    
}
