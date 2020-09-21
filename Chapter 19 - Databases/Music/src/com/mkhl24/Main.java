package com.mkhl24;

import com.mkhl24.model.Artist;
import com.mkhl24.model.Datasource;
import com.mkhl24.model.Song;
import com.mkhl24.model.SongArtist;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists(5);
        if (artists == null) {
            System.out.println("No artists");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID: " + artist.getId() + ", Name: " + artist.getName());
        }

        System.out.println(" ----------- ");
        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Pink Floyd", Datasource.ORDER_BY_DESC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }

//        List<SongArtist> songArtists = datasource.queryArtistForSong("Heartless", Datasource.ORDER_BY_ASC);
//        List<SongArtist> songArtists = datasource.queryArtistForSong("She's On Fire", Datasource.ORDER_BY_ASC);
        List<SongArtist> songArtists = datasource.queryArtistForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);

        if (songArtists == null) {
            System.out.println("Couldn't find artist for song");
        }

        for (SongArtist artist : songArtists) {
            System.out.println("Artist: " + artist.getArtistName() +
                    ", Album: " + artist.getAlbumName() +
                    ", Track: " + artist.getTrack());
        }

        datasource.querySongsMetadata();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        datasource.createViewForSongArtist();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title: ");
        String title = scanner.nextLine();

        songArtists = datasource.querySongInfoView(title);

        if(songArtists.isEmpty()) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for(SongArtist artist : songArtists) {
            System.out.println("FROM VIEW - Artist: " + artist.getArtistName() +
                    ", Album: " + artist.getAlbumName() +
                    ", Track: " + artist.getTrack());
        }

        datasource.insertSong("Touch of Grey", "Grateful Dead", "In The Dark", 1);
        datasource.insertSong("Like A Rolling Stone", "Bob Dylan", "Bob Dylan Greatest Hits", 5);

        datasource.close();
    }
}




