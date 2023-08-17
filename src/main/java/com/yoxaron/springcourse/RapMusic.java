package com.yoxaron.springcourse;

import org.springframework.stereotype.Component;

@Component("rapBean")
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Loose Yourself";
    }
}
