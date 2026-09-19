package by.kovalevskiy.spring.exception;

public class CommentAccessException extends RuntimeException{
    public CommentAccessException(String message) {
        super(message);
    }
}
