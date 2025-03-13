package br.com.gomide;

public class ContaBancaria {
  public Double saldo = 0.0;

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }
}
