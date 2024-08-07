import java.util.Scanner;

public class arraysEjercicio6 {
  public static void main(String[] args) {
    //Escribe un programa en el que se cree una variable de tipo array que contenga seis elementos de 
    //tipo entero. El programa debe contar la cantidad de elementos pares presentes en el array y 
    //mostrar el resultado por consola utilizando solo las herramientas aprendidas hasta el momento.
    try (Scanner scanner = new Scanner(System.in)) {
      // Declarar el array
      int[] miArray = new int[6];

      // Ingresar los elementos del array por el usuario
      for (int i = 0; i < 6; i++) {
        System.out.print("Ingrese el elemento " + (i + 1) + ": ");
        miArray[i] = scanner.nextInt();
      }

      // Contar la cantidad de elementos pares
      int contador = 0;
      for (int i = 0; i < 6; i++) {
        if (miArray[i] % 2 == 0) {
          contador++;
        }
      }

      // Imprimir el resultado por consola
      System.out.println("La cantidad de elementos pares en el array es: " + contador);
    }
  }
}