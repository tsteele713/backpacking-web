package com.poorvins.exceptions;

public class InvalidSeqIdTokenException extends Exception {

    public InvalidSeqIdTokenException(String message) {
        super(message);
    }

    public InvalidSeqIdTokenException(String message, Throwable cause) {
        super(message, cause);
    }

}