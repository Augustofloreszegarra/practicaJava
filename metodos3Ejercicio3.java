
import java.util.Scanner;

public class metodos3Ejercicio3 {

    /**
     * Verifica si un número es primo.
     *
     * @param numero El número a verificar.
     * @param divisor El divisor actual.
     * @return true si el número es primo, false en caso contrario.
     */
    public static boolean esPrimo(int numero, int divisor) {
        if (divisor > Math.sqrt(numero)) {
            return true; // No hay divisores mayores
        } else if (numero % divisor == 0) {
            return false; // El número no es primo
        } else {
            return esPrimo(numero, divisor + 1); // Verificar con divisor incrementado
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            do {
                System.out.print("Ingrese un número para saber si es primo (0 para salir): ");
                numero = scanner.nextInt();
                if (numero != 0) {
                    if (esPrimo(numero, 2)) {
                        System.out.println("El número es primo");
                    } else {
                        System.out.println("El número no es primo");
                    }
                }
            } while (numero != 0);
        }
    }
}
