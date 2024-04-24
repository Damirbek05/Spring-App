package by.damirbek.test.exception;

public class UsernameAlreadyExistsException extends RuntimeException{
    private String userMessage;

    public UsernameAlreadyExistsException(String message) {
        super(message);
        this.userMessage = userMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }
}
