package com.connecting.shared.model;

public class CostumerException extends RuntimeException {
    public CostumerException(String message) {
        super(message);
    }
    public CostumerException(String message, Throwable cause) {
        super(message, cause);
    }
}
