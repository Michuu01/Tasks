package Start.Day3;

public class Exercise4 {
    public static void main(String[] args) {
        exercise();
    }


    //Napisz program, który na podstawie podanego numeru miesiąca, wydrukuje ile w
    //takim miesiącu mamy dni. W przypadku podania złej liczby, wydrukuje "Nie ma
    //takiego miesiąca". Użyj switch.

    private static void exercise() {
        int month = 9;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28/29");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
