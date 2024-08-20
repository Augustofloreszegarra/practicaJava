package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.paginas = 0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setPaginas(int numero) {
        this.paginas = numero * 7;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void imprimirDetalles() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.paginas);
    }
}
