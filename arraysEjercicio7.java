import java.util.Scanner;

public class arraysEjercicio7 {
  public static void main(String[] args) {
    //Desarrolla un programa que cree un array de tamaño 5 que almacene números enteros. Luego, suma los 
    //elementos ubicados en las posiciones pares del array (es decir, las posiciones 0, 2 y 4) y muestra 
    //por consola el resultado de la suma. Utiliza exclusivamente las herramientas aprendidas hasta el momento.
    try (Scanner scanner = new Scanner(System.in)) {
      // Declarar el array
      int[] miArray = new int[5];

      // Ingresar los elementos del array por el usuario
      for (int i = 0; i < 5; i++) {
        System.out.print("Ingrese el elemento " + (i + 1) + ": ");
        miArray[i] = scanner.nextInt();
      }

      // Sumar los elementos ubicados en las posiciones pares del array
      int suma = 0;
      for (int i = 0; i < 5; i += 2) {
        suma += miArray[i];
      }

      // Imprimir el resultado por consola
      System.out.println("La suma de los elementos ubicados en las posiciones pares del array es: " + suma);
    }
  }
}