package com.yoxaron.springcourse;

import org.springframework.stereotype.Component;

@Component("computerBean")
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic(Genre.ROCK);
    }
}
