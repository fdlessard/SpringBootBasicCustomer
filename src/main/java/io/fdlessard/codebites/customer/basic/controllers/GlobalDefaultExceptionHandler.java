package io.fdlessard.codebites.customer.basic.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.badRequest().body("");
    }

}