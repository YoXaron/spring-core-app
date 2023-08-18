package com.yoxaron.springcourse.genres;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    public ClassicalMusic() {
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("classicalBean init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("classicalBean destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
