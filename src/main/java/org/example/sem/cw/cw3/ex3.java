package org.example.sem.cw.cw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
//        Даны следующие сведения о кубиках: размер каждого кубика
//            (длина ребра в целых сантиметрах),
//            его цвет (красный, желтый, зеленый тд)
//        и материал (деревянный, металлический, картонный и тд.).
//        Найти:
//        - количество кубиков желтого цвета и их суммарный объем;
//        - количество деревянных кубиков с ребром 3 см

        Cube cube1 = new Cube(3,"красный", "деревянный");
        Cube cube2 = new Cube(4,"желтый", "металлический");
        Cube cube3 = new Cube(3,"желтый", "деревянный");
        Cube cube4 = new Cube(3,"синий", "картонный");
        Cube cube5 = new Cube(3,"желтый", "деревянный");

        List<Cube>array=new ArrayList<>(Arrays.asList(cube1,cube2,cube3,cube4,cube5));

        int count =0;
        double volume =0;
        for (Cube cube : array) {
            if (cube.getColor().equals("желтый")){
                count+=1;
                volume += Math.pow(cube.getSize(),3);
            }
        }
        System.out.println("количество кубиков желтого цвета равно " + count +
                ", а их суммарный объем равен "+ volume);

        int sum = 0;
        for (Cube cube : array) {
            if (cube.getMaterial().equals("деревянный")&& cube.getSize()==3) {
                sum+=1;
            }
        }
        System.out.println("количество деревянных кубиков с ребром 3 см равно "+ sum);

    }

}
