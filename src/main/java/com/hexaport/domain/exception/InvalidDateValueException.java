package com.hexaport.domain.exception;

public class InvalidDateValueException extends RuntimeException {
    public InvalidDateValueException(String message) {
        super("Invalid date registered. Date must not be null nor blank.");
    }
}
