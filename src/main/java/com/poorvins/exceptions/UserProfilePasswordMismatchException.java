package com.poorvins.exceptions;

public class UserProfilePasswordMismatchException extends Exception {

    public UserProfilePasswordMismatchException(String message) {
        super(message);
    }

    public UserProfilePasswordMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

}
