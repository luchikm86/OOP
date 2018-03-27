package com.mluch.oop.lesson5.hw.max;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}