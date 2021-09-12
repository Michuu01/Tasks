package Start.Day8.Exercise3;

import Start.Day8.Exercise1.MyException;

public class MyOwnException extends MyException {
    public MyOwnException() {
        super("MyOwnException");
    }

    public MyOwnException(final String message) {
        super(message);
    }
}
