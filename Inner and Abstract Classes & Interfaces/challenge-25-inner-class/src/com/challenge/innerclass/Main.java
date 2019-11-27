package com.challenge.innerclass;

public class Main {

    public static void main(String[] args) {

        Album fistAlbum = new Album("Crystal Castles I", "Crystal Castles");

        fistAlbum.addSongToAlbum("Alice Practise",2.42);
        fistAlbum.addSongToAlbum("Vanished",3.21);
        fistAlbum.addSongToAlbum("Knights",3.53);
        fistAlbum.addSongToAlbum("1991",3.01);

        Album secondAlbum = new Album("Crystal Castles II", "Crystal Castles");

        secondAlbum.addSongToAlbum("Celestica",2.42);
        secondAlbum.addSongToAlbum("Year of silence",2.21);
        secondAlbum.addSongToAlbum("Empathy",2.53);
        secondAlbum.addSongToAlbum("Birds",3.01);

        Playlist playlist = new Playlist("My playlist");

        playlist.addSongInOrderToPlaylist(secondAlbum, "Celestica");
        playlist.addSongInOrderToPlaylist(fistAlbum, "Alice Practise");
        playlist.addSongInOrderToPlaylist(secondAlbum, "Year of silence");
        playlist.addSongInOrderToPlaylist(fistAlbum, "Vanished");
        playlist.addSongInOrderToPlaylist(fistAlbum, "Knights");
        playlist.addSongInOrderToPlaylist(fistAlbum, "1991");
        playlist.addSongInOrderToPlaylist(secondAlbum, "Empathy");
        playlist.addSongInOrderToPlaylist(secondAlbum, "Birds");

        playlist.play();
    }
}
