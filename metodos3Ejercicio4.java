
import java.util.Arrays;
import java.util.Scanner;

public class metodos3Ejercicio4 {

    private static String oracion = "";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 ->
                    crearOpcion();
                case 2 ->
                    calcularCaracteres();
                case 3 ->
                    calcularPalabras();
                case 4 ->
                    mostrarPalabrasOrdenadas();
                case 5 ->
                    mostrarPalabraPorPosicion();
                case 6 ->
                    buscarPalabra();
                case 7 ->
                    modificarPalabra();
                case 8 ->
                    agregarContenido();
                case 9 -> {
                    System.out.println("Saliendo del programa...");
                    return;
                }
                default ->
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. " + (oracion.isEmpty() ? "Crear oración" : "Borrar oración"));
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
    }

    private static void crearOpcion() {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese la oración: ");
            oracion = scanner.nextLine();
        } else {
            oracion = "";
            System.out.println("Oración borrada.");
        }
    }

    private static void calcularCaracteres() {
        System.out.println("Cantidad de caracteres: " + oracion.length());
    }

    private static void calcularPalabras() {
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de palabras: " + palabras.length);
    }

    private static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    private static void mostrarPalabraPorPosicion() {
        System.out.print("Ingrese el número de la palabra: ");
        int posicion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        String[] palabras = oracion.split("\\s+");
        if (posicion > 0 && posicion <= palabras.length) {
            System.out.println("Palabra en la posición " + posicion + ": " + palabras[posicion - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    private static void buscarPalabra() {
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                System.out.println("Palabra encontrada en la posición " + (i + 1));
                return;
            }
        }
        System.out.println("Palabra no encontrada.");
    }

    private static void modificarPalabra() {
        System.out.print("Ingrese la palabra a modificar: ");
        String palabra = scanner.nextLine();

        String[] palabras = oracion.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                System.out.print("Ingrese la nueva palabra: ");
                String nuevaPalabra = scanner.nextLine();
                palabras[i] = nuevaPalabra;
                oracion = String.join(" ", palabras);
                System.out.println("Palabra modificada.");
                return;
            }
        }
        System.out.println("Palabra no encontrada.");
    }

    private static void agregarContenido() {
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        oracion += " " + contenido;
        System.out.println("Contenido agregado.");
    }
}
