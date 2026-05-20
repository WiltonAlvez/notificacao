package com.wiltonjunior.notificacao.Infrastructure.exceptions;

public class EmailException extends RuntimeException{


    public EmailException(String message){
        super(message);
    }

    public EmailException(String message, Throwable causa){
        super(message,causa);
    }
}
