package book.store.exception;

public class DataProcessingException extends RuntimeException {

    public DataProcessingException() {
        super();
    }

    public DataProcessingException(String message, Exception e) {
        super(message);
    }
}
