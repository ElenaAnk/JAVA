package org.example.sem.cw.cw1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("sum = " + getSum(scanner, n));
    }

    /**
     *
     * @param scanner ввод чисел
     * @param n количество вводимых чисел
     * @return количесво положительных чисел,после которых следует отрицательное число.
     */
    private static int getSum(Scanner scanner, int n) {
        int sum=0;
        int a = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();
            if (a>0 && b<0){
                sum++;
            }
            a=b;
        }
        return sum;
    }
}
