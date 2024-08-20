package PlanoXY;

public class Punto {

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double x;
    private double y;

    // Getter y setter para x
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Getter y setter para y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método de instancia para calcular la distancia desde el origen
    public double distanciaDesdeOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Método estático para calcular la distancia entre dos puntos
    public static double calcularDistancia(Punto punto1, Punto punto2) {
        return Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }

    // Método estático para determinar si tres puntos están alineados
    public static boolean estanAlineados(Punto punto1, Punto punto2, Punto punto3) {
        // Calculamos las pendientes entre los puntos
        double pendiente12 = (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
        double pendiente23 = (punto3.getY() - punto2.getY()) / (punto3.getX() - punto2.getX());

        // Si las pendientes son iguales, los puntos están alineados
        return pendiente12 == pendiente23;
    }
}
