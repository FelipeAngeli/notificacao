package com.felipe.notificacao.infrastructure.exceptions;

public class EmailExcepption extends  RuntimeException{

    public EmailExcepption(String mensagem){
        super(mensagem);
    }

    public  EmailExcepption(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
