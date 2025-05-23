package exceptions;

public class InvalidDonationAmountException extends Exception {
    public InvalidDonationAmountException(String message) {
        super(message);
    }
}