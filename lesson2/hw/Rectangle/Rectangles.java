package com.mluch.oop.lesson2.hw.Rectangle;

import java.util.ArrayList;

public class Rectangles {
    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public int sumAreaRectangles() {
        if (rectangles.isEmpty()) {
            throw new  IllegalArgumentException ("negative rectangles - Empty");
        }
        int sum = 0;
        for (Rectangle elem: rectangles) {
            sum += elem.areaCounting();
        }
        return sum;
    }

}
