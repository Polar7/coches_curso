package com.project.coches.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllersExceptions {

    @ExceptionHandler(EmailValidationException.class)
    public ProblemDetail emailException(EmailValidationException emailValidationException) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.CONFLICT, emailValidationException.getMessage());
    }

}
