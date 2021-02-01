package org.myexample.springapp2;

import org.myexample.springapp2.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class ClassicalMusic implements Music {

    private List<String> musicList =
            new ArrayList<>();

    public ClassicalMusic() {
    }

    public String getSong() {
        return "Hungarian Rhapsody";
    }

    //    public ClassicalMusic(List<String> musicList) {
//        this.musicList = musicList;
//        musicList.add("Hungarian Rhapsody");
//        musicList.add("Swan Lake");
//        musicList.add("Flight of the Valkyries");
//    }
//
//    public String getSong() {
//        Random random = new Random();
//        return musicList.get(random.nextInt(3));
//    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initializing ClassicalMusic");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroying ClassicalMusic");
    }

}
