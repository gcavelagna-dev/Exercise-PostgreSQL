package com.connecting.shared.connection;

public class ConnectionFileNotFoundException extends ConnectionFactoryException {
    public ConnectionFileNotFoundException(String message) {
        super(message);
    }

    public ConnectionFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
