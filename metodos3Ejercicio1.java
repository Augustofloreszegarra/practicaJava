
import java.util.Scanner;

public class metodos3Ejercicio1 {
    // Método que obtiene el valor de Fibonacci en una posición determinada

    public static int obtenerValorFibonacci(int posicion) {
        // Llama al método fibonacciRecursiva para calcular el valor de Fibonacci
        return fibonacciRecursiva(posicion);
    }

    // Método que calcula el valor de Fibonacci de manera recursiva
    public static int fibonacciRecursiva(int posicion) {
        // Utiliza una expresión switch para manejar los casos base (0 y 1)
        return switch (posicion) {
            // Caso base: si la posición es 0, devuelve 0
            case 0 ->
                0;
            // Caso base: si la posición es 1, devuelve 1
            case 1 ->
                1;
            // Caso default: si la posición es mayor que 1, calcula el valor de Fibonacci
            // llamando a sí mismo con los argumentos adecuados
            default ->
                fibonacciRecursiva(posicion - 1) + fibonacciRecursiva(posicion - 2);
        };
    }

    // Método main que solicita la posición del número en la serie de Fibonacci
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita la posición del número en la serie de Fibonacci
            System.out.print("Ingrese la posición del número en la serie de Fibonacci que desea saber (no ingresar un numero muy alto recomendado 1-20): ");
            int posicion = scanner.nextInt();
            // Calcula el valor de Fibonacci en la posición ingresada
            int valorFibonacci = obtenerValorFibonacci(posicion);
            // Imprime el resultado
            System.out.println("El valor de la serie de Fibonacci en la posición " + posicion + " es: " + valorFibonacci);
        }
    }
}