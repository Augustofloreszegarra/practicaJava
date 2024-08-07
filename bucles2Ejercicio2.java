import java.util.Random;
import java.util.Scanner;

public class bucles2Ejercicio2 {
  //Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que adivines 
  //ese número utilizando un bucle do-while. El programa te indicará si el número que ingresas es mayor o menor que el número 
  //aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas correctamente.

  public static void main(String[] args) {
    // Generar un número aleatorio entre 1 y 20
    Random random = new Random();
    int numeroAleatorio = random.nextInt(20) + 1;

    // Declarar una variable para almacenar el número ingresado por el usuario
    int numeroIngresado;

    // Solicitar al usuario que adivine el número aleatorio
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Adivina el número entre 1 y 20: ");
      numeroIngresado = scanner.nextInt();

      // Verificar si el número ingresado es mayor o menor que el número aleatorio
      if (numeroIngresado > numeroAleatorio) {
        System.out.println("El número ingresado es mayor que el número aleatorio. Inténtalo de nuevo.");
      } else if (numeroIngresado < numeroAleatorio) {
        System.out.println("El número ingresado es menor que el número aleatorio. Inténtalo de nuevo.");
      } else {
        System.out.println("¡Felicitaciones! Has adivinado el número aleatorio.");
      }
    } while (numeroIngresado != numeroAleatorio);
  }
}