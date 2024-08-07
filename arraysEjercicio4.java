import java.util.Scanner;

public class arraysEjercicio4 {
  public static void main(String[] args) {
    
    try (Scanner scanner = new Scanner(System.in)) {
      //El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un 
      //número al usuario y muestra por consola si ese número está presente en el array o no. Es 
      //importante utilizar únicamente las herramientas aprendidas hasta el momento, sin emplear bucles 
      //en el proceso.

      // Declarar el array
      int[] miArray = new int[3];
      
      // Ingresar los elementos del array por el usuario
      for (int i = 0; i < 3; i++) {
        System.out.print("Ingrese el elemento " + (i + 1) + ": ");
        miArray[i] = scanner.nextInt();
      }

      // Solicitar un número al usuario
      System.out.print("Ingrese un número: ");
      int numero = scanner.nextInt();

      // Verificar si el número está presente en el array
      boolean presente = false;
      if (miArray[0] == numero || miArray[1] == numero || miArray[2] == numero) {
        presente = true;
      }

      // Imprimir el resultado por consola
      if (presente) {
        System.out.println("El número está presente en el array.");
      } else {
        System.out.println("El número no está presente en el array.");
      }
    }
  }
}