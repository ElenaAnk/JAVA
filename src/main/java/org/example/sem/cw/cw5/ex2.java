package org.example.sem.cw.cw5;

import java.util.HashMap;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {

        //int [] arr = {1,2,3,4};
        int [] arr = {1,2,3,3,4};
        Map<Integer,Integer> mapInt = new HashMap<>();
        addElemToMap(arr, mapInt);
        System.out.println(mapInt);
        boolean flag = false;

        flag = checkFilter(mapInt, flag);
        System.out.println(flag);


    }

    /**
     * @apiNote Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
     * В противном случае (false).
     * @param mapInt мэп где указаны элементы и количество встречаемых элементов
     * @param flag в зависимости от нахождения количесва элементов, будет содержать значение true или false
     * @return flag
     */
    private static boolean checkFilter(Map<Integer, Integer> mapInt, boolean flag) {
        for (Map.Entry<Integer, Integer> elem : mapInt.entrySet()) {
            if(elem.getValue()>1){
                flag =true;
            }
        }
        return flag;
    }

    /**
     * @apiNote заполнение мэпа 
     * @param arr массив с начальными данными
     * @param mapInt мэп где указаны элементы и количество встречаемых элементов
     */
    private static void addElemToMap(int[] arr, Map<Integer, Integer> mapInt) {
        for (int i = 0; i < arr.length; i++) {
            mapInt.putIfAbsent(arr[i],0);
            mapInt.put(arr[i], mapInt.get(arr[i])+1);
        }
    }
}
