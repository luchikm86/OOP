package com.mluch.oop.lesson1.dynamicarray.hw;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysFromBirthDateCalculator {

    public static void main(String[] args) {
        String birthDate = "2005-05-01";
        System.out.println(daysFromBirthDate(birthDate));

    }

    public static long daysFromBirthDate(String birthDateString) {

        LocalDate birthDate = LocalDate.parse(birthDateString);

        LocalDate dateNow = LocalDate.now();
        return birthDate.until(dateNow, ChronoUnit.DAYS);
    }

}

// 2005-05-01 -> 4686
//1972-12-28 -> 16498