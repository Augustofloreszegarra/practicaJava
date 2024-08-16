

public class Poo1Ejercicio2Auto {

    String marca;
    String modelo;
    int año;
    // Constructor vacío

    public Poo1Ejercicio2Auto() {
    }

    // Constructor que inicialice marca, modelo y año
    public Poo1Ejercicio2Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    // Constructor que inicialice marca y modelo

    public Poo1Ejercicio2Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    // Constructor que inicialice solo marca

    public Poo1Ejercicio2Auto(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Método imprimirDatospublic void imprimirDatos() {
    public void imprimirDatos() {
        if (marca != null && modelo != null && año != 0) {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + año);
        } else if (marca != null && modelo != null) {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("No se ha inicializado el año");
        } else if (marca != null) {
            System.out.println("Marca: " + marca);
            System.out.println("No se ha inicializado el modelo");
            System.out.println("No se ha inicializado el año");
        } else {
            System.out.println("No se ha inicializado la marca");
            System.out.println("No se ha inicializado el modelo");
            System.out.println("No se ha inicializado el año");
        }
    }
}
