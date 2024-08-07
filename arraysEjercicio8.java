import java.util.Scanner;

public class arraysEjercicio8 {
  public static void main(String[] args) {
    //Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres serán ordenados alfabéticamente 
    //y posteriormente impresos en la consola.
     try (Scanner scanner = new Scanner(System.in)) {
      // Declarar un array para almacenar los nombres
      String[] nombres = new String[4];

      // Ingresar los nombres por el usuario
      for (int i = 0; i < 4; i++) {
        System.out.print("Ingrese el nombre " + (i + 1) + ": ");
        nombres[i] = scanner.next();
      }

      // Ordenar los nombres alfabéticamente
      for (int i = 0; i < 3; i++) {
        for (int j = i + 1; j < 4; j++) {
          if (nombres[i].compareTo(nombres[j]) > 0) {
            String temp = nombres[i];
            nombres[i] = nombres[j];
            nombres[j] = temp;
          }
        }
      }

      // Imprimir los nombres ordenados por consola
      System.out.println("Los nombres ordenados alfabéticamente son:");
      for (int i = 0; i < 4; i++) {
        System.out.println(nombres[i]);
      }
    }
  }
}