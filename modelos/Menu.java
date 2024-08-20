package modelos;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean salir = false;

            while (!salir) {
                System.out.println("Menú de figuras geométricas");
                System.out.println("1. Rectangulo");
                System.out.println("2. Triángulo");
                System.out.println("3. Círculo");
                System.out.println("4. Salir");

                System.out.print("Ingrese su opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el ancho del rectángulo: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Ingrese el alto del rectángulo: ");
                        double alto = scanner.nextDouble();

                        Rectangulo rectangulo = new Rectangulo(ancho, alto);
                        rectangulo.imprimirDatos();
                    }
                    case 2 -> {
                        System.out.print("Ingrese la base del triángulo: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese la altura del triángulo: ");
                        double altura = scanner.nextDouble();

                        Triangulo triangulo = new Triangulo(base, altura);
                        triangulo.imprimirDatos();
                    }
                    case 3 -> {
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = scanner.nextDouble();

                        Circulo circulo = new Circulo(radio);
                        circulo.imprimirDatos();
                    }
                    case 4 ->
                        salir = true;
                    default ->
                        System.out.println("Opción inválida. Por favor, inténtelo de nuevo.");
                }
            }
        }
    }
}
