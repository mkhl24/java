package com.mkhl24;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> ownedAlbums = new ArrayList<Album>();
        LinkedList<Song> myPlaylist = new LinkedList<Song>();

        Album album = new Album("Caliban", "Not so bad");
//        ovnedAlbums.add(new Album("Caliban", "Not so bad" ));
        album.addSong("Kiss of the Cobra King", 4.32);
        album.addSong("Before Later Becomes Never", 5.20);
        album.addSong("This Oath", 3.40);
        album.addSong("Inferno", 3.55);
        ownedAlbums.add(album);

        album = new Album("Sabaton", "Good as Hell");
        album.addSong("Primo Victoria", 4.32);
        album.addSong("Attero Dominatus", 5.20);
        album.addSong("Screaming Eagles", 3.40);
        album.addSong("Panzer Battalion", 3.55);
        ownedAlbums.add(album);

        ownedAlbums.get(0).addToPlaylist("Kiss of the Cobra King", myPlaylist);
        ownedAlbums.get(0).addToPlaylist("Before Later Becomes Never", myPlaylist);
        ownedAlbums.get(0).addToPlaylist("This Oath", myPlaylist);
        ownedAlbums.get(0).addToPlaylist("Army of the night", myPlaylist); // do not exist
        ownedAlbums.get(0).addToPlaylist(4, myPlaylist);

        ownedAlbums.get(1).addToPlaylist(1, myPlaylist);
        ownedAlbums.get(1).addToPlaylist(2, myPlaylist);
        ownedAlbums.get(1).addToPlaylist(3, myPlaylist);
        ownedAlbums.get(1).addToPlaylist(9, myPlaylist); // no track 9


        activatePlaylist(myPlaylist);
    }

//    private static void addToAlbum (ArrayList<Album> albums ,String albumName, String songName) {
//        for (int i=0; i<albums.size(); i++) {
//            Album queryAlbum = albums.get(i);
//            if (queryAlbum.getAlbumName().equals(albumName)) {
//                queryAlbum.addSongToAlbum(songName);
//                System.out.println("Song '" +songName+ "' added to album / " +albumName);
//            }
//        }
//    }

//    private static void addToPlaylist (LinkedList<Song> playlist,ArrayList<Album> albums, String songName) {
//        ListIterator<Song> songListIterator = playlist.listIterator();
//
//        while (songListIterator.hasNext()) {
//            for (int i=0; i< albums.size(); i++) {
//                Album iteratedAlbum = albums.get(i);
//                System.out.println("Processing album " + albums.get(i).getAlbumName());
//                if (iteratedAlbum.querySong(songName) != null) {
//                    songListIterator.add(iteratedAlbum.querySong(songName));
//                    System.out.println("Song " + iteratedAlbum.querySong(songName).getTitle()+ " added to playlist.");
//                } else {
//                    System.out.println("Album do not contain song with title " + songName);
//                }
//            }
//        }
//    }

    private static void activatePlaylist(LinkedList songs) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        int choice;

        ListIterator<Song> listIterator = songs.listIterator();

        if (songs.isEmpty()) {
            System.out.println("No songs in playlist ");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached firs position");
                        forward = true;
                    }
                    break;

                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Mow replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached the end of the list");
                        }
                    }
                    break;

                case 4:
                    printPlaylist(songs);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (songs.size() > 0) {
                        listIterator.remove();
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                        forward = true;
                    } else if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        forward = false;
                    }
                    break;
            }
        }

    }

    private static void printPlaylist (LinkedList<Song> songs) {
        Iterator<Song> i = songs.iterator();
        System.out.println("=============");
        System.out.println("Playlist");
        while (i.hasNext()) {
            System.out.println(i.next().toString());
        }
        System.out.println("==== End of playlist ====");
    }

    private static void printMenu () {
        System.out.println("");
        System.out.println("Avaliable actions: press\n" +
                "0 - to quit\n" +
                "1 - Skip forward to the next song\n" +
                "2 - Skip backwards to a previous song\n" +
                "3 - Replay the current song\n" +
                "4 - Print list\n" +
                "5 - Print menu\n" +
                "6 - Remove current song");
    }


}
