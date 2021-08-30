package Start.Day1;

public class Exercise5 {
    public static void main(String[] args) {
        exercise5();
    }

    //Napisz program, który porówna 2 stringi w taki sposób żeby wynik
    //"Java".equals("jaVa") zwrócił ‘true’.

    private static void exercise5() {
        String s1 = "Java";
        String s2 = "jaVa";


        System.out.println(s1.equalsIgnoreCase(s2));


    }
}
