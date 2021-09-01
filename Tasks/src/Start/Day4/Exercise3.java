package Start.Day4;

public class Exercise3 {
    public static void main(String args[]) {
        exercise3(35, '@');
    }

    //Napisz program, który na ekranie wydrukuje choinkę z podanych przez Ciebie znaków
    //przy czym parametrem wejściowym jest ilość znaków w podstawie. Do tego, żeby to
    //wyglądało jak choinka, to w każdym kolejnym rzędzie idąc z dołu do góry musi być o
    //2 znaki mniej niż w rzędzie poprzednim. Do tego załóż, że jak w podstawie jest liczba
    //parzysta, to na samej górze zostają 2 znaki, a jak nieparzysta to jeden.

    private static void exercise3(int base, char a) {

        int numberOfStarsAtTheTop = base % 2 == 0 ? 2 : 1;

        int height = 0;
        for (int i = base; i > 0; i = i - 2) {
            height++;
        }
        int numberOfStarsInARows = numberOfStarsAtTheTop;
        for (int x = 0; x < height; x++) {
            int b = (base - numberOfStarsInARows) / 2;
            for (int column = 0; column < base - b; column++) {
                System.out.print(column < b ? " " : a);
            }
            numberOfStarsInARows = numberOfStarsInARows + 2;
            System.out.println();
        }
        System.out.println();


    }
}