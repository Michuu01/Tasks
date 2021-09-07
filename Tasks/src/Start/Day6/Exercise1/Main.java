package Start.Day6.Exercise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exercise1();
    }


    //Napisz klasę Book, która będzie posiadała numer ISBN, tytuł oraz autora.
    //Następnie stwórz parę książek dodaj je do tablicy, a następnie stwórz drugą tablicę,
    //która będzie zawierała elementy z tej pierwszej tylko takie, których tytuł zaczyna się na 'H'. Nie pozwól, żeby nowa tablica zawierała null. Zobaczysz to jak
    //ją wydrukujesz.

    private static void exercise1() {

        Book book = new Book(9382734511234L, "Chłopi", "Władysław Reymont");
        Book book1 = new Book(9873216662341L, "Hamlet", "William Shakespeare");
        Book book2 = new Book(1928374653210L, "Wesele", "Stanisław Wyspiański");
        Book book3 = new Book(1230986458882L, "Han Tadeusz", "Adam Mickiewicz");
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        System.out.println(Arrays.toString(books));
        System.out.println();

        int counter = 0;
        for (Book value : books) {
            if (value.getTitle().startsWith("H")) {
                counter++;
            }
        }
        Book[] withH = new Book[counter];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getTitle().startsWith("H")) {
                withH[j] = books[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(withH));

    }
}
