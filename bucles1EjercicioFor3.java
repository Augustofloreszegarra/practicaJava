public class bucles1EjercicioFor3 {
  //Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena los elementos en una sola 
  //cadena, separados por espacios, e imprime el resultado por consola.
  public static void main(String[] args) {
    // Declarar un array de cadenas de tamaño deseado
    String[] miArray = {"Hola", "mundo", "¡Hola", "nuevamente!", "¡Adiós!"};

    // Declarar una variable para almacenar la cadena resultante
    String cadenaResultante = "";

    // Concatenar los elementos del array en una sola cadena separados por espacios
    for (String elemento : miArray) {
      cadenaResultante += elemento + " ";
    }

    // Eliminar el espacio extra al final de la cadena
    cadenaResultante = cadenaResultante.trim();

    // Mostrar el resultado por consola
    System.out.println("Cadena resultante: " + cadenaResultante);
  }
}