package com.nuestraAPI.librosAPI.excepcion;

public class MatchaFaltante extends RuntimeException {
    public MatchaFaltante(String message) {
        super(message);
    }
}
