package by.kovalevskiy.spring.exception;

public class GameAlreadyExistsException extends RuntimeException{
    public GameAlreadyExistsException(String message) {
        super(message);
    }
}
