
public class metodos2Ejercicio5 {
    // Método para generar un número aleatorio entre 1 y 355

    public static int numeroAleatorio() {
        // Utilizar el método random() de la clase Math para generar un número aleatorio
        // y multiplicarlo por 355 para obtener un número entre 0 y 354
        // Luego, sumar 1 para obtener un número entre 1 y 355
        int numero = (int) Math.floor(Math.random() * 355) + 1;
        return numero;
    }

    public static void main(String[] args) {
        // Generar y mostrar en pantalla un número aleatorio
        int numero = numeroAleatorio();
        System.out.println("El número aleatorio es: " + numero);
    }
}
