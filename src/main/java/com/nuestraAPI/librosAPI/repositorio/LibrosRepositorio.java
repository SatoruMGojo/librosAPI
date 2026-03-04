package com.nuestraAPI.librosAPI.repositorio;

import com.nuestraAPI.librosAPI.modelo.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibrosRepositorio {
    private final List<Libro> Libros =new ArrayList<Libro>();

    public List<Libro> getLibros() {
        return Libros;
    }
    public Libro guardarLibro(Libro libro) {
        Libros.add(libro);
        return libro;
    }
    public Libro buscarLibro(int id) {
        for (Libro libro : Libros) {
            if (libro.getIdLibro() == id) {
                return libro;
            }
        }
        return null;
    }
    public Libro actualizarLibro(Libro libro) {

    }

}
