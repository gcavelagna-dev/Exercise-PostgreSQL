package com.connecting.shared.dao;

public class ErrorRetrievingCostumerIDException extends CostumerDAOImplException {
    public ErrorRetrievingCostumerIDException(String message) {
        super(message);
    }

    public ErrorRetrievingCostumerIDException(String message, Throwable cause) {
        super(message, cause);
    }
}
