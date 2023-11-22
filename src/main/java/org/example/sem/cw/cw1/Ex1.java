package org.example.sem.cw.cw1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        System.out.println("Введите чило");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("resault = " + resaultMethod(n));
    }

    /**
     * @param n входящее число
     * @return произведение минус сумма
     * @apiNote медот предназначен для расчета произведения минус суммы разряда числа
     */


    private static int resaultMethod(int n) {
        int pr = 1;
        int sum = 0;

        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;
        }

        int resault = pr - sum;
        return resault;
    }
}

