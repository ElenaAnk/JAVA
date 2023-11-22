package org.example.sem.cw.cw6;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        //1) Дан массив чисел, посчитать процент уникальных чисел.
        //*процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2));
        Set<Integer> set = new HashSet<>();
        for (Integer elem : array) {
            set.add(elem);
        }
        System.out.println("set = " + set);

//        Set<Integer> set1 = new HashSet<>(array);
//        System.out.println("set1 = " + set1);

        double result = set.size() *100/ array.size();
        System.out.println("result = " + result + " %");

    }
}
