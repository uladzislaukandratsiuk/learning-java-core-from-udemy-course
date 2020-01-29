package com.example.working.with.db;

import com.example.working.with.db.model.Artist;
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

        dataSource.close();
    }
}