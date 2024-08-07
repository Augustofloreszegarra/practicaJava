import java.util.Scanner;

public class metodos1Ejercicio1 {
  public static void main(String[] args) {
    Scanner pepe = new Scanner(System.in);
    System.out.println("Por favor ingrese un nombre:");
    String nombre = pepe.nextLine();
    System.out.println("Por favor ingrese una edad:");
    int edad = pepe.nextInt();
    imprimeNombre(nombre);
    imprimirNombreYEdad(nombre, edad);
  }
  //Imprimir nombre:  Crea un método llamado imprimeNombre() que reciba por parámetro un nombre y luego imprima el mensaje 
  //"Mi nombre es [nombre]". Invocar dicho método desde el método main para ver el mensaje por consola

  //Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y 
  //la edad, y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".

  public static void imprimeNombre(String nombre) {
    System.out.println("Mi nombre es " + nombre);
  }

  public static void imprimirNombreYEdad(String nombre, int edad) {
    System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
  }
}
