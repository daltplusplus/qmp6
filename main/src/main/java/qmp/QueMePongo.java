package qmp;

import java.util.ArrayList;
import java.util.List;

public class QueMePongo {
  map<String , Object> alertas;
  List<Usuario> usuarios = new ArrayList<Usuario>();

  public List<Usuario> getUsuarios() {
    return usuarios;
  }

  public void actualizarAlerta(){
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    alertas = apiClima.getAlertas(“Buenos Aires”);

    usuarios.forEach(usuario -> usuario.actualizarSugerencia(alertas.get("currentAlerts")));

    if(alertas.get("currentAlerts").contains("Storm")){
      enviarMails("se alerta tormentas");
    }
    if(alerta.get("currentAlerts").contains("Hial")){
      enviarMails("se alerta granizo");
    }
  }

  public void enviarMails(String mensaje){
    MailSender mensajero;
    usuarios.stream().filter(usuarios -> usuarios.isQuieroMails()).forEach(usuario -> mensajero.send(usuario.direccionEmail, mensaje) );
  }

  public List<String> getAlertas(){
    return alertas.get("currentAlerts");
  }
}
