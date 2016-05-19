package com.llf.spring.day5_16.transaction;

/**
 * Created by lenovo on 2016/5/16.
 */
public class BookException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BookException() {
        super();
    }

    public BookException(String message) {
        super(message);
    }

    public BookException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookException(Throwable cause) {
        super(cause);
    }

    protected BookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
