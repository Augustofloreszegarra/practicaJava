import java.util.Scanner;

public class arraysEjercicio3 {
  public static void main(String[] args) {
    
    try (Scanner scanner = new Scanner(System.in)) {
      //Escribe un programa en el cual se cree una variable de tipo array que contenga cinco elementos de 
      //tipo entero, ingresados por el usuario. El programa debe buscar el máximo e imprimir por consola 
      //el resultado utilizando solamente las herramientas adquiridas hasta el momento.
      
      // Declarar el array
      int[] miArray = new int[5];

      // Ingresar los elementos del array por el usuario
      for (int i = 0; i < 5; i++) {
        System.out.print("Ingrese el numero " + (i + 1) + ": ");
        miArray[i] = scanner.nextInt();
      }

      // Declarar una variable para almacenar el máximo
      int maximo = miArray[0];

      // Buscar el máximo
      for (int i = 1; i < 5; i++) {
        if (miArray[i] > maximo) {
          maximo = miArray[i];
        }
      }

      // Imprimir el resultado por consola
      System.out.println("El numero mayor del array es: " + maximo);
    }
  }
}