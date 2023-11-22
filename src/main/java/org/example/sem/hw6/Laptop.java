package org.example.sem.hw6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
    private String model ;
    private int ram;
    private int hardDrive;
    private String operSystem;
    private String color;
    private int price;

    /**
     * @apiNote создание базы ноутбуков с параметрами
     * @return массив с параметрами ноутбуков
     */
    public static List<Laptop> getLaptops() {
        Laptop laptop1 = new Laptop("Huawei MateBook",8,512,"Windows","Silver",53000 );
        Laptop laptop2 = new Laptop("Apple MacBook",8,256,"macOS","Silver",95000);
        Laptop laptop3 = new Laptop("HONOR Magicbook",16,512,"Windows","Grey",65000);
        Laptop laptop4 = new Laptop("Lenovo IdeaPad",4,1000,"Windows","black",25000);
        Laptop laptop5 = new Laptop("Tecno T1",16,512,"Linux","Grey",47000);

        return new ArrayList<>(Arrays.asList(laptop1,laptop2,laptop3,laptop4,laptop5));
    }

    /**
     * @apiNote создание меню для выбора пользователем
     * @return меню для выбора интересующих парметров
     */
    public static Map<Integer, String> getIntegerStringMap() {
        Map<Integer,String> menu = new HashMap<>();
        menu.putIfAbsent(1,"ОЗУ");
        menu.putIfAbsent(2,"Объем ЖД");
        menu.putIfAbsent(3,"Операционная система");
        menu.putIfAbsent(4,"Цвет");
        menu.putIfAbsent(5,"Стоимость");
        return menu;
    }

    /**
     * @apiNote фильтр по параметрам ОЗУ
     * @param array вывод подходящих моделей по заданным параметрам
     */
    public static void ramSearch(List<Laptop> array) {
        System.out.println("Введите необходимый размер ОЗУ");
        int a = Integer.parseInt(new Scanner(System.in).nextLine());
        List<String> searchRam = new ArrayList<>();
        for (Laptop laptop : array) {
            if (laptop.getRam() == a) {
                searchRam.add(laptop.getModel());
            }
        }
        System.out.println("подходящие модели по заданным параметрам  = " + searchRam);
    }

    /**
     * @apiNote фильтр по параметрам Объем ЖД
     * @param array вывод подходящих моделей по заданным параметрам
     */
    public static void hardDriveSearch(List<Laptop> array) {
        System.out.println("Введите необходимый Объем ЖД");
        int a = Integer.parseInt(new Scanner(System.in).nextLine());
        List<String> searchHardDrive = new ArrayList<>();
        for (Laptop laptop : array) {
            if (laptop.getHardDrive() == a) {
                searchHardDrive.add(laptop.getModel());
            }
        }
        System.out.println("подходящие модели по заданным параметрам  = " + searchHardDrive);
    }

    /**
     * @apiNote фильтр по названию операционной системы
     * @param array вывод подходящих моделей по заданным параметрам
     */
    public static void operSystemSearch(List<Laptop> array) {
        System.out.println("Введите необходимую операционную систему");
        String a = new Scanner(System.in).nextLine();
        List<String> searchOperaSystem = new ArrayList<>();
        for (Laptop laptop : array) {
            if (a.equalsIgnoreCase(laptop.getOperSystem())) {
                searchOperaSystem.add(laptop.getModel());
            }
        }
        System.out.println("подходящие модели по заданным параметрам  = " + searchOperaSystem);
    }

    /**
     * @apiNote фильтр по цвету ноутбука
     * @param array вывод подходящих моделей по заданным параметрам
     */
    public static void colorSearch(List<Laptop> array) {
        System.out.println("Введите необходимый цвет");
        String a = new Scanner(System.in).nextLine();
        List<String> searchColor = new ArrayList<>();
        for (Laptop laptop : array) {
            if (a.equalsIgnoreCase(laptop.getColor())) {
                searchColor.add(laptop.getModel());
            }
        }
        System.out.println("подходящие модели по заданным параметрам  = " + searchColor);
    }

    /**
     * @apiNote фильтр по стоимости ноутбука
     * @param array вывод подходящих моделей по заданным параметрам
     */
    public static void priceSearch(List<Laptop> array) {
        System.out.println("Введите максимальную стоимость ноутбука");
        int a = Integer.parseInt(new Scanner(System.in).nextLine());
        List<String> searchPrice = new ArrayList<>();
        for (Laptop laptop : array) {
            if (laptop.getPrice() <= a) {
                searchPrice.add(laptop.getModel());
            }
        }
        System.out.println("Модели ноутбуков стоиомостью до "+ a + " = " + searchPrice);
    }

    /**
     * @apiNote обработка введённых пользователем параметров
     * @param menu меню для выбора параметров
     * @param array модели с заданными параметрами
     */
    public static void menuSearch(Map<Integer, String> menu, List<Laptop> array) {
        System.out.println("Введите цифру, соответствующую необходимому критерию:" + menu);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n ==1) ramSearch(array);
        else if(n==2) hardDriveSearch(array);
        else if(n==3) operSystemSearch(array);
        else if(n==4) colorSearch(array);
        else if(n==5) priceSearch(array);
    }

}
