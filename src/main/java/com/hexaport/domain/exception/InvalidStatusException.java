package com.hexaport.domain.exception;

public class InvalidStatusException extends RuntimeException {
    public InvalidStatusException(String message) {
        super("Invalid value. Value must be a valid choice for the following ENUM: " + message);
    }
}
