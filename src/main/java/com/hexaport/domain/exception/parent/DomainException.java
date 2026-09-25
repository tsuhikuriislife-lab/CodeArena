package com.hexaport.domain.exception.parent;

public abstract class DomainException extends RuntimeException {
    public DomainException(String message){
        super(message);
    }
}
