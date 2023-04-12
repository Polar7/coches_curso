package com.project.coches.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.Map;

@RestControllerAdvice
public class ControllersExceptions {

    @ExceptionHandler(EmailValidationException.class)
    public ResponseEntity<Map<String, String>> emailException (EmailValidationException emailValidationException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap("ERROR", emailValidationException.getMessage()));
    }
}
