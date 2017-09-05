package com.frankmoley.talks.spring.intro.service.domain.exception;

/**
 * General wrapper for exceptions that are generated and there is no way to recover from
 */
public class InventoryServiceSystemException extends RuntimeException {
    public InventoryServiceSystemException() {
        super();
    }

    public InventoryServiceSystemException(String message) {
        super(message);
    }

    public InventoryServiceSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryServiceSystemException(Throwable cause) {
        super(cause);
    }
}
