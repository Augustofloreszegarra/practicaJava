
import java.util.Scanner;

public class metodos2Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = solicitarNumero(scanner);
            if (esPar(numero)) {
                System.out.println("El " + numero + " es par");
            }
        }
    }

    public static int solicitarNumero(Scanner scanner) {
        int numero = 0;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == 0);
        return numero;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}

/* import java.util.Scanner;

public class metodos2Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = solicitarNumero(scanner);
            if (esPar(numero)) {
                System.out.println("El " + numero + " es par");
            } else {
                System.out.println("El " + numero + " es impar");
            }
        }
    }

    public static int solicitarNumero(Scanner scanner) {
        int numero = 0;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == 0);
        return numero;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
} */