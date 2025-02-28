package br.com.gomide;

public class Carro {
  public String marca;
  public String modelo;
  public String cor;
  public int velocidade;

  public void acelerar(int velocidade) {
    this.velocidade += velocidade;
  }

  public void frear(int velocidade) {
    this.velocidade -= velocidade;
  }

  public void mostrarDetalhes() {
    System.out.println("Marca: " + marca + " Modelo: " + modelo + " Cor: " + cor + " Velocidade: " + velocidade);
  }
}