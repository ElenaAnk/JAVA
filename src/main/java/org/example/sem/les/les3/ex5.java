package org.example.sem.les.les3;

import java.util.Arrays;
import java.util.List;

public class ex5 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        List<StringBuilder> d = Arrays.asList(day, month, year);
        System.out.println(d); // [28, 9, 1990]
        day = new StringBuilder("18");
        System.out.println(d); // [28, 9, 1990]
        List<StringBuilder> d1 = Arrays.asList(day, month, year);
        System.out.println(d1); // [18, 9, 1990]


    }
}
