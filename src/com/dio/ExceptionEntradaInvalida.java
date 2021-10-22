package com.dio;

public class ExceptionEntradaInvalida extends Exception {
    public ExceptionEntradaInvalida(String objeto) {
        super(objeto + " invalido, recomeçe o jogo");
    }
}
