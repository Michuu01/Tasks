package Start.Day3;

public class Exercise5 {
    public static void main(String[] args) {
        exercise5(2);
        exercise5(9);
        exercise5(-2);


    }


    //Napisz switch, który policzy dla podanego numeru miesiąca, ile dni minęło od
    //początku roku, do końcowego dnia podanego miesiąca. Załóż, że luty ma 28 dni.

    private static void exercise5(int month) {

        int sum = 0;

        switch (month) {
            case 12:
                sum += 31;
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                sum += 28;
            case 1:
                sum += 31;

        }
        System.out.println(sum);

    }
}
