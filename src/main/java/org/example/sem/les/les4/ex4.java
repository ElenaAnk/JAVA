package org.example.sem.les.les4;

import java.util.Stack;

public class ex4 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack);
        stack.push(12);
        System.out.println(stack);
        stack.push(123);
        System.out.println(stack);
        System.out.println(stack.pop()); // 123
        System.out.println(stack);
        System.out.println(stack.pop()); // 12
        System.out.println(stack);
        System.out.println(stack.pop()); // 1
        System.out.println(stack);
    }
}
