package Start.Day1;

public class Exercise2 {
    public static void main(String[] args) {
        exercise2();
    }

    // Napisz program, który sklei ze sobą 5 dowolnych stringów na 2 pokazane różne
    //sposoby i wydrukuje rezultat na ekranie.
    private static void exercise2() {
        String s1 = "Hello.";
        String s2 = " Have";
        String s3 = " a";
        String s4 = " nice";
        String s5 = " day.";

        String way1 = (s1 + s2 + s3 + s4 + s5);
        System.out.println(way1);

        System.out.println();

        String way2 = (s1.concat(s2).concat(s2).concat(s3).concat(s4).concat(s5));
        System.out.println(way2);


    }
}
