import java.util.Random;

public class bucles1EjercicioFor1 {
  //Escribe un programa que genere un array de 10 elementos de tipo entero. Inicializa cada elemento con un 
  //número aleatorio menor a 100 y luego imprime todos los elementos del array en una única línea. 
  //Posteriormente, recorre el array para contar los elementos pares y muestra el total en la consola.
  public static void main(String[] args) {
    // Declarar un array de enteros de 10 elementos
    int[] miArray = new int[10];

    // Inicializar un objeto Random para generar números aleatorios
    Random random = new Random();

    // Inicializar cada elemento del array con un número aleatorio menor a 100
    for (int i = 0; i < miArray.length; i++) {
      miArray[i] = random.nextInt(100);
    }

    // Imprimir todos los elementos del array en una única línea
    System.out.println("Elementos del array: " + java.util.Arrays.toString(miArray));

    // Recorrer el array para contar los elementos pares
    int totalPares = 0;
    for (int i = 0; i < miArray.length; i++) {
      if (miArray[i] % 2 == 0) {
        totalPares++;
      }
    }

    // Mostrar el total de elementos pares en la consola
    System.out.println("Total de elementos pares: " + totalPares);
  }
}
