
import java.util.Scanner;

public class metodos1Ejercicio5 {
    //En esta actividad, vas a crear un programa que solicita al usuario que ingrese 3 números (incluida la lógica en un método llamado 
    //pedirNumeros())  y luego imprime la tabla de multiplicar de cada uno de ellos  1 al 10 (incluida la lógica en un método llamado 
    //imprimirTablasMultiplicar(int[] numeros)). Para ello, implementarás un  un array para almacenar los números ingresados y luego 
    //invocarás el método para cada uno de ellos.

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Llamar al método pedirNumeros() para solicitar al usuario que ingrese tres números
        int[] numeros = pedirNumeros(scanner);

        // Llamar al método imprimirTablasMultiplicar() para imprimir las tablas de multiplicar correspondientes a cada número
        imprimirTablasMultiplicar(numeros);
    }

    // Método para solicitar al usuario que ingrese tres números
    public static int[] pedirNumeros(Scanner scanner) {
        // Imprimir un mensaje solicitando al usuario que ingrese tres números
        System.out.print("Ingrese tres números: ");

        // Crear un array para almacenar los números ingresados
        int[] numeros = new int[3];

        // Leer los tres números ingresados por el usuario
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            // Consumir el salto de línea después de nextInt() para asegurarnos de que el siguiente nextLine() funcione correctamente
            scanner.nextLine();
        }

        // Devolver el array de números ingresados
        return numeros;
    }

    // Método para imprimir las tablas de multiplicar correspondientes a cada número
    public static void imprimirTablasMultiplicar(int[] numeros) {
        // Iterar sobre cada número en el array de números
        for (int i = 0; i < numeros.length; i++) {
            // Imprimir el encabezado de la tabla de multiplicar para el número actual
            System.out.println("Tabla de multiplicar del número " + numeros[i] + ":");

            // Iterar desde 1 hasta 10
            for (int j = 1; j <= 10; j++) {
                // Imprimir cada fila de la tabla de multiplicar para el número actual
                System.out.println(numeros[i] + " x " + j + " = " + (numeros[i] * j));
            }

            // Agregar un espacio en blanco entre las tablas de multiplicar de cada número
            System.out.println();
        }
    }
}
