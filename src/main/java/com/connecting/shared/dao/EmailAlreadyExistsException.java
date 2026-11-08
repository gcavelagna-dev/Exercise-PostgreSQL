package com.connecting.shared.dao;

public class EmailAlreadyExistsException extends CostumerDAOImplException {
    public EmailAlreadyExistsException(String message) {
        super(message);
    }

    public EmailAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
