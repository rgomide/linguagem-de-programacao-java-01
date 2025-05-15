package br.edu.ifgoiano.polimorfismo.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {

  public static void main(String[] args) {
    Notificacao notificacaoEmail = new NotificacaoEmail(
        "Assunto 1",
        new String[] { "a@a.com", "b@b.com" },
        "a@a.com",
        "minha mensagem de email",
        "2025-05-15");

    Notificacao notificacaoPush = new NotificacaoPush(
        "111111",
        "ALTA",
        "987454546",
        "minha mensagem",
        "2025-05-11");

    Notificacao notificacaoSms = new NotificacaoSMS(
        "987654321",
        "987654789",
        "Olá",
        "2025-05-15");

    List<Notificacao> notificacoes = new ArrayList<Notificacao>();

    notificacoes.add(notificacaoEmail);
    notificacoes.add(notificacaoPush);
    notificacoes.add(notificacaoSms);

    for (Notificacao notificacao : notificacoes) {
      notificacao.enviar();
    }
  }

}
