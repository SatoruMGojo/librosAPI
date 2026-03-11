package com.nuestraAPI.librosAPI.excepcion;

public class ParametrosSinRellenar extends RuntimeException {
    public ParametrosSinRellenar(String message) {
        super(message);
    }
}
