package org.example.sem.cw.cw2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = sc.nextInt();
        System.out.println("Введите числа: ");
        System.out.println("sum = " + getSum(sc, n));
    }

    /**
     * @apiNote 1) Дана последовательность из N целых чисел.
     * Найти сумму чисел, оканчивающихся на 5,
     * перед которыми идет четное число.
     * @param sc Сканер
     * @param n  Длина последовательности
     * @return   Сумма
     */
    private static int getSum(Scanner sc, int n) {
        int sum =0;
        int a = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int b = sc.nextInt();
            if (b%10==5&&a%2==0){
                sum +=b ;
            }
            a=b;

        }
        return sum;
    }
}
