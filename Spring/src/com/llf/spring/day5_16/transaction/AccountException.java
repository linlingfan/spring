package com.llf.spring.day5_16.transaction;

/**
 * Created by lenovo on 2016/5/16.
 */
public class AccountException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AccountException() {
        super();
    }

    public AccountException(String message) {
        super(message);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountException(Throwable cause) {
        super(cause);
    }

    protected AccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
