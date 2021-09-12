package Start.Day8.Exercise2;

public class Main {
    public static void main(String[] args) {
        exercise2();
    }

    private static void exercise2() {
        wrapper();
    }

    //Stwórz metodę, która przyjmuje wiek na wejściu. Napisz walidację, która sprawdza
    //czy podany wiek jest większy niż 21, jeżeli nie jest, wyrzuć wyjątek checked.
    //Następnie stwórz kolejną metodę np. wrapper, która w bloku try-catch złapie ten
    //wyjątek i zredeklaruje go jako runtime. Wywołaj metodę wrapper. Zwróć uwagę, że
    //jeżeli wrapowanie w RuntimeException zamieniłbyś na wrapowanie w Exception, to
    //ten nowy wyjątek musiałbyś albo obsłużyć (try-catch), albo zadeklarować, że metoda
    //wrapper go wyrzuci.

    private static void wrapper() {
        Main exercise = new Main();
        try {exercise.AgeValidator(19);
            System.out.println("is ok");
        }catch (MyException e){
throw new RuntimeException(e);
        }
    }
    private void AgeValidator(int i) throws MyException {
        if (i<21){
            throw new MyException("Age is below 21");
        }
    }
}
