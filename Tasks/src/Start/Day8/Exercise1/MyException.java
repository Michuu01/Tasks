package Start.Day8.Exercise1;

public class MyException extends Exception{




    public MyException(){
        super("ExceptionWithMyException");
    }
    public MyException(String message){
        super(message);
    }
    public MyException(String message, Throwable cause){
        super(message, cause);
    }
}
