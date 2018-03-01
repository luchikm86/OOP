package com.mluch.oop.lesson1.dynamicarray.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestNameFinder {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Richard", "Chris"));
        System.out.println(longestName(names));

    }

    public static String longestName(ArrayList<String> name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("negative size: " + name.size());
        }
        String longName = "";
      
        for(String elem: name){
            if(elem.length() > longName.length()){
                longName = elem;
            }
        }
        return longName;
    }
}

//Richard
