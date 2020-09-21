package com.mkhl24;

// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private ArrayList<Song> songList;
    private String albumName;
    private String artist;

    public Album (String artist, String albumName) {
        this.albumName = albumName;
        this.artist = artist;
        this.songList = new ArrayList<Song>();
    }

//    private boolean findSong (String name) {
//        Song querySong = new Song(name);
//        if (songList.contains(querySong)) {
//            System.out.println("Song " + name + " found in album.");
//            return true;
//        }
//        return false;
//    }

    private Song findSong (String title) {
        for (Song checkedSong: this.songList) { // == for each
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addSong (String songName, double duration) {
        if (findSong(songName) == null) {
            songList.add(new Song(songName, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber -1;
        if ((index >= 0) && (index <= this.songList.size())) {
            playlist.add(this.songList.get(index));
            return true;
        }
        System.out.println("This album do not have a track " +trackNumber);
        return false;
    }

    public boolean addToPlaylist (String title, LinkedList<Song> playlist) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " +title+ " is not in this album");
        return false;
    }
}
