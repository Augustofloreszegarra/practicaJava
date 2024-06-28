import java.util.Scanner;

public class actividadIntegradora {
  /* public static void main(String[] args) {
    Scanner miScanner = new Scanner(System.in);
    int a;
    System.out.print("Ingresa un numero: ");
    a = miScanner.nextInt();
    System.out.println((a % 2) > 0  ? "es impar" : "es par");
    miScanner.close();
  } */
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Imprimir mensaje para solicitar al usuario que ingrese el número correspondiente a la operación
      System.out.println("Ingresa el número correspondiente a la operación:");
      System.out.println("1: Sumar");
      System.out.println("2: Restar");
      System.out.println("3: Multiplicar");
      System.out.println("4: Dividir");
      
      // Leer el número de operación del usuario
      int operacion = scanner.nextInt();
      
      // Solicitar al usuario que ingrese el primer número
      System.out.print("Ingresa el primer número: ");
      int numero1 = scanner.nextInt();
      
      // Solicitar al usuario que ingrese el segundo número
      System.out.print("Ingresa el segundo número: ");
      int numero2 = scanner.nextInt();
      
      // Determinar el resultado de la operación matemática
      String resultado = 
      // Si operacion es igual a 1, realiza la suma de numero1 y numero2
      (operacion == 1) ? "Resultado: " + (numero1 + numero2) :
      // Si operacion es igual a 2, realiza la resta de numero1 y numero2
      (operacion == 2) ? "Resultado: " + (numero1 - numero2) :
      // Si operacion es igual a 3, realiza la multiplicación de numero1 y numero2
      (operacion == 3) ? "Resultado: " + (numero1 * numero2) :
      // Si operacion es igual a 4, verifica si numero2 es diferente de cero y realiza 
      // la división de numero1 y numero2
      (operacion == 4) ? (numero2 != 0 ? "Resultado: " + (numero1 / numero2) : "Error: División por cero") :
      // Si ninguna de las condiciones anteriores se cumple, asigna la cadena 
      // "Operación no válida" a resultado
      "Operación no válida";
      
      // Imprimir el resultado de la operación matemática
      System.out.println(resultado);
    }
  }
}
