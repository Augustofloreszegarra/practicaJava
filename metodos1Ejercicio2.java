import java.util.Scanner;

public class metodos1Ejercicio2 {
  public static void main(String[] args) {
    // Crear un objeto Scanner para obtener datos del usuario
    Scanner scanner = new Scanner(System.in);
    // Obtener el nombre del usuario
    String nombre = obtenerNombre(scanner);
    // Obtener la edad del usuario
    int edad = obtenerEdad(scanner);
    // Invocar el método imprimeNombreYEdad() con los datos obtenidos
    imprimeNombreYEdad(nombre, edad);
    // Cerrar el objeto Scanner
    scanner.close();
    }
    // Método para obtener el nombre del usuario utilizando un objeto Scanner
    public static String obtenerNombre(Scanner scanner) {
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextLine();
    return nombre;
    }
    // Método para obtener la edad del usuario utilizando un objeto Scanner
    public static int obtenerEdad(Scanner scanner) {
    System.out.print("Ingresa tu edad: ");
    int edad = scanner.nextInt();
    scanner.nextLine(); // Consumir la nueva línea después del número entero
    
    return edad;
    }
    // Método para imprimir el nombre y la edad del usuario
    public static void imprimeNombreYEdad(String nombre, int edad) {
    System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
    }