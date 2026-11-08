package com.connecting.shared.model;

public class CostumerNameIsBlankException extends CostumerException {
    public CostumerNameIsBlankException(String message) {
        super(message);
    }
    public CostumerNameIsBlankException(String message, Throwable cause) {
        super(message, cause);
    }
}
