package org.example.sem.hw.hw1;

public class Ex3 {
    public static void main(String[] args) {

        char op = '+';
        int a = 3;
        int b =7;
        System.out.println(calculator(op, a, b));
    }

    private static int calculator(char op, int a, int b) {
        int res =0;
        switch (op){
            case '+':
                res = a + b;

                break;
            case '-':
                res = a - b;

                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.println("Некорректный оператор: 'оператор'");
                break;
        }
        return res;

    }

}
