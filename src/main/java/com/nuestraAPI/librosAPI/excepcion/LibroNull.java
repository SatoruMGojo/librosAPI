package com.nuestraAPI.librosAPI.excepcion;

public class LibroNull extends RuntimeException {
    public LibroNull(String message) {
        super(message);
    }
}
