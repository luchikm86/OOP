package com.mluch.oop.lesson2.hw.Rectangle;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(30, 40);

        Rectangles rectangleList = new Rectangles();
        rectangleList.addRectangle(rectangle1);
        rectangleList.addRectangle(rectangle2);


        System.out.println("Area first rectangle: " + rectangle1.areaCounting());
        System.out.println("Perimeter first rectangle: " + rectangle1.perimeterCounting());

        System.out.println();

        System.out.println("Area second rectangle: " + rectangle2.areaCounting());
        System.out.println("Perimeter second rectangle: " + rectangle2.perimeterCounting());

        System.out.println();

        System.out.println("Total area of all rectangles: " + rectangleList.sumAreaRectangles());

    }
}
