package com.mluch.oop.lesson5.hw.max;

import java.util.Comparator;
import java.util.List;

public class Max{


    static <T> T max(List<T> list, Comparator<T> comparator){
        T max =  list.get(0);
        for (T elem:list) {
            int check = comparator.compare(elem, max);
            if(check>0){
                max = elem;
            }
        }

        return max;
    }
}