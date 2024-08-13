
import java.util.Random;
import java.util.Scanner;

public class metodos3Ejercicio5 {

    private static final String[] PALABRAS = {"casa", "perro", "gato", "coche", "bici"};
    private static final int INTENTOS_MAXIMOS = 6;

    public static void main(String[] args) {
        String palabraAleatoria = seleccionarPalabraAleatoria();
        String pista = obtenerPista(palabraAleatoria);

        try (Scanner scanner = new Scanner(System.in)) {
            int intentos = 0;

            while (intentos < INTENTOS_MAXIMOS) {
                System.out.println("Pista: " + pista);
                System.out.print("Ingrese una letra: ");
                String letra = scanner.next();

                if (comprobarLetra(palabraAleatoria, letra)) {
                    pista = actualizarPista(palabraAleatoria, pista, letra);
                    if (pista.equals(palabraAleatoria)) {
                        System.out.println("¡Felicidades! Adivinaste la palabra: " + palabraAleatoria);
                        return;
                    }
                } else {
                    System.out.println("La letra no está en la palabra. Intentos restantes: " + (INTENTOS_MAXIMOS - intentos - 1));
                }

                intentos++;
            }
        }
        System.out.println("Lo siento, no adivinaste la palabra. La palabra era: " + palabraAleatoria);
    }

    private static String seleccionarPalabraAleatoria() {
        Random random = new Random();
        return PALABRAS[random.nextInt(PALABRAS.length)];
    }

    private static String obtenerPista(String palabra) {
        StringBuilder pista = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            pista.append("_ ");
        }
        return pista.toString().trim();
    }

    private static boolean comprobarLetra(String palabra, String letra) {
        return palabra.contains(letra);
    }

    private static String actualizarPista(String palabra, String pista, String letra) {
        StringBuilder nuevaPista = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra.charAt(0)) {
                nuevaPista.append(letra).append(" ");
            } else {
                nuevaPista.append(pista.charAt(i * 2)).append(" ");
            }
        }
        return nuevaPista.toString().trim();
    }
}
