package br.edu.ifgoiano.polimorfismo.exercicio03;

public class NotificacaoEmail extends Notificacao {
  private String assunto;
  private String[] copias;

  // Implementar construtor e métodos específicos
  public NotificacaoEmail(String assunto, String[] copias, String destinatario, String mensagem, String dataEnvio) {
    super(destinatario, mensagem, dataEnvio);
    this.assunto = assunto;
    this.copias = copias;
  }

  @Override
  public boolean validar() {
    if (copias.length == 0) {
      return false;
    }

    // TODO: Verificar os outros critérios

    return true;
  }

  @Override
  public void enviar() {
    if (this.validar()) {
      String copias = "";

      for (String copia : this.copias) {
        copias += copia + " ";
      }

      System.out.println("\n\nEnviando email em " + this.dataEnvio);
      System.out.println("Assunto: " + this.assunto);
      System.out.println("Destinatário: " + this.destinatario);
      System.out.println("Cópias: " + copias);
      System.out.println("Mensagem: " + this.mensagem);
    } else {
      System.out.println("Email configurado de forma inválida!!!");
    }

  }
}
