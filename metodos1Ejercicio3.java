import java.util.Scanner;

public class metodos1Ejercicio3 {
  // Variable global para acceder al Scanner
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
  // Obtener el nombre del usuario
  String nombre = obtenerNombre();
  // Obtener la edad del usuario
  int edad = obtenerEdad();
  // Invocar el método imprimeNombreYEdad() con los datos obtenidos
  imprimeNombreYEdad(nombre, edad);
  }
  // Método para obtener el nombre del usuario
  public static String obtenerNombre() {
  System.out.print("Ingresa tu nombre: ");
  String nombre = scanner.nextLine();
  return nombre;
  }
  // Método para obtener la edad del usuario
  public static int obtenerEdad() {
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
