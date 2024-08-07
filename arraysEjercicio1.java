public class arraysEjercicio1 {
  public static void main(String[] args) {
    //Escribe un programa en el cual se cree una variable de tipo array que contenga tres 
    //elementos de tipo entero. El programa debe sumar los tres elementos de forma manual e 
    //imprimir por consola el resultado utilizando solamente las herramientas adquiridas hasta el momento.
    // Declarar el array
    int[] miArray = new int[3];

    // Inicializar los elementos del array
    miArray[0] = 10;
    miArray[1] = 20;
    miArray[2] = 30;

    // Declarar una variable para almacenar la suma
    int suma = 0;

    // Sumar los elementos del array de forma manual
    suma = miArray[0] + miArray[1] + miArray[2];

    // Imprimir el resultado por consola
    System.out.println("La suma de los elementos del array es: " + suma);
  }
}