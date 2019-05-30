public class NotSufficientChangeException extends Exception {

    private String message;

    public NotSufficientChangeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
