package by.kovalevskiy.spring.exception;

public class PlaceAlreadyExistsException extends RuntimeException{
    public PlaceAlreadyExistsException(String message) {
        super(message);
    }
}
