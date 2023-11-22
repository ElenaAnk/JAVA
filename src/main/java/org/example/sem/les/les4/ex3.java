package org.example.sem.les.les4;

import java.util.ArrayDeque;
import java.util.Deque;

public class ex3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.addFirst(11); deque.addLast(22);
        System.out.println(deque);
        deque.removeFirst(); deque.removeLast();
        System.out.println(deque);
        deque.offerFirst(33); deque.offerLast(44);
        deque.offerFirst(888); deque.offerLast(999);
        System.out.println(deque);
        deque.pollFirst(); deque.pollLast();
        System.out.println(deque);
        deque.getFirst(); deque.getLast();
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque);
        deque.peekFirst(); deque.peekLast();
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);
    }
}
