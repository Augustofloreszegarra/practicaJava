import java.util.Scanner;

public class estructurasDeControl2 {
  public static void main(String[] args) {
    
      try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese un número del 1 al 7 para representar un día de la semana: ");
        int diaSemana = scanner.nextInt();
          
        switch (diaSemana) {
          case 1 -> System.out.println("El día correspondiente al número " + diaSemana + " es Lunes.");
          case 2 -> System.out.println("El día correspondiente al número " + diaSemana + " es Martes.");
          case 3 -> System.out.println("El día correspondiente al número " + diaSemana + " es Miércoles.");
          case 4 -> System.out.println("El día correspondiente al número " + diaSemana + " es Jueves.");
          case 5 -> System.out.println("El día correspondiente al número " + diaSemana + " es Viernes.");
          case 6 -> System.out.println("El día correspondiente al número " + diaSemana + " es Sábado.");
          case 7 -> System.out.println("El día correspondiente al número " + diaSemana + " es Domingo.");
          default -> System.out.println("El número ingresado no es válido. Por favor, ingrese un número del 1 al 7.");
        }
      }


      /* try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese una calificación numérica del 1 al 5: ");
        int calificacion = scanner.nextInt();
            
        switch (calificacion) {
          case 1 -> System.out.println("La calificación ingresada es: Muy deficiente");
          case 2 -> System.out.println("La calificación ingresada es: Deficiente");
          case 3 -> System.out.println("La calificación ingresada es: Suficiente");
          case 4 -> System.out.println("La calificación ingresada es: Notable");
          case 5 -> System.out.println("La calificación ingresada es: Sobresaliente");
          default -> System.out.println("La calificación ingresada no es válida. Por favor, ingrese un número del 1 al 5.");
        }
      } */


      /* try (Scanner scanner = new Scanner(System.in)) {
        while (true) {
          System.out.println("Menú:");
          System.out.println("1. Guardar");
          System.out.println("2. Cargar");
          System.out.println("3. Salir");
          System.out.print("Ingrese una opción del 1 al 3: ");

          int opcion = scanner.nextInt();

          switch (opcion) {
            case 1 -> System.out.println("Opción seleccionada: Guardar");
            case 2 -> System.out.println("Opción seleccionada: Cargar");
            case 3 -> {
              System.out.println("Opción seleccionada: Salir");
              return;
            }
            default -> System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 3.");
          }
          break;
        }
      } */


      /* try (Scanner scanner = new Scanner(System.in)) {
        while (true) {
          System.out.println("Seleccione una figura geométrica:");
          System.out.println("1. Círculo");
          System.out.println("2. Cuadrado");
          System.out.println("3. Triángulo");
          System.out.print("Ingrese una opción del 1 al 3: ");

          int figura = scanner.nextInt();

          switch (figura) {
              case 1 -> {
                  System.out.print("Ingrese el radio del círculo: ");
                  double radio = scanner.nextDouble();
                  double areaCirculo = Math.PI * Math.pow(radio, 2);
                  System.out.println("El área del círculo es: " + areaCirculo);
                  break;
              }
              case 2 -> {
                  System.out.print("Ingrese el lado del cuadrado: ");
                  double lado = scanner.nextDouble();
                  double areaCuadrado = Math.pow(lado, 2);
                  System.out.println("El área del cuadrado es: " + areaCuadrado);
                  break;
              }
              case 3 -> {
                  System.out.print("Ingrese la base del triángulo: ");
                  double base = scanner.nextDouble();
                  System.out.print("Ingrese la altura del triángulo: ");
                  double altura = scanner.nextDouble();
                  double areaTriangulo = (base * altura) / 2;
                  System.out.println("El área del triángulo es: " + areaTriangulo);
                  break;
              }
              default -> System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 3.");
          }
          break;
        }
      } */

      /* try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese un número del 1 al 7, representando un día de la semana: ");
        int dia = scanner.nextInt();

        switch (dia) {
          case 1, 2, 3, 4, 5 -> System.out.println("El día ingresado es hábil.");
          case 6, 7 -> System.out.println("El día ingresado no es hábil.");
          default -> System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 7.");
        }  
      } */

      /* try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Calculadora de Área y Perímetro");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.print("Elija una figura (1 para Círculo, 2 para Rectángulo): ");
        int figura = scanner.nextInt();

        String figuraStr = switch (figura) {
          case 1 -> "Círculo";
          case 2 -> "Rectángulo";
          default -> {
            System.out.println("Opción inválida. Por favor, elija 1 para Círculo o 2 para Rectángulo.");
            yield "";
          }
        };

        if (!figuraStr.isEmpty()) {
          System.out.print("¿Desea calcular el área o el perímetro? (Escriba 'area' o 'perimetro'): ");
          String operacion = scanner.next();

          double resultado = switch (figura) {
            case 1 -> {
              System.out.print("Ingrese el radio del círculo: ");
              double radio = scanner.nextDouble();
              yield operacion.equals("area") ? Math.PI * Math.pow(radio, 2) : 2 * Math.PI * radio;
            }
            case 2 -> {
              System.out.print("Ingrese la base del rectángulo: ");
              double base = scanner.nextDouble();
              System.out.print("Ingrese la altura del rectángulo: ");
              double altura = scanner.nextDouble();
              yield operacion.equals("area") ? base * altura : 2 * (base + altura);
            }
            default -> 0.0;
          };

          if (resultado != 0.0) {
            System.out.println("El " + operacion + " de " + figuraStr + " es: " + resultado);
          }
        }  
      } */
    }
  }
