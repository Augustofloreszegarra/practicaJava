
import java.util.InputMismatchException; // Importa la excepción InputMismatchException
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class metodos2Ejercicio2 {

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
                        double num1 = scanner.nextDouble(); // Lee el primer número

                        System.out.print("Ingrese el segundo número: "); // Solicita el segundo número
                        double num2 = scanner.nextDouble(); // Lee el segundo número

                        switch (opcion) { // Realiza la operación seleccionada
                            case 1 ->
                                System.out.println("La suma es: " + sumar(num1, num2)); // Muestra el resultado de la suma
                            case 2 ->
                                System.out.println("La resta es: " + restar(num1, num2)); // Muestra el resultado de la resta
                            case 3 ->
                                System.out.println("La multiplicación es: " + multiplicar(num1, num2)); // Muestra el resultado de la multiplicación
                            case 4 -> {
                                if (num2 != 0) { // Si el segundo número no es cero
                                    System.out.println("La división es: " + dividir(num1, num2)); // Muestra el resultado de la división
                                } else {
                                    System.out.println("Error: No se puede dividir por cero"); // Muestra un mensaje de error
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

    public static double sumar(double num1, double num2) {
        return num1 + num2; // Realiza la suma de los dos números y devuelve el resultado
    }

    public static double restar(double num1, double num2) {
        return num1 - num2; // Realiza la resta de los dos números y devuelve el resultado
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2; // Realiza la multiplicación de los dos números y devuelve el resultado
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
