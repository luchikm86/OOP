package com.mluch.oop.lesson3.hw.MusicApp;

import java.util.Arrays;

public class SongContent {

    private final byte[] content;

    public SongContent(byte[] content) {
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "SongContent{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
