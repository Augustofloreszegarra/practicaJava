import java.util.Scanner;

public class metodos2Ejercicio3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa nota del estudiante (entre 0 y 100): ");
            int numero = scanner.nextInt();
            
            if (validarNumero(numero)) {
                String nota = obtenerNota(numero);
                System.out.println("La nota es: " + nota);
            } else {
                System.out.println("Número inválido. Por favor, ingresa un número entre 0 y 100.");
            }
        }
    }

    public static boolean validarNumero(int numero) {
        return numero >= 0 && numero <= 100;
    }

    public static String obtenerNota(int numero) {
        return switch (numero) {
            case 90, 100 -> "A";
            case 80 -> "B";
            case 70 -> "C";
            case 60 -> "D";
            default -> "F";
        };
    }
}