package com.hexaport.domain.exception;

import com.hexaport.domain.exception.parent.DomainException;

public class InvalidXpValueException extends DomainException {
    public static final String MESSAGE = "The xp value is invalid. (The value must be a number and be higher than 0)";
    public InvalidXpValueException() {
        super(MESSAGE);
    }
    public InvalidXpValueException(String message){
        super(message);
    }
}
