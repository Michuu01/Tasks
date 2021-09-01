package Start.Day4;

public class Exercise4 {
    public static void main(String[] args) {
        exercise4();
    }


    //Rafał ma 6 kolorowych mazaków (czerwony, zielony, niebieski, czarny, żółty i
    //brązowy) i rysuje nimi w podanej kolejności kolorów 100 kresek. Wypisz wszystkie
    //kolory w kolejności odpowiadające rysowanym kreskom i zobacz jaki kolor będzie ostatni

    private static void exercise4() {
        for (int x = 1; x <= 100; x++) {
            if (x % 6 == 0) {
                System.out.println("brown");
            }else if( x%6==1){
                System.out.println("red");
            }else if(x%6==2){
                System.out.println("green");
            }else if(x%6==3){
                System.out.println("blue");
            }else if(x%6==4){
                System.out.println("black");
            }else if(x%6==5){
                System.out.println("yellow");
            }
        }

    }
}
