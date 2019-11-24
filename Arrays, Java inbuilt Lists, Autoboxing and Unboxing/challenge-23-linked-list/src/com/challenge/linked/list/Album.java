package com.challenge.linked.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSongToAlbum(String songTitle, double songDuration) {
        if (findSong(songTitle) != null) {
            return false;
        }
        this.songs.add(new Song(songTitle, songDuration));
        return true;
    }

    public boolean addSongToPlayList(String songTitle, LinkedList<Song> playList) {
        Song existingSong = findSong(songTitle);
        if (existingSong != null) {
            playList.add(existingSong);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song songs : this.songs) {
            if (songs.getTitle().equals(title)) {
                return songs;
            }
        }
        return null;
    }


}
