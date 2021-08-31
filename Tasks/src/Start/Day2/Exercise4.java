package Start.Day2;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        exercise4();
    }


    //Napisz metodę, która jako argument przyjmuje liczbę całkowitą i wydrukuje informację czy
    //metoda jest podzielna przed 3, przez 7 oraz przez 3 i 7 jednocześnie

    private static void exercise4() {

        long l = 21;

        if ((l % 3 == 0) && (l % 7 == 0)) {

            System.out.println("podzielna przez 3 i 7 ");
        } else if (l % 3 == 0 && l % 7 != 0) {
            System.out.println("podzielna przez 3 ");

        } else if (l % 3 != 0 && l % 7 == 0){
            System.out.println("podzielna przez 7 " );
        }else {
            System.out.println("nie podzielna ani przez 3 ani 7");
        }

    }
}
