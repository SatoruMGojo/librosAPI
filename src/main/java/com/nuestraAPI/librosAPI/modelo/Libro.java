package com.nuestraAPI.librosAPI.modelo;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Libro {
    private int idLibro;
    private String tituloLibro;
    private String autorLibro;
    private String generoLibro;
    private boolean esDigital;
}
