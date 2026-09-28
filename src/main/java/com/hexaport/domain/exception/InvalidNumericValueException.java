package com.hexaport.domain.exception;

import com.hexaport.domain.exception.parent.DomainException;

public class InvalidNumericValueException extends DomainException {
    public InvalidNumericValueException(String message){
        super("The value of " + message + "must be a numeric value higher than 0");
    }
}
