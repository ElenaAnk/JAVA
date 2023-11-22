package org.example.sem.cw.cw6;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        //3) Найти пересечения слов в массивах и указать их общее количество.
        //Пример:
        //Mas1= [“qwe”,”asd”,”qwe”,”x”]
        //Mas2=[“qwe”,”v”]
        //Результат:
        //qwe=3
        List<String> massOne = new ArrayList<>(Arrays.asList("qwe","asd","qwe","x"));
        List<String> massTwo = new ArrayList<>(Arrays.asList("qwe","v","x"));

        Set<String> Mas1 = new HashSet<>(massOne);
        Set<String> Mas2 = new HashSet<>(massTwo);
        Mas1.retainAll(Mas2);


        List<String> massThree = new ArrayList<>(massOne);
        massThree.addAll(massTwo);

        for (String elem : Mas1) {
            int k = 0;
            for (String elemMas : massThree) {
                if(elem.equals(elemMas)){
                    k++;
                }
            }
            System.out.println(elem +"="+k);



        }



    }
}
