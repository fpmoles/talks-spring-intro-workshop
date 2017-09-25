package com.frankmoley.talks.spring.intro.exersize5;

/**
 * This exception indicates a method was called in an invalid method. This usually results from a null or empty parameter
 */
public class InvalidServiceRequestException extends RuntimeException {

    public InvalidServiceRequestException() {
        super();
    }

    public InvalidServiceRequestException(String message) {
        super(message);
    }

    public InvalidServiceRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidServiceRequestException(Throwable cause) {
        super(cause);
    }
}
