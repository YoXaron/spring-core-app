package com.yoxaron.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalBean") Music music1,
                       @Qualifier("rockBean") Music music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public String playMusic(Genre genre) {
        String song = "";

        switch (genre) {
            case ROCK:
                song = rockMusic.getSong();
                break;
            case CLASSICAL:
                song = classicalMusic.getSong();
                break;
        }

        return "Playing: " + song;
    }
}
