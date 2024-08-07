import java.util.Scanner;

public class arraysEjercicio5 {
  public static void main(String[] args) {
    //Desarrolla un programa que inicie creando un array de 3 enteros, con valores predeterminados. Posteriormente, 
    //genera una copia del mismo con una extensión de 2 elementos adicionales. Solicita al usuario que ingrese dos 
    //números para ser almacenados en las nuevas posiciones del array. Finalmente, muestra por consola el contenido del nuevo array.
    try (Scanner scanner = new Scanner(System.in)) {
      // Declarar el array original
      int[] original = {1, 2, 3};

      // Generar una copia del array original con una extensión de 2 elementos adicionales
      int[] nuevoArray = new int[original.length + 2];
      System.arraycopy(original, 0, nuevoArray, 0, original.length);

      // Solicitar al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array
      System.out.print("Ingrese el primer número: ");
      nuevoArray[original.length] = scanner.nextInt();
      System.out.print("Ingrese el segundo número: ");
      nuevoArray[original.length + 1] = scanner.nextInt();

      // Imprimir el contenido del nuevo array por consola
      for (int i = 0; i < nuevoArray.length; i++) {
        System.out.print(nuevoArray[i] + " ");
      }
      System.out.println();
    }
  }
}