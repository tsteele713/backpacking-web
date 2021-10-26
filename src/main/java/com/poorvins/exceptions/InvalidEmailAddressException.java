package com.poorvins.exceptions;

public class InvalidEmailAddressException extends Exception {

    public InvalidEmailAddressException(String message) {
        super(message);
    }

    public InvalidEmailAddressException(String message, Throwable cause) {
        super(message, cause);
    }

}