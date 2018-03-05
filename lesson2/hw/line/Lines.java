package com.mluch.oop.lesson2.hw.line;

import java.util.ArrayList;

public class Lines {
    private final ArrayList<Line> lines = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public int sumAllLine() {
        if (lines.isEmpty()) {
            throw new  IllegalArgumentException ("negative lines - Empty");
        }
        int sum = 0;
        for (Line elem: lines) {
            sum += elem.lineCounting();
        }
        return sum;
    }

    public double getLongLine() {
        if (lines.isEmpty()) {
            throw new  IllegalArgumentException ("negative lines - Empty");
        }
        double longLine = 0;
        for (Line line: lines) {
            if (longLine < line.lineCounting()) {
                longLine = line.lineCounting();
            }
        }
        return longLine;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "lines=" + lines +
                '}';
    }
}
