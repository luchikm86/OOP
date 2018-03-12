package com.mluch.oop.lesson3.hw.MusicApp;

import java.util.ArrayList;

public class User {
    private final String name;
    private final ArrayList<Playlist> playlists = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createPlaylist(Playlist playlist){
       playlists.add(playlist);
    }

    public Playlist findByTitle(String title) {
        checkArrayList(playlists);
        Playlist findTitle = null;
        for (Playlist playlist : playlists) {
            if (playlist.getTitle().contains(title)) {
                findTitle.equals(title);
            }
        }
        return findTitle;

    }

    public void addSong(String name, Song song) {
        Playlist playlist = new Playlist(name);
        int creatPlaylist = 0;
        for (Playlist elem: playlists) {
            if (elem.getTitle().equals(name)) {
                elem.addSong(song);
                creatPlaylist++;
            }
        }
        if (creatPlaylist == playlists.size()){
            playlist.addSong(song);
            playlists.add(playlist);
        }
    }

    public void checkArrayList(ArrayList<Playlist> playlist) {
        if (playlist.isEmpty()) {
            throw new IllegalStateException("Playlist is empty");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
