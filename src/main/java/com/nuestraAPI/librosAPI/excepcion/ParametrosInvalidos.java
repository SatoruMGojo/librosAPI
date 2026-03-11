package com.nuestraAPI.librosAPI.excepcion;

public class ParametrosInvalidos extends RuntimeException {
    public ParametrosInvalidos(String message) {
        super(message);
    }
}
