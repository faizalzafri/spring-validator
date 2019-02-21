package com.faizal.spring5rest.exceptions.handlers;

import com.faizal.spring5rest.api.v1.model.error.ValidationSpringError;
import com.faizal.spring5rest.exceptions.NotValidException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotValidException.class)
    protected ResponseEntity<Object> handleMethodArgumentNotValid() {

        ValidationSpringError validationSpringError = ValidationSpringError.builder().errorMessage("Testing Error").build();

        return new ResponseEntity<>(validationSpringError, HttpStatus.BAD_REQUEST);
    }

}
