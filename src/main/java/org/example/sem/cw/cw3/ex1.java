package org.example.sem.cw.cw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //1.	Даны сведения об экспортируемых товарах: указывается
        // наименование товара, страна, экспортирующая товар,
        // и объем поставляемой партии в штуках. Найти страны,
        // которые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.

//        Item item1 = new Item("кружка0", "Россия0", 1000);
//        Item item2 = new Item("кружка1", "Россия1", 100);
//        Item item3 = new Item("кружка2", "Россия2", 10);
//
//        List<Item> array = new ArrayList<>(Arrays.asList(item1,item2,item3);


        List<Item> array = new ArrayList<>(Arrays.asList(
                new Item("кружка0", "Россия0", 1000),
                new Item("кружка1", "Россия1", 100),
                new Item("кружка2", "Россия2", 10)));

//        array.add(item1);
//        array.add(item2);
//        array.add(item3);

        String searchItem = new Scanner(System.in).nextLine();

        List<String> countryList = new ArrayList<>();
        int sumVolume = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getName().equals(searchItem)) {
                countryList.add(array.get(i).getCountry());
                sumVolume += array.get(i).getVolume();
            }
        }

        System.out.println("countryList = " + countryList);
        System.out.println("sumVolume = " + sumVolume);

    }}
