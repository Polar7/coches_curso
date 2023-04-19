package com.project.coches.exception;

public class PasswordIncorrectException extends RuntimeException {

    public PasswordIncorrectException() {
        super("La contraseña es inválida.");
    }
}
