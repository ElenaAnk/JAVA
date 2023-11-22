package org.example.sem.cw.cw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
//                Дан массив объектов:
//                фамилия студента, номер группы, размер стипендии,
//                баллы по 3 предметам.Определить стипендии студентов,
//                фамилии которых заканчиваются на «ова»,при четной сумме баллов.

        Students stud1 = new Students("Петров", 1,5000,Arrays.asList(5,3,3));
        Students stud2 = new Students("Шилова", 2,1000,Arrays.asList(5,3,4));
        Students stud3 = new Students("Ульянова", 2,3000,Arrays.asList(5,3,4));
        Students stud4 = new Students("Иванов", 3,1000,Arrays.asList(4,5,5));
        Students stud5 = new Students("Удалова", 1,6000,Arrays.asList(4,5,4));

        List<Students> array = new ArrayList<>(Arrays.asList(stud1,stud2,stud3,stud4,stud5));

        for (Students students : array) {
            if(students.getSurname().endsWith("ова")&& chetsum(students.getScores())){
                System.out.println(students.getSurname()+" со стипендией "+students.getScholarship());
            }
        }
    }

    private static boolean chetsum(List<Integer> scores) {
        int sum = 0;
        for (Integer element : scores) {
            sum += element;
        }
        if (sum % 2 == 0) {
            return true;
        }
        else return false;
    }
}
