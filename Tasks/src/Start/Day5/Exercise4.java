package Start.Day5;

import java.util.Arrays;
import java.util.Locale;

public class Exercise4 {
    public static void main(String[] args) {
        exercise4();
    }


    //Zamień wszystkie słowa w tablicy tak aby były one w całości napisane z wielkiej
    //litery, natomiast reszta literek była już małą literą. Postaraj się nie tworzyć żadnych
    //nowych tablic oprócz tej, która zawiera dane wejściowe.

    private static void exercise4() {
        String[] s = {"MAciEk", "mIChal", "anna" };

        for (int i = 0; i < s.length; i++) {
            String a = s[i].toLowerCase();
            a = a.replaceFirst(String.valueOf(a.charAt(0)),
                    String.valueOf(a.charAt(0)).toUpperCase());
            s[i] = a;
        }
        System.out.println(Arrays.toString(s));

    }

}
