package Start.Day1;

public class Exercise6 {
    public static void main(String[] args) {
        exercise5();
    }


    //Napisz program, który z podanego Stringa o długości dłuższej niż 10 znaków, wytnie
    //string od indeksu 3 o długości 5 znaków. Czyli np. dla stringa
    //"SomeStringLongerThan10Signs" otrzymamy “eStri”
    private static void exercise5() {

        String s1 = "SomeStringLongerThan10Signs";

        if (s1.length() > 10) {

            System.out.println(s1.substring(3, 8));

        } else {
            System.out.println(s1 + " = StringLongerLessThan10Signs");
        }


    }
}
