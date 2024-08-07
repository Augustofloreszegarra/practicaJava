import java.util.Scanner;

public class metodos1Ejercicio4 {
  //En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número (incluida la lógica en un método llamado 
  //pedirNumero())  y luego imprime la tabla de multiplicar de ese número del 1 al 10 (incluida la lógica en un método llamado 
  //imprimirTablaMultiplicar()). Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprima la tabla de 
  //multiplicar correspondiente.

  public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);
    
    // Llamar al método pedirNumero() para solicitar al usuario que ingrese un número
    int numero = pedirNumero(scanner);
    
    // Llamar al método imprimirTablaMultiplicar() para imprimir la tabla de multiplicar correspondiente al número ingresado
    imprimirTablaMultiplicar(numero);
  }

  // Método para solicitar al usuario que ingrese un número
  public static int pedirNumero(Scanner scanner) {
    // Imprimir un mensaje solicitando al usuario que ingrese un número
    System.out.print("Ingrese un número: ");
    
    // Leer el número ingresado por el usuario
    int numero = scanner.nextInt();
    
    // Consumir el salto de línea después de nextInt() para asegurarnos de que el siguiente nextLine() funcione correctamente
    scanner.nextLine();
    
    // Devolver el número ingresado por el usuario
    return numero;
  }

  // Método para imprimir la tabla de multiplicar correspondiente a un número
  public static void imprimirTablaMultiplicar(int numero) {
    // Imprimir el encabezado de la tabla de multiplicar
    System.out.println("Tabla de multiplicar del " + numero + ":");
    
    // Iterar desde 1 hasta 10
    for (int i = 1; i <= 10; i++) {
      // Imprimir cada fila de la tabla de multiplicar
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }
  }
}