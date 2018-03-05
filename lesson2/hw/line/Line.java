package com.mluch.oop.lesson2.hw.line;

public class Line {
    private final Point startPoint;
    private final Point endPoint;

    public Line(Point startPoint, Point finishPoint) {
        this.startPoint = startPoint;
        this.endPoint = finishPoint;
    }

    public double lineCounting () {
        return Math.sqrt(Math.pow((endPoint.getX() - startPoint.getX()), 2)) +
                (Math.pow((endPoint.getY() - startPoint.getY()), 2));
    }

    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}
