package org.myexample.springapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

//    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicType musicType) {
        if (musicType == MusicType.CLASSICAL) {
            return "Playing - " + music1.getSong();
        } else {
            return "Playing - " + music2.getSong();
        }
    }

    public String getName() {
        return name;
    }


    public int getVolume() {
        return volume;
    }
}
