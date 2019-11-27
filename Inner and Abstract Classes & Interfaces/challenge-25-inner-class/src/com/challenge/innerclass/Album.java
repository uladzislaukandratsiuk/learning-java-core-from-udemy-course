package com.challenge.innerclass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String title;
    private String artist;
    private SongList songList;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        songList = new SongList();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public boolean addSongToAlbum(String songTitle, double songDuration) {
        return this.songList.add(new Song(songTitle, songDuration));
    }

    public boolean addSongToPlayList(String songTitle, LinkedList<Song> playList) {
        Song existingSong = this.songList.findSong(songTitle);
        if (existingSong != null) {
            playList.add(existingSong);
            return true;
        }
        return false;
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (this.songs.contains(song)) {
                return false;
            } else {
                this.songs.add(song);
                return true;
            }
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

}
