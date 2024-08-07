public class bucles1EjercicioFor2 {
  //Genera un array de 20 elementos de tipo float, inicializándolo con los números de tu elección. Luego, suma todos los 
  //elementos del array y calcula su promedio. Finalmente, muestra por consola tanto el resultado de la suma como el promedio 
  //de los elementos.Te sugerimos implementar el uso de la sintaxis de for-each.
  public static void main(String[] args) {
    // Declarar un array de float de 20 elementos
    float[] miArray = {1.5f, 2.7f, 3.2f, 4.9f, 5.6f, 6.3f, 7.8f, 8.4f, 9.1f, 10.7f, 11.2f, 12.5f, 13.8f, 14.3f, 15.9f, 16.6f, 17.0f, 18.4f, 19.7f, 20.2f};

    // Declarar variables para almacenar la suma y el promedio
    float suma = 0;
    float promedio;

    // Sumar todos los elementos del array
    for (float elemento : miArray) {
      suma += elemento;
    }

    // Calcular el promedio
    promedio = suma / miArray.length;

    // Mostrar el resultado de la suma y el promedio por consola
    System.out.println("Resultado de la suma: " + suma);
    System.out.println("Promedio de los elementos: " + promedio);
  }
}