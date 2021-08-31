package Start.Day2;

public class Exercise2 {
    public static void main(String[] args) {
        exercise2();
    }


    //Napisz program w którym użyjesz operatorów ==, !, !=, ++, -=, *=. Na początku masz
    //zadeklarowaną zmienną int x = 0. Podczas pisania programu nie możesz
    //zadeklarować żadnej innej zmiennej, tzn. przez cały czas pisania programu możesz
    //operować tylko na tej jednej zmiennej.
    private static void exercise2() {
        int x = 0;
        System.out.println("x = " + x);
        System.out.println(x == 1);
        System.out.println(!(x == 1));
        System.out.println(x != 1);
        x++;
        System.out.println(x);
        x -= 2;
        System.out.println(x);
        x *= 2;
        System.out.println(x);


    }
}
