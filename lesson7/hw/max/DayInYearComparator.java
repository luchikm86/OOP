package com.mluch.oop.lesson5.hw.max;

import java.time.LocalDate;
import java.util.Comparator;


public class DayInYearComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate l1, LocalDate l2) {
        return l1.getDayOfYear() - l2.getDayOfYear();
    }

}