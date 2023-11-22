package org.example.sem.cw.cw2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = sc.nextInt();
        System.out.println("res = " + getRes(n, sc));
    }

    /**
     * @apiNote Дан массив целых чисел. Найти количество пар соседних элементов,
     * где первый элемент вдвое больше второго
     * @param n  - размерность массива
     * @param sc - Сканер
     * @return - количество
     */
    private static int getRes(int n, Scanner sc) {
        double [] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i]= sc.nextInt();
        }
        int res =0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]/2==array[i+1]){
                res+=1;
            }
        }
        return res;

    }
}
