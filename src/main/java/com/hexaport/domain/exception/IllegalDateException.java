package com.hexaport.domain.exception;

public class IllegalDateException extends RuntimeException {
    public IllegalDateException(String message) {
        super("The date registered is illegal. The creation date must be set to a time before the limit date.");
    }
}
