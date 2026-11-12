package com.connecting.shared.dao;

public class ResourceNotFoundException extends CostumerDAOImplException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
