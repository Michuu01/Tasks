package Start.Day4;

public class Exercise1 {
    public static void main(String[] args) {
        exercise1();
    }

    //Napisz program liczący silnię.
    private static void exercise1() {
        factorial(6);
        factorial(-3);
        factorial(0);

    }
    private static void factorial(int factorial) {
        if (factorial < 0) {
            System.out.println("invalid");
        } else {
            int result = 1;
            for (int a = 1; a <= factorial; a++) {
                result *= a;
            }
            System.out.println(result);
        }
    }
}
