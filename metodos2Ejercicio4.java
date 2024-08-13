public class metodos2Ejercicio4 {

    // Método principal de la clase
  public static void main(String[] args) {
      // Creación de arreglos de diferentes tipos
      int[] arrayInt = {1, 2, 3, 4, 5}; // Arreglo de enteros
      String[] arrayString = {"Hola", "mundo", "de", "Java"}; // Arreglo de cadenas
      int[][] arrayBidimensionalInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Arreglo bidimensional de enteros
      String[][] arrayBidimensionalString = {{"Hola", "mundo"}, {"de", "Java"}}; // Arreglo bidimensional de cadenas

        imprimirArray(arrayInt);
        imprimirArray(arrayString);
        imprimirArray(arrayBidimensionalInt);
        imprimirArray(arrayBidimensionalString);
    }

    // Método para imprimir un arreglo de enteros
  public static void imprimirArray(int[] array) {
      // Ciclo for para recorrer el arreglo
      for (int i = 0; i < array.length; i++) {
          // Imprimir cada elemento del arreglo seguido de un espacio
          System.out.print(array[i] + " ");
      }
      // Imprimir un salto de línea al final
      System.out.println();
    }

    // Método para imprimir un arreglo de cadenas
  public static void imprimirArray(String[] array) {
      // Ciclo for-each para recorrer el arreglo
      for (int i = 0; i < array.length; i++) {
          // Imprimir cada elemento del arreglo seguido de un espacio
          System.out.print(array[i] + " ");
      }
      // Imprimir un salto de línea al final
      System.out.println();
    }

    // Método para imprimir un arreglo bidimensional de enteros
  public static void imprimirArray(int[][] array) {
      // Ciclo for-each para recorrer el arreglo bidimensional
      for (int i = 0; i < array.length; i++) {
          // Ciclo for para recorrer cada subarreglo
          for (int j = 0; j < array[i].length; j++) {
              // Imprimir cada elemento del subarreglo seguido de un espacio
              System.out.print(array[i][j] + " ");
          }
          // Imprimir un salto de línea al final de cada subarreglo
          System.out.println();
        }
    }

    // Método para imprimir un arreglo bidimensional de cadenas
  public static void imprimirArray(String[][] array) {
      // Ciclo for-each para recorrer el arreglo bidimensional
      for (int i = 0; i < array.length; i++) {
          // Ciclo for-each para recorrer cada subarreglo
          for (int j = 0; j < array[i].length; j++) {
              // Imprimir cada elemento del subarreglo seguido de un espacio
              System.out.print(array[i][j] + " ");
          }
          // Imprimir un salto de línea al final de cada subarreglo
          System.out.println();
        }
    }
}
