package br.edu.ifgoiano.polimorfismo;

public class Forma {
  protected String nome;

  public Forma(String nome) {
    this.nome = nome;
  }

  public void desenhar() {
    System.out.println("Desenhando uma forma genérica");
  }
}