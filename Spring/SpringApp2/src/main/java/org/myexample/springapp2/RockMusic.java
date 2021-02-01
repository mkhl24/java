package org.myexample.springapp2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class RockMusic implements Music{

    private List<String> musicList =
            new ArrayList<>();

    public RockMusic() {
    }

    public String getSong() {
        return "Show must go on";
    }

    //    public RockMusic(List<String> musicList) {
//        this.musicList = musicList;
//        musicList.add("Show must go on");
//        musicList.add("Crazy train");
//        musicList.add("Thunderstruck");
//    }
//
//    public String getSong() {
//        Random random = new Random();
//        return musicList.get(random.nextInt(3));
//    }
}
