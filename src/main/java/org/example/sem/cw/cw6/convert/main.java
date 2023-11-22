package org.example.sem.cw.cw6.convert;

public class main {
    public static void main(String[] args) {
        //4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
        //Кельвины, Фаренгейты. У классов наследников необходимо переопределить
        // метод интерфейса, для валидного перевода величин.
        // Метод для конвертации назовите "convertValue".
        double temperature = 0;
        System.out.println("t Cels =" + new CelsiusConverter().convertValue(temperature));
        System.out.println("t Far =" + new FarConverter().convertValue(temperature));
        System.out.println("t Kel =" + new KelConverter().convertValue(temperature));


    }
}
