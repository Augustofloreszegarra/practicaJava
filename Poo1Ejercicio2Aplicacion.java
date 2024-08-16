
import java.util.Scanner;

public class Poo1Ejercicio2Aplicacion {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useDelimiter("\n")) {
          Poo1Ejercicio2Auto auto = new Poo1Ejercicio2Auto();

          while (true) {
              System.out.println("Menú de opciones:");
              System.out.println("1. Crear un objeto Auto");
              System.out.println("2. Imprimir atributos del objeto Auto");
              System.out.println("3. Salir");

              System.out.print("Ingrese su opción: ");
              int opcion = scanner.nextInt();

              switch (opcion) {
                  case 1 -> crearAuto(auto, scanner);
                  case 2 -> auto.imprimirDatos();
                  case 3 -> {
                      System.out.println("Adiós!");
                      return;
                  }
                  default -> System.out.println("Opción inválida. Por favor, inténtelo de nuevo.");
              }
          }
        }
    }

    public static void crearAuto(Poo1Ejercicio2Auto auto, Scanner scanner) {
        System.out.print("Ingrese la marca del auto: ");
        auto.setMarca(scanner.next());

        System.out.print("Ingrese el modelo del auto: ");
        auto.setModelo(scanner.next());

        System.out.print("Ingrese el año del auto: ");
        auto.setAño(scanner.nextInt());
        scanner.nextLine();
    }
}
