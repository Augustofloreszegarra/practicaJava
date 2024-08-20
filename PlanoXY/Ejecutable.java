package PlanoXY;

public class Ejecutable {

    public static void main(String[] args) {
        // Creamos algunos puntos
        Punto punto1 = new Punto(1, 2);
        Punto punto2 = new Punto(3, 4);
        Punto punto3 = new Punto(5, 6);

        // Calculamos la distancia desde el origen para cada punto
        System.out.println("Distancia desde el origen para el punto (" + punto1.getX() + ", " + punto1.getY() + "): " + punto1.distanciaDesdeOrigen());
        System.out.println("Distancia desde el origen para el punto (" + punto2.getX() + ", " + punto2.getY() + "): " + punto2.distanciaDesdeOrigen());
        System.out.println("Distancia desde el origen para el punto (" + punto3.getX() + ", " + punto3.getY() + "): " + punto3.distanciaDesdeOrigen());

        // Calculamos la distancia entre los puntos
        System.out.println("Distancia entre el punto (" + punto1.getX() + ", " + punto1.getY() + ") y el punto (" + punto2.getX() + ", " + punto2.getY() + "): " + Punto.calcularDistancia(punto1, punto2));

        // Determinamos si los puntos están alineados
        System.out.println("¿Están alineados los puntos (" + punto1.getX() + ", " + punto1.getY() + "), (" + punto2.getX() + ", " + punto2.getY() + ") y (" + punto3.getX() + ", " + punto3.getY() + ")? " + Punto.estanAlineados(punto1, punto2, punto3));
    }
}
