package com.yoxaron.springcourse;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("rockBean")
public class RockMusic implements Music {
    List<String> songs = null;

    public RockMusic() {
        if (songs == null) {
            songs = new ArrayList<>();
            songs.add("Immigrant Song - Led Zeppelin ");
            songs.add("Great Gig In The Sky - Pink Floyd ");
            songs.add("Angie - The Rolling Stones ");
        }
    }
    @Override
    public String getSong() {
        Random random = new Random();
        int index = random.nextInt(songs.size());
        return songs.get(index);
    }
}
