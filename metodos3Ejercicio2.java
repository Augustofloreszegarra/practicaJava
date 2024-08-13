
import java.util.Scanner;

public class metodos3Ejercicio2 {

    // Método que calcula el factorial de un número
    public static int factorial(int numero) {
        // Caso base: si el número es 0 o 1, devuelve 1
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            // Caso recursivo: calcula el factorial llamando a sí mismo con el número - 1
            // y multiplicando el resultado por el número actual
            return numero * factorial(numero - 1);
        }
    }

    // Método main que solicita un número y calcula su factorial
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita un número al usuario
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            // Calcula el factorial del número ingresado
            int factorial = factorial(numero);
            // Imprime el resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
