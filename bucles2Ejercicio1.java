import java.util.Scanner;

public class bucles2Ejercicio1 {
  //Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:

  //Comprar producto.
  //Realizar devolución.
  //Ver mis pedidos.
  //Preguntas frecuentes.
  //Salir.

  //Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. El menú debe seguir apareciendo hasta que el usuario elija la 
  //opción para salir del programa. En este ejercicio, no es necesario que las opciones del menú realicen acciones reales, simplemente muestra un 
  //mensaje que indique qué opción eligió el usuario.

  public static void main(String[] args) {
    // Declarar una variable para almacenar la opción elegida por el usuario
    int opcion;

    // Mostrar el menú en pantalla
    do {
      System.out.println("Menú:");
      System.out.println("1. Comprar producto");
      System.out.println("2. Realizar devolución");
      System.out.println("3. Ver mis pedidos");
      System.out.println("4. Preguntas frecuentes");
      System.out.println("5. Salir");

      // Solicitar al usuario que elija una opción
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese una opción (1-5): ");
      opcion = scanner.nextInt();

      // Mostrar el mensaje correspondiente a la opción elegida
      switch (opcion) {
        case 1:
          System.out.println("Has elegido la opción 1: Comprar producto");
          break;
        case 2:
          System.out.println("Has elegido la opción 2: Realizar devolución");
          break;
        case 3:
          System.out.println("Has elegido la opción 3: Ver mis pedidos");
          break;
        case 4:
          System.out.println("Has elegido la opción 4: Preguntas frecuentes");
          break;
        case 5:
          System.out.println("Has elegido la opción 5: Salir");
          break;
        default:
          System.out.println("Opción inválida. Por favor, elige una opción válida.");
          break;
      }

      // Solicitar al usuario que presione una tecla para continuar
      System.out.println("Presiona una tecla para continuar...");
      scanner.nextLine();
      scanner.nextLine();
    } while (opcion != 5);

    // Mostrar un mensaje de salida
    System.out.println("Hasta pronto!");
  }
}