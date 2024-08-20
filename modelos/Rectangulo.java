package modelos;

import java.util.Scanner;

public class Rectangulo {

    private double ancho;
    private double alto;

    // Constructor con todos los parámetros
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Constructor sin parámetros
    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
    }

    // Métodos getter y setter
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    // Método para calcular el área
    public double area() {
        return ancho * alto;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    // Método para imprimir los datos del rectángulo
    public void imprimirDatos() {
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Rectangulo rectangulo;

            while (true) {
                System.out.println("Menú interactivo para crear instancias de Rectangulo");
                System.out.println("1. Crear un rectángulo con todos los parámetros");
                System.out.println("2. Crear un rectángulo sin parámetros");
                System.out.println("3. Salir");

                System.out.print("Ingrese su opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el ancho: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Ingrese el alto: ");
                        double alto = scanner.nextDouble();
                        rectangulo = new Rectangulo(ancho, alto);
                        rectangulo.imprimirDatos();
                    }
                    case 2 -> {
                        rectangulo = new Rectangulo();
                        rectangulo.imprimirDatos();
                    }
                    case 3 -> {
                        System.out.println("Adiós");
                        return;
                    }
                    default ->
                        System.out.println("Opción inválida");
                }
            }
        }
    }
}
