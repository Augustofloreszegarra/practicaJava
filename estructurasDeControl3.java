import java.util.InputMismatchException;
import java.util.Scanner;

public class estructurasDeControl3 {
  public static void main(String[] args) {
    
    try (Scanner scanner = new Scanner(System.in)) {

      /* //Escribe un programa que pida al usuario que ingrese dos números 
      //enteros y realice la división del primer número entre el segundo 
      //número. Implementa un bloque "try-catch" para manejar la excepción 
      //en caso de que se intente realizar una división por cero. En caso de 
      //que ocurra la excepción, muestra un mensaje apropiado en la pantalla.
      try {
        System.out.print("Ingrese el primer numero a dividir: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero a dividir: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 / numero2;
        System.out.println("El resultado de la division es: " + resultado);
      } catch (ArithmeticException e) {
        System.out.println("No se puede dividir por cero.");
      } catch (InputMismatchException e) {
        System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
      } finally {
        scanner.close();
      } */


      /* //Escribe un programa que solicite al usuario ingresar dos números. Luego, 
      //realiza la resta del primer número menos el segundo número. Implementa un 
      //bloque "try-catch" para manejar las excepciones que puedan surgir en caso de 
      //que el usuario no ingrese números. En caso de que se produzca una excepción, 
      //muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción, 
      //muestra el resultado de la resta.
      try {
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);

      } catch (InputMismatchException e) {
          System.out.println("Error: Debes ingresar números enteros.");
      } finally {
          scanner.close();
      } */


      /* //Escribe un programa que solicite al usuario ingresar una cadena de caracteres 
      //que represente un número entero. Utiliza el método Integer.parseInt() para 
      //convertir la cadena en un número entero. Implementa un bloque "try-catch" para 
      //manejar la excepción en caso de que la cadena ingresada no pueda ser convertida 
      //en un número entero. En caso de que se produzca la excepción, muestra un mensaje 
      //apropiado en la pantalla.
      try {
        System.out.print("Ingrese un número entero: ");
        String input = scanner.nextLine();

        int numero = Integer.parseInt(input);
        System.out.println("El número entero ingresado es: " + numero);
      } catch (NumberFormatException e) {
        System.out.println("Error: No puede ser convertida a un número entero.");
      } finally {
        scanner.close();
      } */
    }
  } 
}
