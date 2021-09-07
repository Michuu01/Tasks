package Start.Day5;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Exercise5 {
    public static void main(String[] args) {

        int[] i = {-3, 3, 2, 1, -3, -3, 14, 42, 53, 5, 13, 13};
        int[] array = exercise5(i);
        System.out.println(array[array.length - 2]);


    }

    //Napisz program, który znajdzie druga największą wartość w tablicy.

    private static int[] exercise5(int[] array) {
        sort(array);
        //
        int SizeOfNoDuplicate = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                SizeOfNoDuplicate++;
            }
        }

        int length = array.length;
        int[] temp = new int[SizeOfNoDuplicate];
        int x = 0;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[i++] = array[i];
            }
        }
        temp[x] = array[length - 1];
        return temp;

    }

    private static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}
