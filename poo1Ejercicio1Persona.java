public class poo1Ejercicio1Persona {
  String nombre;
  int edad;

  public poo1Ejercicio1Persona() {}
  public poo1Ejercicio1Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public void imprimirDatos() {
    System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años");
  }
}
