
public class debuggerEjercicio1 {

    public static void main(String[] args) {
        // Define el array de números
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Inicializa la variable para almacenar la suma
        int suma = 0;

        // Utiliza un bucle for para iterar a través del array
        for (int i = 0; i < numeros.length; i++) {
            // Suma cada número al total
            suma += numeros[i];
        }

        // Imprime el resultado
        System.out.println("La suma de los números es: " + suma);
    }
}
