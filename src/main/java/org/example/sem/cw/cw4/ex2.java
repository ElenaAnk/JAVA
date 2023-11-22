package org.example.sem.cw.cw4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        randomAddElementToList(n, linkedList);
        System.out.println("linkedList = " + linkedList);
        int sum = getSum(linkedList);
        System.out.println("sum = " + sum);
    }

    /**
     * @apiNote Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
     * @param linkedList спислк в котором ищем сумму
     * @return сумма четных элементов
     */
    private static int getSum(LinkedList<Integer> linkedList) {
        int sum=0;
        for (Integer elem : linkedList) {
            if(elem%2==0){
                sum+=elem;
            }

        }
        return sum;
    }

    /**
     * @apiNote Список для наполнения списка рандомными значениями
     * @param n размер списка
     * @param linkedList список для наполнения
     */
    private static void randomAddElementToList(int n, LinkedList<Integer> linkedList) {
        for (int i = 0; i < n; i++) {
            linkedList.add(new Random().nextInt(100));
        }
    }
}
