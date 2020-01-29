package com.example.working.with.db;

import com.example.working.with.db.model.Artist;
import com.example.working.with.db.model.ArtistSong;
import com.example.working.with.db.model.MyDataSource;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyDataSource dataSource = new MyDataSource();

        if (!dataSource.open()) {
            System.out.println("Can't open MyDataSource");
            return;
        }

        List<Artist> artists = dataSource.queryArtists(MyDataSource.ORDER_BY_ASC);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist =
                dataSource.queryAlbumsForArtist("ZZ Top", MyDataSource.ORDER_BY_ASC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        List<ArtistSong> artistSongs =
                dataSource.queryArtistsBySong("The Unforgiven", MyDataSource.ORDER_BY_ASC);

        if (artistSongs == null) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for (ArtistSong artist : artistSongs) {
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }

        dataSource.close();
    }
}