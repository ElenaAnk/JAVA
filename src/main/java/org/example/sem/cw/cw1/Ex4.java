package org.example.sem.cw.cw1;

public class Ex4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1};
        System.out.println("f = " + isF(arr));
    }

    /**
     *
     * @param arr введен массив
     * @return результат
     * @apiNote Дан массив целых чисел, Верно ли, что массив является симметричным
     */
    private static boolean isF(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
