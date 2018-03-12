package com.mluch.oop.lesson3.hw.MusicApp;

import java.util.ArrayList;

public class Playlist {

    private final String title;
    private final ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        checkArrayList(songs);
        return title;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public long getTotalLength() {
        checkArrayList(songs);
        long total = 0;
        for (Song song : songs) {
            total += song.getLength();
        }
        return total;
    }

    public ArrayList<Song> findByTitlePart(String title) {
        checkArrayList(songs);
        ArrayList<Song> findByTitlePart = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                findByTitlePart.add(song);
            }
        }
        return findByTitlePart;
    }


    public ArrayList<Song> findByAuthor(String author) {
        checkArrayList(songs);
        ArrayList<Song> findAuthor = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAuthor().equalsIgnoreCase(author)) {
                findAuthor.add(song);
            }
        }
        return findAuthor;
    }

    public void checkArrayList(ArrayList<Song> song) {
        if (song.isEmpty()) {
            throw new IllegalStateException("Playlist is empty");
        }
    }


    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                '}';
    }
}
