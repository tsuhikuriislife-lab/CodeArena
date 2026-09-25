package com.hexaport.domain.exception;

public class InvalidStatusException extends RuntimeException {
    public static final String MESSAGE = "Invalid status.";
    public InvalidStatusException(){
        super(MESSAGE);
    }
    public InvalidStatusException(String message) {
        super(message);
    }
}
