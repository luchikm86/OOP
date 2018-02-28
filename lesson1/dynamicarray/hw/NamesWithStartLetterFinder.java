package com.mluch.oop.lesson1.dynamicarray.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class NamesWithStartLetterFinder {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));
        System.out.println(namesWithStartLetter(new ArrayList<>(names), 'A'));


    }

    public static ArrayList<String> namesWithStartLetter(ArrayList<String> names, char startLetter) {
        ArrayList<String> namesWithStartLetter = new ArrayList<>();

        for (String elems : names) {
            if (startLetter == elems.charAt(0)) {
                namesWithStartLetter.add(elems);
            }
        }
        return namesWithStartLetter;
    }

}

//"Phil", "Anny", "Aaron", "Bob" -> [Anny, Aaron]
