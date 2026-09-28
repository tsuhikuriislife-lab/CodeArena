package com.hexaport.domain.exception;

public class InvalidValueException extends RuntimeException {
    public InvalidValueException(String message) {
        super(message + "cannot be left blank or null.");
    }
}
