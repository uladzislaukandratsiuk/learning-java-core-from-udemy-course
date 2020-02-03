package com.example.jdbc.with.gui.sample.model;

public class Album {

    private int id;
    private String name;
    private int artistId;

    public Album(int id, String name, int artistId) {
        this.id = id;
        this.name = name;
        this.artistId = artistId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getArtistId() {
        return artistId;
    }
}
