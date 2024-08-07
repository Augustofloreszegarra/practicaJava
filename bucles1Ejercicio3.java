public class bucles1Ejercicio3 {
  //bucles1Ejercicio1Escribe un programa que recorra un array de enteros y los imprima en orden inverso, 
  //comenzando desde el último elemento.. El tamaño y los números  a contener pueden ser de tu elección.
  public static void main(String[] args) {
    // Declarar un array de enteros
    int[] miArray = {10, 20, 30, 40, 50};

    // Imprimir los elementos del array en orden inverso
    for (int i = miArray.length - 1; i >= 0; i--) {
      System.out.println(miArray[i]);
    }
  }
}