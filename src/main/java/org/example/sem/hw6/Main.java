package org.example.sem.hw6;

import java.util.*;

import static org.example.sem.hw6.Laptop.*;

public class Main {
    public static void main(String[] args) {
        List<Laptop> array = getLaptops();
        Map<Integer, String> menu = getIntegerStringMap();
        menuSearch(menu, array);
    }
}







