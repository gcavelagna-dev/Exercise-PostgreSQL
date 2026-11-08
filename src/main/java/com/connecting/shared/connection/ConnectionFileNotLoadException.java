package com.connecting.shared.connection;

public class ConnectionFileNotLoadException extends ConnectionFactoryException {
    public ConnectionFileNotLoadException(String message) {
        super(message);
    }
    public ConnectionFileNotLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
