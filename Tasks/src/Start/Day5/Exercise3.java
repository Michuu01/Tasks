package Start.Day5;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        exercise3();
    }


    private static void exercise3() {
        // Napisz program, który porówna ze sobą zawartość dwóch tablic i wydrukuje na
        //ekranie, czy zawartość jest taka sama. Kolejność wejściowa elementów nie ma
        //znaczenia. Liczy się tylko zawartość,
        //np. [2, 6, 1, 12] == [12, 6, 1, 2] ale [2, 6, 1, 12] != [12, 6, 1, 3]

        int[] i = {1, 3, 6, 9};
        int[] j = {9, 1, 6, 3};
        Arrays.sort(i);
        Arrays.sort(j);

        if (Arrays.equals(i, j)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
