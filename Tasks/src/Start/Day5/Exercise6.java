package Start.Day5;

public class Exercise6 {
    public static void main(String[] args) {
        exercise6();
    }


    //Napisz program, który w tablicy znajdzie pary których suma wynosi podaną przez Ciebie wartość

    private static void exercise6() {
        int[] array = {-1, 3, 8, 5, 1, 3, 5, 7, 5, 4 - 34, -24};
        findPairs((array), 4);
    }

    private static void findPairs(final int[] array, int equalTo) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (j == i) {
                    break;
                }
                if (array[i] + array[j] == equalTo) {
                    System.out.println("pair equal to " + equalTo + ": " + array[i] + " and " + array[j]);
                }
            }
        }
    }
}

