package Start.Day5;

public class Exercise1 {
    public static void main(String[] args) {
        exercise1();
    }



    //Napisz program, który odwróci zawartość Stringa tyłem do przodu

    private static void exercise1() {
        String c = "Zdanie od tyłu";
        for(int j = c.length() - 1; j >= 0; j--){
            char d = c.charAt(j);
            System.out.print(d);


        }

        }



    }

