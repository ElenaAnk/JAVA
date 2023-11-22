package org.example.sem.cw.cw4;

import java.util.Arrays;
import java.util.LinkedList;

public class ex4 {
    public static void main(String[] args) {
        //Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
        LinkedList<Integer>linkedList=new LinkedList<>(Arrays.asList(1,-2,-3,-4,-5,10,-7,-9));
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i)<0){
                linkedList.remove(i);
                i--;
            }
        }
        System.out.println("linkedList = " + linkedList);
        LinkedList<Integer>linkedListTwo=new LinkedList<>(Arrays.asList(1,-2,-3,-4,-5,10,-7,-9));
        for (int i = linkedListTwo.size()-1; i >=0; i--) {
            if(linkedListTwo.get(i)<0){
                linkedListTwo.remove(i);
            }
            System.out.println("linkedListTwo = " + linkedListTwo);
        }
        System.out.println("linkedListTwo = " + linkedListTwo);
    }
}
