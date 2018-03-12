package com.mluch.oop.lesson3.hw.MusicApp;

import java.util.Arrays;

public class MusicRunner {
    public static void main(String[] args) {

        SongContent content1 = new SongContent(new byte[] {1, 2, 3});

        System.out.println(Arrays.toString(content1.getContent()));

        Song song1 = new Song("Open Your Eyes", "Guano Apes", "Rock", 189, content1);
        Song song2 = new Song("Breathing (Astero Remix)", "Oscar And The Wolf",
                "Deep House", 195, content1);
        Song song3 = new Song("9 PM (Till I Come)", "ATB",
                "Trance, house", 193, content1);

        System.out.println(song1);

        Playlist playlist1 = new Playlist("MyMusic");

        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);

        Playlist playlist2 = new Playlist("MyMusic2");

        playlist2.addSong(song2);
        playlist2.addSong(song3);

        System.out.println(playlist1.toString());
        System.out.println(playlist1.findByAuthor("ATB"));
        System.out.println(playlist2.findByTitlePart("Breathing (Astero Remix)"));

        User user = new User("Max");

        user.createPlaylist(playlist1);
        user.createPlaylist(playlist2);

        user.addSong("MyMusic", song2);
        System.out.println(user.toString());

    }
}
