import java.util.Scanner;

public class bucles1EjercicioFor4 {
  //Escribe un programa que cree un array de 50 elementos de tipo carácter, inicializándolo con una frase elegida. Luego, solicita al usuario un carácter objetivo y cuenta 
  //cuántas veces aparece ese carácter en el array. Finalmente, imprime el resultado por consola.

  //Por ejemplo, si el array contiene la siguiente frase:

  //a	p	r	e	n	d	i	e	n	d	o		j	a	v	a
  //y el usuario ingresa el carácter 'd', el programa debería devolver la siguiente salida:

  //El carácter "d" aparece 2 veces.

  //Si el usuario ingresa el carácter 'z', el programa debería devolver la siguiente salida:

  //El carácter "z" no aparece en la frase.
  public static void main(String[] args) {
    // Declarar un array de carácteres de 50 elementos
    char[] miArray = new char[50];

    // Inicializar el array con una frase elegida
    String frase = "aprendiendo java";
    System.out.println("frase escogida: " + frase);
    for (int i = 0; i < frase.length(); i++) {
      miArray[i] = frase.charAt(i);
    }

    // Solicitar al usuario un carácter objetivo
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un carácter objetivo: ");
    char caracterObjetivo = scanner.next().charAt(0);

    // Contar cuántas veces aparece el carácter objetivo en el array
    int contador = 0;
    for (int i = 0; i < miArray.length; i++) {
      if (miArray[i] == caracterObjetivo) {
        contador++;
      }
    }

    // Imprimir el resultado por consola
    if (contador > 0) {
      System.out.println("El carácter \"" + caracterObjetivo + "\" aparece " + contador + " veces.");
    } else {
      System.out.println("El carácter \"" + caracterObjetivo + "\" no aparece en la frase.");
    }
  }
}