package com.challenge.linked.list;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private String name;
    private LinkedList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    private void printListOfSong() {
        System.out.println("Playlist songs:");
        System.out.println("=========================");
        for (Song song : this.songs) {
            System.out.println(song);
        }
        System.out.println("=========================");
    }

    public boolean addSongInOrderToPlaylist(Album album, String songTitle) {
        ListIterator<Song> songListIterator = this.songs.listIterator();

        while (songListIterator.hasNext()) {
            int comparison = songListIterator.next().getTitle().compareTo(songTitle);
            if (comparison == 0) {
                System.out.println("Song - " + songTitle + " already in playlist");
                return false;
            } else if (comparison > 0) {
                songListIterator.previous();
                album.addSongToPlayList(songTitle, this.songs);
                return true;
            }
        }
        album.addSongToPlayList(songTitle, this.songs);
        return true;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> songListIterator = this.songs.listIterator();

        printListOfSong();

        if (this.songs.isEmpty()) {
            System.out.println("No song in playlist!");
            return;
        } else {
            System.out.println("Now playing: " + songListIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {

                case 0:
                    System.out.println("Playlist is over");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        goingForward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now playing " + songListIterator.next());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing " + songListIterator.previous());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (this.songs.size() > 0) {
                        songListIterator.remove();
                        System.out.println("Song has been removed");
                        if (songListIterator.hasNext()) {
                            System.out.println("Now playing " + songListIterator.next());
                        } else if (songListIterator.hasPrevious()) {
                            System.out.println("Now playing " + songListIterator.previous());
                        }
                    } else {
                        System.out.println("No song in playlist!");
                    }
                    break;

                case 4:
                    printListOfSong();
                    break;

                case 5:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - go to previous song\n" +
                "3 - remove current song\n" +
                "4 - print list of songs\n" +
                "5 - print menu options");
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}
