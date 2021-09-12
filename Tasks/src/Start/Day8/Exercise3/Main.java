package Start.Day8.Exercise3;

import Start.Day8.Exercise1.MyException;

public class Main {
    public static void main(String[] args) {
        exercise3();
    }


    //Stwórz wyjątek rozszerzający stworzony przez Ciebie wyjątek w ćwiczeniu
    //pierwszym. Stwórz metodę deklarującą wyrzucenie Exception, ale go z niej nie
    //wyrzucaj. Następnie obsłuż tę metodę w bloku try-catch, przy czym dodaj kilka
    //catchy (multicatch) tak, aby obsłużyć oddzielnie Twój nowo stworzony wyjątek,
    //wyjątek z ćwiczenia pierwszego oraz Exception


    private static void exercise3() {
        Main exercise = new Main();
        try {
            exercise.throwException();
        } catch (MyOwnException e) {
            System.out.println("1");
        } catch (MyException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
    }

    private void throwException() throws Exception {
        throw new MyException();

    }
}