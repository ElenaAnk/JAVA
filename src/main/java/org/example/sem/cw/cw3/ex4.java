package org.example.sem.cw.cw3;
import java.util.*;
import java.util.stream.Collectors;

public class ex4 {
    //Напишите метод, который на вход получает коллекцию объектов,
    // а возвращает коллекцию уже без дубликатов.
    public static void main(String[] args) {
        List<String> col = new ArrayList<> (Arrays.asList("Кукла", "Кукла","Кубик","Машинка","Машинка"));
        List<String> col2 = new ArrayList<>(col.stream().distinct().collect(Collectors.toList()));
        System.out.println(col);
        System.out.println(col2);


        //Collection col =new ArrayList<> (Arrays.asList("Кукла", "Кукла","Кубик","Машинка","Машинка"));
        //System.out.println(col);
        //Collection col2 = new HashSet<>(col);
        //System.out.println(col2);
    }
}
