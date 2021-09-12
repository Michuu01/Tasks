package Start.Day8.Exercise1;

public class Main {
    public static void main(String[] args) throws MyException {
        exercise1();
    }


    //Stwórz swój własny checked exception. Zdefiniuj konstruktor, który pozwala
    //przekazać wiadomość na etapie tworzenia wyjątku. Stwórz metodę, która go wyrzuci.
    //Następnie obsłuż ten wyjątek w bloku try-catch-finally. W catch, wydrukuj StackTrace
    //na ekranie.
    private static void exercise1() throws MyException {
        Main exercise = new Main();
        try {
            exercise.myExerciseThrow();
        }catch (MyException e){
            e.printStackTrace();
        }finally {
            System.out.println("stop");
        }
}

    private void myExerciseThrow() throws MyException {
throw new MyException();
    }


}

