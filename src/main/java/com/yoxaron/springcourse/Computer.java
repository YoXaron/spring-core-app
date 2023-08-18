package com.yoxaron.springcourse;

import com.yoxaron.springcourse.genres.Genre;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + ": " + musicPlayer.playMusic();
    }
}
