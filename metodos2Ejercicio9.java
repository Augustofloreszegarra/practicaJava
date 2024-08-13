
import java.util.Scanner;

public class metodos2Ejercicio9 {

    // Método para rellenar el array con números proporcionados por el usuario
    public static void rellenarArray(int[] array) {
        // Crear un objeto Scanner para leer la entrada del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            int indice = 0; // Índice actual del array
            int numero; // Número ingresado por el usuario
            int indiceActual; // Índice hasta el cual se quiere rellenar el array

            // Bucle para rellenar el array
            while (indice < array.length) {
                // Pedir al usuario que ingrese un número
                System.out.print("Ingrese un número para rellenar el array: ");
                numero = scanner.nextInt();

                // Pedir al usuario que ingrese el índice hasta el cual se quiere rellenar el array
                if (indice == 0) {
                    System.out.print("Ingrese el índice hasta el cual quiere rellenar el array (0 - " + (array.length - 1) + "): ");
                } else {
                    System.out.print("Ingrese el índice hasta el cual quiere rellenar el array (" + (indice + 1) + " - " + (array.length - 1) + "): ");
                }
                indiceActual = scanner.nextInt();

                // Validar que el índice ingresado sea válido
                if (indiceActual < indice) {
                    System.out.println("El índice ingresado debe ser mayor que el último índice ingresado.");
                    continue;
                }

                if (indiceActual >= array.length) {
                    System.out.println("El índice ingresado debe ser menor que el tamaño total del arreglo.");
                    continue;
                }

                // Rellenar el array desde el índice actual hasta el índice ingresado
                for (int i = indice; i <= indiceActual; i++) {
                    array[i] = numero;
                }

                // Actualizar el índice actual
                indice = indiceActual + 1;
            }
        }
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese el tamaño del array
            System.out.print("Ingrese el tamaño del array: ");
            int tamaño = scanner.nextInt();
            int[] array = new int[tamaño];

            // Rellenar el array
            rellenarArray(array);

            // Imprimir el array rellenado
            System.out.println("Array rellenado:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
