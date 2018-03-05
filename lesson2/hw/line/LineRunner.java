package com.mluch.oop.lesson2.hw.line;

public class LineRunner {

    public static void main(String[] args) {

        Point point1 = new Point(1, 5);
        Point point2 = new Point(3, 10);
        Point point3 = new Point(3.3, 6.6);
        Point point4 = new Point(7, 8.1);

        Line line1 = new Line(point1,point2);
        Line line2 = new Line(point3, point4);

        System.out.println("line1: " + line1.lineCounting());
        System.out.println("line2: " + line2.lineCounting());
        System.out.println();

        Lines longLine = new Lines();
        longLine.addLine(line1);
        longLine.addLine(line2);

        System.out.println("sumAllLine: " + longLine.sumAllLine());
        System.out.println("getLongLine: " + longLine.getLongLine());

    }
}
