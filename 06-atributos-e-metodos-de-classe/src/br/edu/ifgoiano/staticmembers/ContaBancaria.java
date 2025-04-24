package br.edu.ifgoiano.staticmembers;

public class ContaBancaria {
  // Atributo de instância - cada conta tem seu próprio saldo
  private double saldo;

  // Atributo estático - todas as contas compartilham o mesmo total
  private static int totalContas = 0;

  public ContaBancaria() {
    totalContas++; // Incrementa o contador quando uma nova conta é criada
  }

  public static int getTotalContas() {
    return totalContas;
  }
}