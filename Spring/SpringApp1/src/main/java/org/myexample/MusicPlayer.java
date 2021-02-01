package org.myexample;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void playMusic() {
        // playing music
        System.out.println("Playing... - " + music.getSong());
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing from list: " + music.getSong());
        }
    }

    public void initMusicPlayer() {
        System.out.println("Initialising MusicPlayer bean");
    }
    public void destroyMusicPlayer() {
        System.out.println("Destroying MusicPlayer bean");
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
