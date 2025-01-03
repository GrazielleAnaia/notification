package com.grazielleanaia.notification.infrastructure.exception;

import com.grazielleanaia.notification.business.EmailService;

public class EmailException extends RuntimeException {

    public EmailException (String mensagem) {
        super(mensagem);
    }

    public EmailException(String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    }
}
