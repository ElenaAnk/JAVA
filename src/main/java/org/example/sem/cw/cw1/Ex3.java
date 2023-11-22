package org.example.sem.cw.cw1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
//
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println("resault = " + getString(str1));
        scanner.close();
    }

    /**
     *
     * @param str1 Введена строка
     * @return  Поменяли местами две половины строки
     */

    private static String getString(String str1) {
        String s1 = str1.substring(0, str1.length()/2);
        String s2 = str1.substring(str1.length()/2);
        String resault = s2+s1;
        return resault;
    }
}
