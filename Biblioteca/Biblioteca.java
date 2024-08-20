package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

// Clase para almacenar instancias de Libro en un array
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void imprimirLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (Libro libro : this.libros) {
            System.out.println(libro.getTitulo());
        }
    }

    // Otros métodos adicionales
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String titulo) {
        this.libros.removeIf(libro -> libro.getTitulo().equals(titulo));
    }
}