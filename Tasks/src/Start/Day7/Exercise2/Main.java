package Start.Day7.Exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exercise2();
    }

    /*
        Stwórz enum, który będzie reprezentował możliwe rodzaje tańca (przykładowo 5)
        dostępne w szkole tańca. Każdy z tańców ma mieć tablicę z godzinami (stwórz
        godzinę jako String), o której zajęcia z danego rodzaju tańca są realizowane
        oraz tablicę z dniami w które zajęcia się odbywają (wykorzystaj enuma z
        poprzedniego zadania). Dodaj również alternatywny rodzaj tańca jaki może być
        uczony, jeżeli nauczyciel nie dotrze na czas na zajęcia. Wypisz na ekranie dowolne 2
        z nich, wypisz możliwe godziny, możliwe dni tygodnia oraz zajęcia alternatywne, jeżeli
        nauczyciel nie dotrze na zajęcia. Przykładowy zapis do wydrukowania na ekranie:
        NP: HIPHOP: possible hours: [12:00, 13:30], days: [MONDAY, SUNDAY], alternative: BALLET
    */
    private static void exercise2() {
        Dances hiphop = Dances.HIPHOP;
        System.out.println(hiphop + "; possible hours: " + Arrays.toString(hiphop.getHours()) + ", days: "
                + Arrays.toString(hiphop.getDays()) +
                ", alternative: " + hiphop.getAlternative());
        System.out.println();
        Dances ballet = Dances.BALLET;
        System.out.println(ballet + "; possible hours: " + Arrays.toString(ballet.getHours()) + ", days: "
                + Arrays.toString(ballet.getDays()) +
                ", alternative: " + ballet.getAlternative());

    }
}
