package com.nuestraAPI.librosAPI.servicio;

import com.nuestraAPI.librosAPI.modelo.Libro;
import com.nuestraAPI.librosAPI.repositorio.LibrosRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrosServicio {

    private final LibrosRepositorio librosRepositorio;

    public LibrosServicio(LibrosRepositorio librosRepositorio) {
        this.librosRepositorio = librosRepositorio;
    }

    public List<Libro> getLibros() {
        return librosRepositorio.getLibros();
    }

    public Libro getLibro(int id) {
        return librosRepositorio.buscarLibro(id);
    }

    public Libro guardarLibro(Libro libro) {
        return librosRepositorio.guardarLibro(libro);
    }

    public Libro actualizarLibro(int id, Libro libro) {
        return librosRepositorio.actualizarLibro(id, libro);
    }

    public boolean eliminarLibro(int id) {
        return librosRepositorio.eliminarLibro(id);
    }




}
