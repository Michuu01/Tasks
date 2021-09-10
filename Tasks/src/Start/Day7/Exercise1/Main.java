package Start.Day7.Exercise1;

public class Main {
    public static void main(String... args) {
        exercise1();
    }


    //Stwórz enum Day, który będzie zawierał dni tygodnia i metody isWorkingDay() oraz
    //boolean isWeekend(). Stwórz również interface WorkingDay, który będzie zawierał
    //metodę isWorkingDay() oraz interfejs Weekend, zawierający metodę isWeekend.
    //Zaimplementuj ten interfejs przy wykorzystaniu enuma Day. Zapewnij, aby każda
    //wartość enuma, miała podaną nazwę skróconą jako swój parametr, czyli
    //MONDAY(MON), TUESDAY(TUE) itp.
    //Zainicjalizuj enum MONDAY na podstawie wartości String.
    //W pętli wypisz wszystkie wartości enuma na ekranie oraz przy każdej z nich wydrukuj
    //czy jest to dzień pracujący czy nie.

    private static void exercise1() {
        Day monday = Day.valueOf("MONDAY");
        System.out.println(monday);
        System.out.println();

        Day[] values = Day.values();
        for (int i = 0; i < values.length; i++) {
            Day day = values[i];

            System.out.println(day + " ('" + day.getShortName() + "') " + "Is working day?: " + day.isWorkingDay() +
                    " is weekend?; " + day.isWeekend());
        }

    }

}
