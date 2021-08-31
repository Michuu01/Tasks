package Start.Day3;

public class Exercise3 {
    public static void main(String[] args) {
        exercise3();
    }


    //Napisz program, który sprawdzi czy dana liczba calkowita jest parzysta i wydrukuj na ekranie PARZYSTA lub NIEPARZYSTA
    private static void exercise3() {
        long l = 1234569;
        if (l%2==0){
            System.out.println("PARZYSTA");
        }else{
            System.out.println("NIEPARZYSTA");
        }



    }
}
