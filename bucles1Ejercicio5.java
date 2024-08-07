public class bucles1Ejercicio5 {
  //Escribe un programa que recorra un array de enteros y  calcule la suma acumulada de los elementos, 
  //reemplazando cada elemento por la suma acumulada hasta ese punto.El tamaño y los números  a contener 
  //pueden ser de tu elección.

  public static void main(String[] args) {
    // Declarar un array de enteros
    int[] miArray = {10, 20, 30, 40, 50};

    // Calcular la suma acumulada de los elementos del array
    calcularSumaAcumulada(miArray);

    // Imprimir el array resultante por consola
    System.out.println("El array con la suma acumulada es:");
    for (int i = 0; i < miArray.length; i++) {
      System.out.println(miArray[i]);
    }
  }

  // Método para calcular la suma acumulada de los elementos de un array
  public static void calcularSumaAcumulada(int[] array) {
    int sumaAcumulada = 0;

    for (int i = 0; i < array.length; i++) {
      sumaAcumulada += array[i];
      array[i] = sumaAcumulada;
    }
  }
}