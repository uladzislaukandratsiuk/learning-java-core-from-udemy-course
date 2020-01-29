package com.example.working.with.db.model;

public class ArtistSong {

    private String artistName;
    private String albumName;
    private int track;

    public ArtistSong(String artistName, String albumName, int track) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.track = track;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getTrack() {
        return track;
    }
}
