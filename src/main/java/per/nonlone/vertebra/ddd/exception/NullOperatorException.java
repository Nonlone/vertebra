package per.nonlone.vertebra.ddd.exception;

public class NullOperatorException extends RuntimeException {

    public NullOperatorException() {}

    public NullOperatorException(String message) {
        super(message);
    }

    public NullOperatorException(Throwable cause) {
        super(cause);
    }

    public NullOperatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullOperatorException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
