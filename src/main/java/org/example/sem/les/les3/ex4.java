package org.example.sem.les.les3;

import java.util.Arrays;
import java.util.List;

public class ex4 {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
    }
}
