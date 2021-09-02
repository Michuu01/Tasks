package Start.Day5;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        exercise2(new String[]{"Gdańsk", "Warszawa", "Kalisz"});
    }


    // Napisz program, który odwróci kolejność elementów w tablicy.


    private static void exercise2(String[] d) {
        String[] reversed = new String[d.length];
        System.out.println("original: " + Arrays.asList(d));
        for (int i = 0; i < d.length; i++) {
            reversed[d.length - i - 1] = d[i];
        }
        System.out.println("reversed: " + Arrays.toString(reversed));

    }


}

