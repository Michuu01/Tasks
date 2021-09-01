package Start.Day4;

public class Exercise5 {
    public static void main(String[] args) {
        exercise5();
    }


    //Napisz program, który na ekranie będzie w stanie wydrukować następujący ciąg
    //znaków 39,11,41,8,43,5,45,2,47,-1,49,-4,51,-7,53,-10,55,-13,57,-16 Napisz ten program
    //w taki sposób, żebyś był w stanie podać długość drukowanego ciągu, np 1000.
    //Zauważ, że na końcu ciągu nie ma przecinka, są tylko w środku ;)

    private static void exercise5() {
        long counter = 1000;
        int i = 39;
        int a = 11;
        for (int x = 0; x <= counter; x++) {
            if (x == counter) {
                System.out.print(i + ", " + a);
            } else {
                System.out.print(i + ", " + a + ", ");
            }
            i = i + 2;
            a = a - 3;
        }
    }
}
