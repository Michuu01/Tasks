package Start.Day3;

public class Exercise1 {
    public static void main(String[] args) {
        exercise();
    }


    //Napisz program sprawdzający, czy podany rok jest przestępny i na ekranie wydrukuj YES lub NO
    private static void exercise() {
        long year = 2024;
        if (year < 0) {
            System.out.println("data invalid");
        } else {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }
}
