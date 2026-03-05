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
   public Libro actualizarLibro(int id, Libro libro) {
        for (Libro libroAux : Libros) {
            if (libroAux.getIdLibro() == id) {
                libroAux.setTituloLibro(libro.getTituloLibro());
                libroAux.setGeneroLibro(libro.getGeneroLibro());
                libroAux.setAutorLibro(libro.getAutorLibro());
                return libroAux;

            }
        }
        return null;
   }
   public boolean eliminarLibro(int id) {
        for (Libro libroAux : Libros) {
            if (libroAux.getIdLibro() == id) {
                Libros.remove(libroAux);
            }
            return true;
        }
        return false;
   }

}
