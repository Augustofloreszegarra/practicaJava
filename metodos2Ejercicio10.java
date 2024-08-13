
import java.util.Scanner;

public class metodos2Ejercicio10 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Bucle infinito para mantener el menú activo hasta que el usuario decida salir
            while (true) {
                // Mostramos el menú principal
                System.out.println("Menú principal");
                System.out.println("1. Círculo");
                System.out.println("2. Triángulo");
                System.out.println("3. Paralelogramo");
                System.out.println("4. Salir");
                System.out.print("Ingrese su opción: ");
                int opcion = scanner.nextInt();

                // Usamos un switch para determinar qué acción realizar según la opción elegida
                switch (opcion) {
                    case 1 -> {
                        // Menú para calcular el perímetro y área de un círculo
                        System.out.println("Menú círculo");
                        System.out.println("1. Perímetro");
                        System.out.println("2. Área");
                        System.out.print("Ingrese su opción: ");
                        int opcionCirculo = scanner.nextInt();

                        switch (opcionCirculo) {
                            case 1 -> {
                                // Calculamos el perímetro del círculo
                                System.out.print("Ingrese el radio del círculo: ");
                                double radio = scanner.nextDouble();
                                double perimetroCirculo = 2 * Math.PI * radio;
                                System.out.println("El perímetro del círculo es: " + perimetroCirculo);
                            }
                            case 2 -> {
                                // Calculamos el área del círculo
                                System.out.print("Ingrese el radio del círculo: ");
                                double radio = scanner.nextDouble();
                                double areaCirculo = Math.PI * Math.pow(radio, 2);
                                System.out.println("El área del círculo es: " + areaCirculo);
                            }
                            default ->
                                System.out.println("Opción inválida");
                        }
                    }

                    case 2 -> {
                        // Menú para calcular el perímetro y área de un triángulo
                        System.out.println("Menú triángulo");
                        System.out.println("1. Perímetro");
                        System.out.println("2. Área");
                        System.out.print("Ingrese su opción: ");
                        int opcionTriangulo = scanner.nextInt();

                        switch (opcionTriangulo) {
                            case 1 -> {
                                // Calculamos el perímetro del triángulo
                                System.out.print("Ingrese la longitud del lado a: ");
                                double a = scanner.nextDouble();
                                System.out.print("Ingrese la longitud del lado b: ");
                                double b = scanner.nextDouble();
                                System.out.print("Ingrese la longitud del lado c: ");
                                double c = scanner.nextDouble();
                                double perimetroTriangulo = a + b + c;
                                System.out.println("El perímetro del triángulo es: " + perimetroTriangulo);
                            }
                            case 2 -> {
                                // Calculamos el área del triángulo
                                System.out.print("Ingrese la base del triángulo: ");
                                double base = scanner.nextDouble();
                                System.out.print("Ingrese la altura del triángulo: ");
                                double altura = scanner.nextDouble();
                                double areaTriangulo = (base * altura) / 2;
                                System.out.println("El área del triángulo es: " + areaTriangulo);
                            }
                            default ->
                                System.out.println("Opción inválida");
                        }
                    }

                    case 3 -> {
                        // Menú para calcular el perímetro y área de un paralelogramo
                        System.out.println("Menú paralelogramo");
                        System.out.println("1. Perímetro");
                        System.out.println("2. Área");
                        System.out.print("Ingrese su opción: ");
                        int opcionParalelogramo = scanner.nextInt();

                        switch (opcionParalelogramo) {
                            case 1 -> {
                                // Calculamos el perímetro del triángulo
                                System.out.print("Ingrese la longitud del lado a: ");
                                double a = scanner.nextDouble();
                                System.out.print("Ingrese la longitud del lado b: ");
                                double b = scanner.nextDouble();
                                System.out.print("Ingrese la longitud del lado c: ");
                                double c = scanner.nextDouble();
                                double perimetroTriangulo = a + b + c;
                                System.out.println("El perímetro del triángulo es: " + perimetroTriangulo);
                            }
                            case 2 -> {
                                // Calculamos el área del triángulo
                                System.out.print("Ingrese la base del triángulo: ");
                                double base = scanner.nextDouble();
                                System.out.print("Ingrese la altura del triángulo: ");
                                double altura = scanner.nextDouble();
                                double areaTriangulo = (base * altura) / 2;
                                System.out.println("El área del triángulo es: " + areaTriangulo);
                            }
                            default ->
                                System.out.println("Opción inválida");
                        }
                    }

                    case 4 -> {
                        // Salimos del programa
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
