package com.nuestraAPI.librosAPI.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejaExcepciones {

    @ExceptionHandler(MatchaFaltante.class)
    public ResponseEntity<String> handleMatchaFaltante(MatchaFaltante matchaFaltante) {
        return new ResponseEntity<>(matchaFaltante.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
