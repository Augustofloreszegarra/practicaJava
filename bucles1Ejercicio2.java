public class bucles1Ejercicio2 {
  //Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array. 
  //El tamaño y los números  a contener pueden ser de tu elección.
  public static void main(String[] args) {
    // Declarar un array de enteros
    int[] miArray = {10, 20, 30, 40, 50};

    // Encontrar el valor mínimo presente en el array
    int minimo = miArray[0];
    for (int i = 1; i < miArray.length; i++) {
      if (miArray[i] < minimo) {
        minimo = miArray[i];
      }
    }

    // Imprimir el valor mínimo por consola
    System.out.println("El valor mínimo presente en el array es: " + minimo);
  }
}