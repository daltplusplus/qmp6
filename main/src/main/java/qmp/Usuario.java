package qmp;

public class Usuario {
  String direccionEmail;
  QueMePongo qmp;
  Sugerencia sugerenciaDiaria;
  boolean quieroRecalculo;
  boolean quieroNotificaciones;
  boolean quieroMails;

  public void actualizar(list<String> alertas){
    if (quieroRecalculo) {
      nuevaSugerencia(alertas);
    }
    if(quieroNotificaciones) {
      recibirNotificaciones(alertas);
    }
  }

  public void verAlertas(){
    qmp.getAlertas().forEach(alerta -> System.out.println(alerta));
  }

  public void recibirNotificaciones(list<String> alertas){
    if(alertas.contains("STORM")){
      new notificationService().notify("lleve paraguas");
    }
    if(alertas.contains("HAIl")){
      new notificationService().notify("evite salir en auto")
    }
  }

  public String getDireccionEmail() {
    return direccionEmail;
  }

  public Sugerencia calcularSugerencia(){

  }

  public void nuevaSugerencia(){
    sugerenciaDiaria = calcularSugerencia()
  }

  public boolean isQuieroMails() {
    return quieroMails;
  }
}
