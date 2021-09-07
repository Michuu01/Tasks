package Start.Day6.Exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exercise2();
    }


    // ////Napisz interface Function, w którym zdefiniujesz metodę calculate, która przyjmie jako parametr int i zwróci int. Następnie napisz klasę HalfCalculator,
    //    ////która będzie implementowała ten interface, a metoda calculate będzie dzieliła podany argument na 2. Napisz też klasę QuarterCalculator, która będzie
    //    ////implementowała ten interface, a metoda calculate będzie dzieliła podany argument na 4.
    //    ////Wywołaj tę metodę, stosując polimorfizm, to znaczy, stwórz 2 obiekty, których referencje będą zadeklarowane jako Function

    //Następnie wydrukuj na ekranie wynik dla kilku podanych przykładów. Zrób ponownie to samo, tylko tym razem, zastąp interface Function klasą o tej samej
    //nazwie.

    //Później stwórz tablicę na 10 elementów, gdzie tablica będzie typu Function i dodasz do niej obiekty na przemian HalfCalculator i QuarterCalculator.
    //Przechodząc przez wszystkie elementy tablicy, wywołaj metodę calculate na wyniku poprzednim i dodawaj do siebie kolejne otrzymane wyniki zaczynając
    //od jakiejś dużej liczby, np 12642364. Wynik wydrukuj na ekranie

    private static void exercise2() {

        Function half = new HalfCalculator();
        Function Quarter = new QuarterCalculator();

        System.out.println(half.calculate(16));
        System.out.println(Quarter.calculate(24));

        Function[] functions = new Function[]{
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
        };
        int start = 12642364;
        for (Function function : functions) {
            start = function.calculate(start);
        }
        System.out.println(start);


        FunctionClass[] functionClasses = new FunctionClass[]{
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
        };

        int startClass = 12642364;
        for (FunctionClass functionClass : functionClasses) {
            startClass = functionClass.calculate(startClass);
        }
        System.out.println(startClass);
    }

}
