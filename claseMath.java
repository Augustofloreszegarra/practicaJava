import java.util.Scanner;

public class claseMath {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      /* //Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor 
      //absoluto utilizando el método abs() de la clase Math.
      System.out.print("Ingrese un número entero: ");
      int numero = scanner.nextInt();
      int valorAbsoluto = Math.abs(numero);
      System.out.println("El valor absoluto del número ingresado es: " + valorAbsoluto); */


      /* //Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor 
      //redondeado utilizando el método round() de la clase Math.
      System.out.print("Ingrese un número decimal: ");
      double numeroDecimal = scanner.nextDouble();
      double numeroRedondeado = Math.round(numeroDecimal);
      System.out.println("El valor redondeado es: " + numeroRedondeado); */


      /* //Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango 
      //del 1 al 355  utilizando el método random() de la clase Math. Puedes utilizar el 
      //método floor() para redondear el número aleatorio hacia abajo.
      // Generar un número aleatorio en el rango del 1 al 355
      int numero = (int) (Math.random() * (355-1+1)) + 1;
      // Redondear hacia abajo utilizando el método floor()
      int numeroRedondeado = (int) Math.floor(numero);
      System.out.println("Número: " + numeroRedondeado); */
   

      /* //Escribe un programa que pida al usuario dos números enteros, representando la base y el 
      //exponente, y calcula el resultado de elevar la base al exponente utilizando el 
      //método pow() de la clase Math. Muestra el resultado en pantalla.
      System.out.println("Calcula el resultado de elevar la base al exponente");
      System.out.print("Ingrese la base: ");
      int base = scanner.nextInt();
      System.out.print("Ingrese el exponente: ");
      int exponente = scanner.nextInt();
      double resultado = Math.pow(base, exponente);
      System.out.println("El resultado de elevar " + base + " a la potencia " 
      + exponente + " es: " + Math.round(resultado)); */


      /* //Escribe un programa que pida al usuario un número positivo y calcule su raíz cuadrada 
      //utilizando el método sqrt() de la clase Math. Si el número ingresado es negativo, muestra 
      //un mensaje adecuado en pantalla.
      System.out.print("Ingrese un número positivo: ");
      double numero = scanner.nextDouble();
      if (numero >= 0) {
          double raizCuadrada = Math.sqrt(numero);
          System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
      } else {
          System.out.println("El número ingresado debe ser positivo.");
      }
      scanner.close(); */


      /* //Escribe un programa que pida al usuario ingresar dos números enteros: un límite inferior 
      //y un límite superior. Luego, utiliza el método random() de la clase Math para generar y 
      //mostrar en pantalla un número aleatorio dentro del rango especificado por los límites ingresados.
      System.out.print("Ingrese el límite inferior: ");
      int limiteInferior = scanner.nextInt();
      System.out.print("Ingrese el límite superior: ");
      int limiteSuperior = scanner.nextInt();
      int numero = (int) (Math.random() * (limiteSuperior-limiteInferior+1)) + limiteInferior;
      int numeroRedondeado = (int) Math.floor(numero);
      System.out.println("Número aleatoep: " + numeroRedondeado); */


      //Escribe un programa que cumpla con las siguientes condiciones:
      //Pide al usuario que ingrese un número entre 1 y 30. Este número será almacenado en una variable llamada numeroLimite .
      //Utiliza la clase Math para generar un número aleatorio entre 1 y el numeroLimite recibido del usuario.
      //Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número aleatorio generado y muéstralo en pantalla.
      //Analiza si el número aleatorio generado es primo y muestra un mensaje en pantalla indicando si lo es o no.
      //Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla.
      System.out.print("Ingrese un número positivo entre el 1 y el 30: ");
      int numeroLimite = scanner.nextInt();
      int numero = (int) (Math.random() * (numeroLimite-1+1)) + 1;
      int numeroRedondeado = (int) Math.floor(numero);
      System.out.println("Número aleatoep: " + numeroRedondeado);
      System.out.println("Raíz cuadrada del número aleatorio generado es: " + Math.sqrt(numeroRedondeado));
    }
  }
}