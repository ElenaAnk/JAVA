package org.example.sem.cw.cw4;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> IntegerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            IntegerLinkedList.add(i);
        }
        scanner.close();
        System.out.println("IntegerLinkedList.peek() = " + IntegerLinkedList.peek());//показать первый элемент
        System.out.println("IntegerLinkedList = " + IntegerLinkedList);
        System.out.println("IntegerLinkedList.pop() = " + IntegerLinkedList.pop()); //удалить первый элемент
        System.out.println("IntegerLinkedList = " + IntegerLinkedList);
        IntegerLinkedList.push(3); //добавить в начало
        IntegerLinkedList.addFirst(5); //добавить в начало
        IntegerLinkedList.addLast(5); //добавить в конец
        System.out.println("IntegerLinkedList = " + IntegerLinkedList);
        IntegerLinkedList.set(3, 112233); // заменить 3 элемент на 112233
        System.out.println("IntegerLinkedList = " + IntegerLinkedList);
        System.out.println("IntegerLinkedList.contains(3) = " + IntegerLinkedList.contains(3)); //узнать есть ли такое значение элемента
        IntegerLinkedList.remove((Integer) 112233); //конкретное значение элемента
        System.out.println("IntegerLinkedList = " + IntegerLinkedList);
        Collections.reverse(IntegerLinkedList); //развернуть список
        System.out.println("IntegerLinkedList = " + IntegerLinkedList);



    }
}
