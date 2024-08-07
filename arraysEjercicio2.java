import java.util.Scanner;

public class arraysEjercicio2 {
  public static void main(String[] args) {
    
    try (Scanner scanner = new Scanner(System.in)) {
    //Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro 
    //elementos de tipo entero. Estos elementos deben ser ingresados por el usuario. El programa 
    //debe sumar y promediar los cuatro elementos de forma manual e imprimir por consola el 
    //resultado, utilizando solamente las herramientas adquiridas hasta el momento.
    // Declarar el array
      int[] miArray = new int[4];

      // Ingresar los elementos del array por el usuario
      for (int i = 0; i < 4; i++) {
        System.out.print("Ingrese el elemento " + (i + 1) + ": ");
        miArray[i] = scanner.nextInt();
      }

      // Declarar variables para almacenar la suma y el promedio
      int suma = 0;
      double promedio = 0.0;

      // Sumar los elementos del array de forma manual
      suma = miArray[0] + miArray[1] + miArray[2] + miArray[3];

      // Calcular el promedio
      promedio = suma / 4;

      // Imprimir el resultado por consola
      System.out.println("La suma de los elementos del array es: " + suma);
      System.out.println("El promedio de los elementos del array es: " + promedio);
    }
  }
}