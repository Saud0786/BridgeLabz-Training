package com.exceptions.banktransactionsystem;

// Custom Checked Exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
