package qmp;

public class Empleado {
  QueMePongo empresa;

  public void calcularSugerencias(){
    empresa.getUsuarios().forEach(usuario -> usuario.calcularSugerencia());
  }
}
