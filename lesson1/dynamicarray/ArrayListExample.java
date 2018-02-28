package com.mluch.oop.lesson1.dynamicarray;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list);
    }

}
