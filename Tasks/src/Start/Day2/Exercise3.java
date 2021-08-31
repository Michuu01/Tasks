package Start.Day2;

public class Exercise3 {
    public static void main(String[] args) {
        exercise3();
    }


    //Napisz program, w którym zaczynając od zmiennej byte x = 0, będziesz mógł
    //otrzymać int, long, float oraz double stosując promocję numeryczną.

    private static void exercise3() {
byte x = 0;
int i = x + 1;
long l = i + 2L;
float f = l +3.4f;
double d = f+4.5;
        System.out.println(d);



    }
}

