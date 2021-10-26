package com.poorvins.exceptions;

public class UserAccountDoesNotExist extends Exception {

    public UserAccountDoesNotExist(String message) {
        super(message);
    }

    public UserAccountDoesNotExist(String message, Throwable cause) {
        super(message, cause);
    }

}