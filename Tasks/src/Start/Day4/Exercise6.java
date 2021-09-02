package Start.Day4;

public class Exercise6 {
    public static void main(String[] args) {
        exercise5(20);
    }


    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, Napisz program drukujący na ekranie ciąg Fibonacciego. Wydrukuj pierwsze 20
    //znaków ciągu. Znaki ciągu możesz oddzielić spacją.

    private static void exercise5(int counter) {
        int x = 1;
        int z = 0;
        for (int i = 0; i < counter; i++) {
            int temp = x+z;
            x=z;
            z=temp;
            System.out.print(x + " ");
        }


    }
}
