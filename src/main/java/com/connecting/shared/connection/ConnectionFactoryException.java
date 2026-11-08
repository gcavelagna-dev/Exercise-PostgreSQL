package com.connecting.shared.connection;

public class ConnectionFactoryException extends RuntimeException {
    public ConnectionFactoryException(String message) {
        super(message);
    }
    public ConnectionFactoryException(String message, Throwable cause){
        super(message, cause);
    }
}
