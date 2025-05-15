package br.edu.ifgoiano.polimorfismo.exercicio03;

public class NotificacaoSMS extends Notificacao {
  private String numeroTelefone;
  private boolean confirmacaoLeitura;

  // Implementar construtor e métodos específicos
  public NotificacaoSMS(String numeroTelefone, String destinatario, String mensagem, String dataEnvio) {
    super(destinatario, mensagem, dataEnvio);
    this.numeroTelefone = numeroTelefone;
  }

  public void enviar() {
    // TODO: Implementar a versão do método para SMS
  }

  public boolean validar() {
    // TODO: Implementar a versão do método para SMS
    return false;
  }
}