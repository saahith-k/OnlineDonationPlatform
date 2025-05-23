package exceptions;

public class DonorNotFoundException extends Exception {
    public DonorNotFoundException(String message) {
        super(message);
    }
}