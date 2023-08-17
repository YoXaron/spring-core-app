package com.yoxaron.springcourse;

import org.springframework.stereotype.Component;

@Component("classicalBean")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("ClassicalMusic bean initialization");
    }

    public void destroy() {
        System.out.println("ClassicalMusic bean destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
