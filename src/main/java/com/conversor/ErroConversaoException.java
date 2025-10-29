package com.conversor;

public class ErroConversaoException extends RuntimeException {
    public ErroConversaoException(String mensagem) {
        super(mensagem);
    }

    public ErroConversaoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
