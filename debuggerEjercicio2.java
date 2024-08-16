
import java.util.InputMismatchException; // Importa la excepción InputMismatchException
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class debuggerEjercicio2 {

    public static void main(String[] args) {
        menu(); // Llama al método menu para mostrar el menú de opciones
    }

    public static void menu() {
        try (Scanner scanner = new Scanner(System.in)) { // Crea un objeto Scanner para leer la entrada del usuario
            boolean salir = false; // Variable para controlar el bucle del menú

            while (!salir) { // Bucle que se ejecuta hasta que se seleccione la opción de salir
                System.out.println("Menú de opciones:"); // Muestra el menú de opciones
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");

                try {
                    System.out.print("Ingrese su opción: "); // Solicita la opción del usuario
                    int opcion = scanner.nextInt(); // Lee la opción del usuario

                    if (opcion == 5) { // Si se selecciona la opción de salir
                        salir = true; // Salir del bucle
                    } else { // Si se selecciona otra opción
                        System.out.print("Ingrese el primer número: "); // Solicita el primer número
                        int num1 = scanner.nextInt(); // Lee el primer número

                        System.out.print("Ingrese el segundo número: "); // Solicita el segundo número
                        int num2 = scanner.nextInt(); // Lee el segundo número

                        switch (opcion) { // Realiza la operación seleccionada
                           
                            case 4 -> {
                                if (true) { // Si el segundo número no es cero
                                    System.out.println("La división es: " + dividir(num1, num2)); // Muestra el resultado de la división
                                }
                            }
                            default ->
                                System.out.println("Opción inválida"); // Muestra un mensaje de error si la opción seleccionada no es válida
                        }
                    }
                } catch (InputMismatchException e) { // Si se ingresa un valor no numérico
                    System.out.println("Error: Debe ingresar un número");
                    scanner.next();
                }
            }
        }
    }


    public static double dividir(int num1, int num2) {
        return num1 / num2;
    }
}
