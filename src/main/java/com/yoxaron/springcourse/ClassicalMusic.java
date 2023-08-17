package com.yoxaron.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("classicalBean")
public class ClassicalMusic implements Music {
    List<String> songs = null;


    public ClassicalMusic() {
        if (songs == null) {
            songs = new ArrayList<>();
            songs.add("Mozart - Eine kleine Nachtmusik");
            songs.add("Liszt - Consolation No. 3");
            songs.add("Beethoven - Symphony No. 5");
        }
    }


    @Override
    public String getSong() {
        Random random = new Random();
        int index = random.nextInt(songs.size());
        return songs.get(index);
    }
}
