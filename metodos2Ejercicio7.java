
import java.util.Random;
import java.util.Scanner;

public class metodos2Ejercicio7 {
// Método para generar un número aleatorio dentro del rango especificado

    public static int numeroAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    }

    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 20
        int numeroSecreto = numeroAleatorio(1, 20);

        try (// Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Variable para almacenar el número ingresado por el usuario
            int numeroIngresado;
            // Bucle do-while para adivinar el número
            do {
                // Mostrar un mensaje pidiendo que adivine el número
                System.out.print("Adivine el número (entre 1 y 20): ");
                numeroIngresado = scanner.nextInt();

                // Verificar si el número ingresado es mayor o menor que el número secreto
                if (numeroIngresado < numeroSecreto) {
                    System.out.println("El número que ingresó es menor que el número secreto.");
                } else if (numeroIngresado > numeroSecreto) {
                    System.out.println("El número que ingresó es mayor que el número secreto.");
                }
            } while (numeroIngresado != numeroSecreto);
        }

        // Mostrar un mensaje cuando se adivine correctamente el número
        System.out.println("¡Felicitaciones! Adivinó correctamente el número.");
    }
}
