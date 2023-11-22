package org.example.sem.cw.cw5;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {
        Map<Character,Integer> mapCh = new HashMap<>();
        String str = "qweqweasdq";
        addCharCounterMethod(str, mapCh);
//        for (Map.Entry<Character, Integer> entry : mapCh.entrySet()) {
//            System.out.println(entry.getKey()+ " встретилась: " + entry.getValue() + "раз");
//        }
        System.out.println(mapCh);

         }

    /**
     * @apiNote - Посчитать количество вхождений каждого символа в текст.
     * @param str - исходный текст
     * @param mapCh - мэп с подсичтанными элементами строки
     */
    private static void addCharCounterMethod(String str, Map<Character, Integer> mapCh) {
        for (int i = 0; i < str.length(); i++) {
            Character simbol = str.charAt(i);
            mapCh.putIfAbsent(simbol,0);
            mapCh.put(simbol, mapCh.get(simbol)+1);

//            if (!mapCh.containsKey(simbol)) {
//                mapCh.put(simbol, 1);
//            }
//            else {
//                Integer oldCount = mapCh.get(simbol);
//                mapCh.put(simbol,oldCount+1);
//                }
            }
    }

}


