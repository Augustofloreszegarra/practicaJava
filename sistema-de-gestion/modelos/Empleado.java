package sistema-de-gestion.modelos;

public class Empleado {
  private String nombre;
  private int edad;
  private double salario;
  private String departamento;

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public int getEdad() {
      return edad;
  }

  public void setEdad(int edad) {
      this.edad = edad;
  }

  public double getSalario() {
      return salario;
  }

  public void setSalario(double salario) {
      this.salario = salario;
  }

  public String getDepartamento() {
      return departamento;
  }

  public void setDepartamento(String departamento) {
      this.departamento = departamento;
  }
}