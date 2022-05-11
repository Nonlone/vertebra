package per.nonlone.vertebra.ddd.exception;

public class DomainRegistException extends RuntimeException{

    public DomainRegistException() {
        super();
    }

    public DomainRegistException(final String message) {
        super(message);
    }

    public DomainRegistException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public DomainRegistException(final Throwable cause) {
        super(cause);
    }

    protected DomainRegistException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
