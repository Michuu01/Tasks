package Start.Day6.Exercise3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exercise3();
    }


//Napisz klasę Square reprezentującej kwadrat, w której zawrzesz 2 konstruktory, jeden domyślny, gdzie bok kwadratu będzie wynosił 5. Drugi, w którym
//użytkownik może określić tę wartość. Do tego dodaj getter oraz setter. Pamiętaj o enkapsulacji. Dodaj metodę liczącą obwód i metodę liczącą pole
//kwadratu. Nadpisz metodę equals. Nadpisz metodę toString. Użyj następnie tej klasy, aby stworzyć kilka kwadratów o różnych bokach i umieścić je w
//tablicy. Dodaj parę zduplikowanych kwadratów.
//Następnie wykorzystując algorytm do usuwania duplikatów, (Algorytm
//zakładał sortowanie elementów, załóż, że porównywać kwadraty, który jest większy, a który mniejszy będziemy po jego polu powierzchni).

    private static void exercise3() {
        Square s1 = new Square();
        Square s2 = new Square(5);
        Square s3 = new Square(3);
        Square s4 = new Square(43);
        Square s5 = new Square(9);
        Square s6 = new Square(7);

        Square[] squares = new Square[6];
        squares[0] = s1;
        squares[1] = s2;
        squares[2] = s3;
        squares[3] = s4;
        squares[4] = s5;
        squares[5] = s6;

        Square[] duplicate = duplicate(squares);
        System.out.println(Arrays.toString(duplicate));
    }

    private static Square[] duplicate(Square[] array) {


        sort(array);
        int sizeOfNoneDuplicate = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
                sizeOfNoneDuplicate++;
            }
        }

        Square[] temp = new Square[sizeOfNoneDuplicate];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
                temp[j++] = array[i];
            }
        }
        temp[j] = array[array.length - 1];
        return temp;
    }

    private static void sort(final Square[] array) {
        Square temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].area() > array[j].area()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

}
