package pro.sky.calculator.exceptions;

public class DivideByZeroException extends IllegalArgumentException{
    public DivideByZeroException(String message) {
        super(message);
    }
}
