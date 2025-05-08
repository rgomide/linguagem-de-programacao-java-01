package br.edu.ifgoiano.heranca.exercicio05;

public class Produto {
  // Atributos
  private int codigo;
  private String nome;
  private double preco;

  // Construtores
  public Produto() {
    this.codigo = 0;
    this.nome = "";
    this.preco = 0;
  }

  public Produto(int codigo, String nome, double preco) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }

  // Métodos
  public void imprimirInformacoes() {
    System.out.println("Código: " + this.codigo);
    System.out.println("Nome: " + this.nome);
    System.out.println("Preço: " + this.preco);
  }

  // Getters e Setters
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

}