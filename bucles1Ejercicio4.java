public class bucles1Ejercicio4 {
  //Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento se convierta 
  //en el último y viceversa, luego imprime el array resultante por consola.  El tamaño y los números  a contener 
  //pueden ser de tu elección.
  //IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si necesitas hacer uso de 
  //elementos auxiliares para concluir el ejercicio. 
  public static void main(String[] args) {
    // Declarar un array de enteros
    int[] miArray = {10, 20, 30, 40, 50};

    // Invertir el orden de los elementos del array
    int[] arrayInvertido = invertirArray(miArray);

    // Imprimir el array resultante por consola
    System.out.println("El array invertido es:");
    for (int i = 0; i < arrayInvertido.length; i++) {
      System.out.println(arrayInvertido[i]);
    }
  }

  // Método para invertir el orden de los elementos de un array
  public static int[] invertirArray(int[] array) {
    int[] arrayInvertido = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      arrayInvertido[array.length - i - 1] = array[i];
    }

    return arrayInvertido;
  }
}