package com.mkhl24;

// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private Songlist songs;
    private String albumName;
    private String artist;


    public Album (String artist, String albumName) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new Songlist();
    }

    public boolean addSong (String songName, double duration) {
        return this.songs.add(new Song(songName, duration));
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album do not have a track " +trackNumber);
        return false;
    }

    public boolean addToPlaylist (String title, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " +title+ " is not in this album");
        return false;
    }

    private class Songlist {

        private ArrayList<Song> songs;

        public Songlist() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }

        private Song findSong (String title) {
            for (Song checkedSong: this.songs) { // == for each
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong (int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }

    }

}
