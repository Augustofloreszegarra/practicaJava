package Biblioteca;

public class Menu {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro();
        libro1.setTitulo("El Señor de los Anillos");
        libro1.setAutor("J.R.R. Tolkien");
        libro1.setPaginas(20);

        Libro libro2 = new Libro();
        libro2.setTitulo("La Sombra del Viento");
        libro2.setAutor("Carlos Ruiz Zafón");
        libro2.setPaginas(30);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.imprimirLibrosDisponibles();

        libro1.imprimirDetalles();

        Libro libroBuscado = biblioteca.buscarLibroPorTitulo("La Sombra del Viento");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado:");
            libroBuscado.imprimirDetalles();
        }

        biblioteca.eliminarLibro("El Señor de los Anillos");

        biblioteca.imprimirLibrosDisponibles();
    }
}

