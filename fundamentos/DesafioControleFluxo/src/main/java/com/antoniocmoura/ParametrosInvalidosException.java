package com.antoniocmoura;

public class ParametrosInvalidosException extends Exception {
    private static final long serialVersionUID = -2346384470483785588L;

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
