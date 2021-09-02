package Start.Day4;

public class Exercise7 {
    public static void main(String[] args) {
        exercise7('#', 9);
    }

// Napisz program drukujący ciąg znaków jak poniżej. Napisz to tak, żeby liczenie
//doszło do 999. Postaraj się wykorzystać pętle zagnieżdżone, tzn. nie pisz czegoś
//takiego: System.out.println("####);
//111
//####
//####
//####
//####
//222
//####
//####
//####
//####


    private static void exercise7(char a, int counter) {

        for (int i = 0; i <= counter; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i);
            }
            System.out.println();
            for (int x = 0; x < 4; x++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

}

