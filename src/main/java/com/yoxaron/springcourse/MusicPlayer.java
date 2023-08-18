package com.yoxaron.springcourse;

import com.yoxaron.springcourse.genres.Genre;
import com.yoxaron.springcourse.genres.Music;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("musicPlayer")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    List<Music> genres;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public String playMusic() {
        Random random = new Random();
        int randomIndex = random.nextInt(genres.size());
        return "Playing: " + genres.get(randomIndex).getSong() + " with volume " + volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
