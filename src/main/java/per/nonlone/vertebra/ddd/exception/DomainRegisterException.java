package per.nonlone.vertebra.ddd.exception;

public class DomainRegisterException extends RuntimeException{

    public DomainRegisterException() {
        super();
    }

    public DomainRegisterException(final String message) {
        super(message);
    }

    public DomainRegisterException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public DomainRegisterException(final Throwable cause) {
        super(cause);
    }

    protected DomainRegisterException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
