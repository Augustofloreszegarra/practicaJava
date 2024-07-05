import java.util.Scanner;

public class estructurasDeControl1 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      
      /* // Solicitar al usuario que ingrese un número entre 0 y 100
      System.out.println("Ingrese un número entre 0 y 100: ");
      int numero = scanner.nextInt();
        
      // Validar si el número ingresado está dentro del rango válido
      if(numero >= 0 && numero <= 100) {
        // Asignar la calificación correspondiente según la escala
        String calificacion;
            
        if(numero >= 90) {
          calificacion = "A";
        } else if(numero >= 80) {
          calificacion = "B";
        } else if(numero >= 70) {
          calificacion = "C";
        } else if(numero >= 60) {
          calificacion = "D";
        } else {
          calificacion = "F";
        }
        // Mostrar la calificación obtenida en la consola
        System.out.println("La calificación obtenida es: " + calificacion);
      } else {
        // Informar al usuario que el número ingresado está fuera del rango válido
        System.out.println("El número ingresado está fuera del rango válido (0 - 100).");
      }
      
      // Cerrar el objeto Scanner
      scanner.close(); */


      
      /* System.out.println("Ingrese un número: ");
      int numero = scanner.nextInt();
      if(numero % 5 == 0 && numero % 3 == 0) {
        System.out.println("El número es divisible por 5 y por 3.");
      } else if(numero % 5 == 0) {
        System.out.println("El número es divisible por 5 pero no por 3.");
      } else if(numero % 3 == 0) {
        System.out.println("El número es divisible por 3 pero no por 5.");
      } else {
        System.out.println("El número no es divisible ni por 5 ni por 3.");
      }
      scanner.close(); */



      /* //(1. Verificación de Contraseña:)
      // Definir la contraseña predefinida
      String contrasenaPredefinida = "prueba123";
        
      // Solicitar al usuario que ingrese la contraseña   
      System.out.println("Ingrese la contraseña: ");
      String contrasenaIngresada = scanner.nextLine();
      
      // Verificar si la contraseña ingresada coincide con la predefinida
      if(contrasenaIngresada.equals(contrasenaPredefinida)) {
          System.out.println("Acceso concedido");
      } else {
          System.out.println("Acceso denegado");
      }
      scanner.close(); */



      /* //(2. Cálculo de Descuento:)
      System.out.println("Ingrese el precio del producto: ");
      double precio = scanner.nextDouble();
      
      // Verificar si el precio es igual o mayor a $100
      if(precio >= 100) {
          double descuento = precio * 0.1; // Aplicar un descuento del 10%
          double precioConDescuento = precio - descuento;
          
          System.out.println("El precio con descuento es: $" + precioConDescuento);
      } else {
          System.out.println("El precio original sin descuento es: $" + precio);
      }
      scanner.close(); */


      
      //(3. Determinación de Edades)
      System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        // Determinar la categoría de edad
        if(edad < 18) {
            System.out.println("Eres menor de edad");
        } else if(edad >= 18 && edad <= 64) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
        scanner.close();
    }
  }
}
