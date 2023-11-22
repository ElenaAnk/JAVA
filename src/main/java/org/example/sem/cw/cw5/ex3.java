package org.example.sem.cw.cw5;

import java.util.HashMap;
import java.util.Map;

public class ex3 {
    public static void main(String[] args) {
        //Написать перевод из Римских цифр в арабские:
//        ввод: s = "LVIII"
//        вывод: 58
//        разбор: L = 50, V= 5, III = 3.


        Map<Character,Integer> ra = new HashMap<>();
        ra.put('I',1);
        ra.put('V',5);
        ra.put('X',10);
        ra.put('L',50);
        ra.put('C',100);
        ra.put('D',500);
        ra.put('M',1000);
        String s = "LVIII";
        int res =0;
        for (int i = 0; i < s.length(); i++) {
            res+= ra.get(s.charAt(i));
        }
        System.out.println("res = " + res);
    }


    }

