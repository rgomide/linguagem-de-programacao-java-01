package br.edu.ifgoiano.heranca;

public class Animal {
  private String nome;
  private int idade;

  public Animal(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void emitirSom() {
    System.out.println("Animal emitindo som");
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }
}
