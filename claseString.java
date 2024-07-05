import java.util.Scanner;

public class claseString {
    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
      
        /* //Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en 
        //pantalla su longitud utilizando el método length() de la clase String.
        System.out.println("Ingresa una oracion:");
        String texto = scanner.nextLine();
        int longitud = texto.length();
        System.out.println("La longitud de su oracion es: " + longitud); */


        /* //Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, 
        //y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String.
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        String nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("Su nombre completo es: " + nombreCompleto);
        scanner.close(); */
        
        
        /* //Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, que 
        //representen un índice inicial y un índice final. Utiliza el método substring() de la clase 
        //String para extraer la subcadena que se encuentra entre los índices ingresados por el usuario, 
        //y muestra la subcadena resultante en pantalla.
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingrese un numero entre el 1 y" + (frase.length() - 1) + ": ");
        int indiceInicial = scanner.nextInt();
        
        System.out.print("Ingrese un numero mayor a " + indiceInicial + "y menor que " + (frase.length() - 1) + ": ");
        int indiceFinal = scanner.nextInt();
        
        String subcadena = frase.substring(indiceInicial, indiceFinal);
        System.out.println("La subcadena es: " + subcadena);
        scanner.close(); */


        /* //Escribe un programa que pida al usuario ingresar una palabra y un carácter, y determine si el carácter 
        //ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String. Muestra un 
        //mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.}
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        System.out.print("Ingresa un la letra que desea buscar: ");
        char caracter = scanner.nextLine().charAt(0);

        System.out.println(palabra.indexOf(caracter) != -1 ? 
        "La letra se encuentra en la palabra." : "La letra no se encuentra en la palabra."); */



        /* //Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla la misma 
        //cadena, pero con todos los caracteres en mayúsculas o minúsculas. Utiliza los métodos toUpperCase() 
        //y toLowerCase() de la clase String para realizar la conversión.
        System.out.print("Ingrese la oracion a convertir mayuscula y minuscula: ");
        String texto = scanner.nextLine();
        
        String textoMayusculas = texto.toUpperCase();
        String textoMinusculas = texto.toLowerCase();
        
        System.out.println("Texto en mayúsculas: " + textoMayusculas);
        System.out.println("Texto en minúsculas: " + textoMinusculas);
        
        scanner.close(); */


        /* //1. Reemplazo de Caracteres
        //Escribe un programa que solicite al usuario ingresar una frase y dos caracteres. Utiliza el método 
        //replace() de la clase String para reemplazar todas las ocurrencias del primer carácter con el segundo 
        //carácter en la frase ingresada por el usuario. Muestra la frase resultante en pantalla.hola m,un
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        System.out.print("Ingrese letra a reemplazar: ");
        char primeraLetra = scanner.next().charAt(0);
        
        System.out.print("Ingrese el reemplazo: ");
        char letraRemplazo = scanner.next().charAt(0);
        
        String fraseReemplazada = frase.replace(primeraLetra, letraRemplazo);
        
        System.out.println("Frase con reemplazo: " + fraseReemplazada);
        
        scanner.close(); */


        /* //2. Eliminación de Espacios en Blanco
        //Crea un programa que solicite al usuario ingresar una frase con espacios en blanco al principio y al 
        //final. Utiliza el método trim() de la clase String para eliminar los espacios en blanco y luego muestra 
        //la frase resultante en pantalla.
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
                
        System.out.println("Frase sin espacios en blanco: " + frase.trim());
        
        scanner.close(); */


        /* //3. Comparación de Cadenas
        //Desarrolla un programa que solicite al usuario ingresar dos palabras. Utiliza el método equals() 
        //de la clase String para comparar si las dos palabras son iguales. Muestra un mensaje apropiado en 
        //pantalla indicando si las palabras son iguales o diferentes.
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();
        
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        
        System.out.println(palabra1.equals(palabra2) ? 
        "Las palabras son iguales." : "Las palabras son diferentes.");

        scanner.close(); */


        //4. Calculando la Longitud de Cadenas sin Espacios:
        //En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su longitud, pero 
        //esta vez sin contar los espacios en blanco. Para lograr esto, se utilizará el método length() de la 
        //clase String y se realizará un proceso adicional para excluir los espacios de la cuenta.
        System.out.print("Ingrese una oracion: ");
        String cadena = scanner.nextLine();
        int oracionConEspacios = cadena.length();
        System.out.println("Oracion con espacios: " + oracionConEspacios);
        int oracionSinEspacios = cadena.replace(" ", "").length();
        System.out.println("Oracion sin espacios: " + oracionSinEspacios);
        
        scanner.close();
    }
  }
}