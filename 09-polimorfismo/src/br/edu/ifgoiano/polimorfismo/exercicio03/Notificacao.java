package br.edu.ifgoiano.polimorfismo.exercicio03;

public class Notificacao {
  protected String destinatario;
  protected String mensagem;
  protected String dataEnvio;

  public Notificacao(String destinatario, String mensagem, String dataEnvio) {
    this.destinatario = destinatario;
    this.mensagem = mensagem;
    this.dataEnvio = dataEnvio;
  }

  public void enviar() {
    System.out.println("Enviando notificação genérica");
  }

  public boolean validar() {
    return true;
  }
}