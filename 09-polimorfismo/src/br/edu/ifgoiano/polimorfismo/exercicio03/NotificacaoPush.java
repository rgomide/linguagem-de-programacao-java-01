package br.edu.ifgoiano.polimorfismo.exercicio03;

public class NotificacaoPush extends Notificacao {
  private String dispositivo;
  private String prioridade;

  // Implementar construtor e métodos específicos
  public NotificacaoPush(String dispositivo, String prioridade, String destinatario, String mensagem,
      String dataEnvio) {
    super(destinatario, mensagem, dataEnvio);
    this.dispositivo = dispositivo;
    this.prioridade = prioridade;
  }

  public void enviar() {
    // TODO: Implementar a versão do método para Push
  }

  public boolean validar() {
    // TODO: Implementar a versão do método para Push
    return false;
  }
}
