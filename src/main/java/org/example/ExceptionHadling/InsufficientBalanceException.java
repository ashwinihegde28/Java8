package org.example.ExceptionHadling;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super("Insufficient Balance");
    }
}
