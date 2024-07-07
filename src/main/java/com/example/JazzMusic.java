package com.example;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "Hit the road jack";
    }
    
    
}
