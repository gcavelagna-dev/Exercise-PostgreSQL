package com.conectando.shared.dao;

public class ClientNotSavedException extends CostumerDAOImplException {
    public ClientNotSavedException(String message) {
        super(message);
    }

    public ClientNotSavedException(String message, Throwable cause) {
        super(message, cause);
    }
}
