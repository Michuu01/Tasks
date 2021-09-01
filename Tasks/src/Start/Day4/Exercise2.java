package Start.Day4;

public class Exercise2 {
    public static void main(String[] args) {
        exercise2();
    }


    //Napisz program, który określi czy podane słowo jest palindromem

    private static void exercise2() {
        String s = "Zakopane na pokaz";


        for (int a = 1; a < s.length() / 2; a++) {
            if (s.charAt(a) != s.charAt(s.length() - a - 1)) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
            break;
        }
    }
}
