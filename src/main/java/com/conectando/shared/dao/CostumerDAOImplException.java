package com.conectando.shared.dao;

public class CostumerDAOImplException extends RuntimeException {
    public CostumerDAOImplException(String message) {
        super(message);
    }

    public CostumerDAOImplException(String message, Throwable cause) {
        super(message, cause);
    }
}
