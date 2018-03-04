package com.mluch.oop.lesson2.hw.Rectangle;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        checkRectangle(width,height);
        this.width = width;
        this.height = height;
    }

    public int perimeterCounting() {
        return (width + height) * 2;
    }

    private void checkRectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("negative Rectangle");
        }
    }
    public int areaCounting() {
        return width * height;
    }

}
