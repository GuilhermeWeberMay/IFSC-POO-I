public class ExceptionLavacao extends Exception {
    public ExceptionLavacao(String message) {
        super(message);
    }
    public ExceptionLavacao(String message, Exception cause) {
        super(message, cause);
    }
}
