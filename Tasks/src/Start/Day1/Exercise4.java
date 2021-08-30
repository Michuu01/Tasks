package Start.Day1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        exercise4();
    }
//Napisz program, który będzie sprawdzał, czy w podanym zdaniu występuje słowo 'Java'

    private static void exercise4() {
        System.out.println("checking 'Java' or 'java' ");
        Scanner scanner = new Scanner(System.in);
        String check = scanner.nextLine();
        if (check.contains("java") || check.contains("Java")) {
            System.out.println("Presence of the word 'java'");
        } else {
            System.out.println("No java");
        }

    }
}