package org.example.sem.cw.cw5;

import java.util.HashMap;
import java.util.Map;

public class ex4 {
    public static void main(String[] args) {
        //ввод: s = "MCMXCIV"
//        вывод: 1994
//        разбор: M = 1000, CM = 900, XC = 90 and IV = 4.

        Map<Character,Integer> ra = new HashMap<>();
        ra.put('I',1);
        ra.put('V',5);
        ra.put('X',10);
        ra.put('L',50);
        ra.put('C',100);
        ra.put('D',500);
        ra.put('M',1000);

        String s = "MCMXCIV";
        int res =ra.get(s.charAt(s.length()-1));
        res = alg(s, ra, res);
        System.out.println("res = " + res);
    }

    /**
     * @apiNote Написать перевод из Римских цифр в арабские
     * @param s строка символов
     * @param ra мэп с соответствиями римских цифр с арабскими
     * @param res сумма чисел
     * @return результат
     */
    private static int alg(String s, Map<Character, Integer> ra, int res) {
        for (int i = 0; i < s.length()-1; i++) {
            char tekElem = s.charAt(i);
            char nextElem = s.charAt(i+1);
            if(ra.get(tekElem)> ra.get(nextElem)){
                res += ra.get(tekElem);
            }
            else {
                res -= ra.get(tekElem);
            }

        }
        return res;
    }
}
