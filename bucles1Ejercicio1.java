public class bucles1Ejercicio1 {
  //Escribe un programa que recorra un array de enteros y muestre cada elemento en una línea separada. El 
  //tamaño, tipo de datos y la información a contener pueden ser de tu elección.
  
  public static void main(String[] args) {
    // Declarar un array de enteros
    int[] miArray = {10, 20, 30, 40, 50};

    // Recorrer el array y mostrar cada elemento en una línea separada
    for (int i = 0; i < miArray.length; i++) {
      System.out.println(miArray[i]);
    }
  }
}