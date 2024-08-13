//Crear array aleatorio: Basándote en el ejercicio “Generación de números aleatorios” de este paso, crea un programa que te permita generar 
//un array de tipo "int" de manera aleatoria. El programa debe solicitar al usuario el tamaño del array y el rango de números posibles para rellenarlo.

import java.util.Random;
import java.util.Scanner;

public class metodos2Ejercicio8 {

    // Método para generar un número aleatorio dentro del rango especificado
    public static int numeroAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    }

    public static void main(String[] args) {
        try (// Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Variable para almacenar el tamaño del array
            int tamañoArray;

            // Variable para almacenar el rango de números posibles
            int minimo;
            int maximo;

            // Solicitar al usuario el tamaño del array
            System.out.print("Ingrese el tamaño del array: ");
            tamañoArray = scanner.nextInt();

            // Solicitar al usuario el rango de números posibles
            System.out.print("Ingrese el número mínimo del rango: ");
            minimo = scanner.nextInt();
            System.out.print("Ingrese el número máximo del rango: ");
            maximo = scanner.nextInt();

            // Crear el array de tipo int
            int[] array = new int[tamañoArray];

            // Rellenar el array con números aleatorios
            for (int i = 0; i < tamañoArray; i++) {
                array[i] = numeroAleatorio(minimo, maximo);
            }

            // Mostrar el array generado
            System.out.println("Array generado:");
            for (int i = 0; i < tamañoArray; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
