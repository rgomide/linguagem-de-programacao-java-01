package br.edu.ifgoiano.staticmembers;

public class Produto {
  // Atributos de instância
  private String nome;
  private double preco;

  // Atributos estáticos
  private static int totalProdutos = 0;
  private static double valorTotalEstoque = 0.0;

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
    totalProdutos++;
    valorTotalEstoque += preco;
  }

  // Métodos de instância
  public void aplicarDesconto(double percentual) {
    double desconto = preco * (percentual / 100);
    valorTotalEstoque -= desconto;
    preco -= desconto;
  }

  // Métodos estáticos
  public static int getTotalProdutos() {
    return totalProdutos;
  }

  public static double getValorTotalEstoque() {
    return valorTotalEstoque;
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
